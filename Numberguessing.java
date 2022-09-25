package Numberguessing;
import java.util.Random;
import java.util.Scanner;
public class Numberguessing {

    public static void main(String[] args) {
        Random Random_number=new Random();
        
        int right_guess=Random_number.nextInt(100);
        
        int turns=0;
        Scanner sc=new Scanner(System.in);
	system.out.println("Welcome!");
        System.out.println("Guess the number between 1 to 100 numbers");
         System.out.println("You are going to have 10 attempt");
	system.out.println("Hope you are ready to play);
          System.out.println("All the Best!");
          
          int guess;
          int i=0;
          boolean win=false;
          while(win==false){
              guess=sc.nextInt();
              turns++;
          
              if(guess==right_guess){
              win=true;
          }
          else if(i>8){
		system.out.println("Good try");
               System.out.println("Oops! Better Luck Next Time ");
                System.out.println("The correct answer was :"+right_guess);
                return;
          }
          else if(guess<right_guess){
              i++;
               System.out.println("Your guess is less than right guess!  turns left  :"+(10-i));
          }
          else if(guess>right_guess){
              i++;
               System.out.println("Your guess is higher than the right guess ! turns left ;"+(10-i));
          }
          }
           System.out.println("Congratulations! you won the game");
            System.out.println("the number was :"+right_guess);
             System.out.println("You use"+turns+"turns to get the right number");
              System.out.println("Your Score is :"+((11-turns)*10)+"% Out of 100");
    }
    
}