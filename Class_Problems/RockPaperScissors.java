import java.util.*;

public class RockPaperScissors {

    static String playRound(String player, String computer) {
        if(player.equals(computer))
            return "Draw";

        if((player.equals("Rock") && computer.equals("Scissors")) ||
           (player.equals("Paper") && computer.equals("Rock")) ||
           (player.equals("Scissors") && computer.equals("Paper")))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] moves = {"Rock","Paper","Scissors"};

        System.out.print("Enter player move: ");
        String player = sc.next();

        String computer = moves[rand.nextInt(3)];

        System.out.println("Computer Move: " + computer);
        System.out.println(playRound(player, computer));
    }
}