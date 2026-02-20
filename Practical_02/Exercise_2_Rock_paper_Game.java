import java.util.Random;
import java.util.Scanner;
public class Exercise_2_Rock_paper_Game {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("WELCOME TO ROCK,PAPER,SCISSOR GAME!!!");
        System.out.println("Enter your choice : ");
        String choice = in.nextLine().toLowerCase();

        int rand_num = random.nextInt(3);
        String rand_choice ;

        if(rand_num == 0)
        {
            rand_choice ="rock";

        }
        else if(rand_num==1)
        {
            rand_choice ="paper";

        }
        else
        {
            rand_choice ="scissor";

        }


        if(choice.equals("paper") || choice.equals("scissor")|| choice.equals("rock")) {


            System.out.println("Computer's Choice : " + rand_choice);
            if (choice.equals(rand_choice))
            {
                System.out.println("It's a TIE..");
            }
            else if ((choice.equals("paper") && rand_choice.equals("rock"))
                    || (choice.equals("scissor") && rand_choice.equals("paper"))
                    || (choice.equals("rock") && rand_choice.equals("scissor")))
            {
                System.out.println("YOU WON!");
            }
            else
            {
                System.out.println("YOU LOST");
            }


        }
        else
        {
            System.out.println("Invalid input!!");
        }



    }
}
