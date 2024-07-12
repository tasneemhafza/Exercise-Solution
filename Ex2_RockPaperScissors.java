package Exercise;

import java.util.Random;
import java.util.Scanner;

// A Rock paper scissor game 

public class Ex2_RockPaperScissors {
    public static void main(String[] args) {
        Random r = new Random();
        int compNo = r.nextInt(3);

        System.out.print("Choose any one:-\n1 for Rock, 2 for Paper, 3 for Scissor: ");
        try (Scanner sc = new Scanner(System.in)) {
            int userNo = sc.nextInt();

            if(compNo==1){
                System.out.println("Computer choice: Rock");
            }
            else if(compNo==2){
                System.out.println("Computer choice: Paper");
            }
            else if(compNo==3){
                System.out.println("Computer choice: Scissors");
            }

            if(userNo==compNo) {
                System.out.println("Draw");
            }
            else if (userNo == 1 && compNo == 3 || userNo == 2 && compNo == 1 || userNo == 3 && compNo == 2) {
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Wins!");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }    
}
