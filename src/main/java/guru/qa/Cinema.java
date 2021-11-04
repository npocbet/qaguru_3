package guru.qa;

public class Cinema {


    static class Seance{
        int tickets_sold = 0;
        int number_of_seats;
        String movie_name;
        int ticket_cost;

        public Seance(int i_number_of_seats, String i_movie_name, int i_ticket_cost) {
            number_of_seats = i_number_of_seats;
            movie_name = i_movie_name;
            ticket_cost = i_ticket_cost;
            System.out.printf("Начинается продажа билетов на сеанс %s, количество мест %d, цена билета %d\n",
                    movie_name, number_of_seats, ticket_cost);
        }

        public void sellTicket(int number_of_tickets){
            if (tickets_sold + number_of_tickets <= number_of_seats){
                tickets_sold += number_of_tickets;
                System.out.printf("Продано %d билетов на сеанс %s \n", number_of_tickets, movie_name);
            }
            else {
                System.out.printf("Недостаточно свободных мест на сеанс %s \n", movie_name);
            }
        }

        public void printInfo(){
            System.out.printf("На сеанс %s продано %d билетов общей стоимостью %d \n",
                    movie_name, tickets_sold, tickets_sold * ticket_cost);
        }
    }
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
