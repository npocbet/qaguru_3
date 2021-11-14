package guru.qa;

public class Seance {
    int ticketsSold = 0;
    int numberOfSeats;
    int ticketCost;
    Film film;

    static class Film {
        int duration;
        String filmTitle;
        public Film(String filmTitleT, int duration){
            this.filmTitle = filmTitleT;
            this.duration = duration;
        }

        public String printFilmsInvitation(){
            return "Текущий сеанс " + filmTitle;
        }
    }

    public Seance(int duration, int i_number_of_seats, String i_movie_name, int i_ticket_cost) {
        film = new Film(i_movie_name, duration);
        numberOfSeats = i_number_of_seats;
        ticketCost = i_ticket_cost;
        System.out.printf("Начинается продажа билетов на сеанс %s, количество мест %d, цена билета %d\n",
                film.filmTitle, numberOfSeats, ticketCost);
    }

    public void sellTicket(int number_of_tickets){
        if (ticketsSold + number_of_tickets <= numberOfSeats){
            ticketsSold += number_of_tickets;
            System.out.printf("Продано %d билетов на сеанс %s \n", number_of_tickets, film.filmTitle);
        }
        else {
            System.out.printf("Недостаточно свободных мест на сеанс %s \n", film.filmTitle);
        }
    }

    public void printInfo(){
        System.out.printf("На сеанс %s продано %d билетов общей стоимостью %d \n",
                film.filmTitle, ticketsSold, ticketsSold * ticketCost);
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getMovie_name() {
        return film.filmTitle;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setMovie_name(String movie_name) {
        this.film.filmTitle = movie_name;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
}
