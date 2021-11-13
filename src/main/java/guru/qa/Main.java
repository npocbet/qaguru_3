package guru.qa;

public class Main {

    public static void main(String[] args){
        Seance first_movie = new Seance(120, 30, "Игла", 100);

        first_movie.setTickets_sold(10); // украли 20 билетов))
        first_movie.sellTicket(5);
        first_movie.sellTicket(20);
        System.out.println("напоминаем, фильм называется " + first_movie.getMovie_name());
        System.out.println(first_movie.film.getFilmsInvitation());

        first_movie.printInfo();

        Seance second_movie = new Seance(150, 20, "Асса", 50);

        second_movie.sellTicket(10);
        second_movie.sellTicket(15);
        second_movie.sellTicket(20);

        second_movie.printInfo();

    }
}
