package guru.qa;

public class Main {

    public static void main(String[] args){
        Seance firstMovie = new Seance(120, 30, "Игла", 100);

        firstMovie.setTicketsSold(10); // украли 20 билетов))
        firstMovie.sellTicket(5);
        firstMovie.sellTicket(20);
        System.out.println("напоминаем, фильм называется " + firstMovie.getMovieName());
        System.out.println(firstMovie.film.printFilmsInvitation());

        firstMovie.printInfo();

        Seance secondMovie = new Seance(150, 20, "Асса", 50);

        secondMovie.sellTicket(10);
        secondMovie.sellTicket(15);
        secondMovie.sellTicket(20);

        secondMovie.printInfo();

    }
}
