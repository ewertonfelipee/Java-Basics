package basics;
import java.util.Scanner;

public class Tickets {
    private String movie;
    private int rows;
    private int seat;

    public Tickets(String movie, int rows, int seat){
        this.movie = movie;
        this.rows = rows;
        this.seat = seat;
    }

    public String getMovie(){
        return movie;
    }

    public int getRows(){
        return rows;
    }

    public int getSeat(){
        return seat;
    }
}

class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String movie = read.nextLine();
        int rows = read.nextInt();
        int seat = read.nextInt();

        Tickets tickets = new Tickets(movie, rows, seat);

        System.out.println("Movie: "+tickets.getMovie());
        System.out.println("Row: "+tickets.getRows());
        System.out.println("Seat: "+tickets.getSeat());
    }
}
