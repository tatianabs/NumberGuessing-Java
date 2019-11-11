package guessnumber;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random random= new Random();
        
        boolean rightGuess=false;
        int chances=10;
        int secretNumber=random.nextInt(10);
        long guess=0;
         // System.out.println(secretNumber);
        
                while(chances>0 && rightGuess==false)
        {
            System.out.println("Guess a number: ");
           try{
                     guess= input.nextLong();
            
            if (secretNumber==guess)
            {
                System.out.println("You got the right number");
                rightGuess=true;
            }else if (guess<secretNumber) 
            {
                --chances;
                System.out.println("The number is too small!"  + chances +  " chances left!");
            }else
            {
                --chances;
                System.out.println("The number is too big!"  + chances +  " chances left!");
            }
           }catch(Exception e){
               System.out.println("This is not a valid number");
                 input.next();
               
           }
          
           
            
        } 
         
     
    }
    
}
