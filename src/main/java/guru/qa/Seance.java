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

    public Seance(int duration, int iNumberOfSeats, String iMovieName, int iTicketCost) {
        film = new Film(iMovieName, duration);
        numberOfSeats = iNumberOfSeats;
        ticketCost = iTicketCost;
        System.out.printf("Начинается продажа билетов на сеанс %s, количество мест %d, цена билета %d\n",
                film.filmTitle, numberOfSeats, ticketCost);
    }

    public void sellTicket(int numberOfTickets){
        if (ticketsSold + numberOfTickets <= numberOfSeats){
            ticketsSold += numberOfTickets;
            System.out.printf("Продано %d билетов на сеанс %s \n", numberOfTickets, film.filmTitle);
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

    public String getMovieName() {
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

    public void setMovie_name(String movieName) {
        this.film.filmTitle = movieName;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
}
