package guru.qa;

public class Main {

    public static void main(String[] args){
        Seance first_movie = new Seance(30, "Игла", 100);

        first_movie.sellTicket(10);
        first_movie.sellTicket(5);
        first_movie.sellTicket(20);

        first_movie.printInfo();

        Seance second_movie = new Seance(20, "Асса", 50);

        second_movie.sellTicket(10);
        second_movie.sellTicket(15);
        second_movie.sellTicket(20);

        second_movie.printInfo();

    }
}
