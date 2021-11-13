package guru.qa;

public class Seance {
    int tickets_sold = 0;
    int number_of_seats;
    int ticket_cost;
    Film film;

    static class Film {
        int duration;
        String filmTitle;
        public Film(String filmTitleT, int duration){
            this.filmTitle = filmTitleT;
            this.duration = duration;
        }

        public String getFilmsInvitation(){
            return "Текущий сеанс " + filmTitle;
        }
    }

    public Seance(int duration, int i_number_of_seats, String i_movie_name, int i_ticket_cost) {
        film = new Film(i_movie_name, duration);
        number_of_seats = i_number_of_seats;
        ticket_cost = i_ticket_cost;
        System.out.printf("Начинается продажа билетов на сеанс %s, количество мест %d, цена билета %d\n",
                film.filmTitle, number_of_seats, ticket_cost);
    }

    public void sellTicket(int number_of_tickets){
        if (tickets_sold + number_of_tickets <= number_of_seats){
            tickets_sold += number_of_tickets;
            System.out.printf("Продано %d билетов на сеанс %s \n", number_of_tickets, film.filmTitle);
        }
        else {
            System.out.printf("Недостаточно свободных мест на сеанс %s \n", film.filmTitle);
        }
    }

    public void printInfo(){
        System.out.printf("На сеанс %s продано %d билетов общей стоимостью %d \n",
                film.filmTitle, tickets_sold, tickets_sold * ticket_cost);
    }

    public int getTickets_sold() {
        return tickets_sold;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public String getMovie_name() {
        return film.filmTitle;
    }

    public int getTicket_cost() {
        return ticket_cost;
    }

    public void setTickets_sold(int tickets_sold) {
        this.tickets_sold = tickets_sold;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public void setMovie_name(String movie_name) {
        this.film.filmTitle = movie_name;
    }

    public void setTicket_cost(int ticket_cost) {
        this.ticket_cost = ticket_cost;
    }
}
