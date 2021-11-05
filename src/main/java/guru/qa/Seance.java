package guru.qa;

public class Seance {
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
