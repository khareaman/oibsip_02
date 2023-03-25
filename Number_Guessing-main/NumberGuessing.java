import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------WELCOME BUDDY--------");
System.out.println("--------<< NUMBER GUESSING GAME >>--------");
System.out.println("In this game you wil only get 5 Chances :) ");
System.out.println("Get Ready_ _ _ _ _ _ _ _ _ _");

        int num = 1 + (int)(100  * Math.random());
        for(int i=0;i<5;i++){
            System.out.println("Enter the  number");
            int x=sc.nextInt();
            if(num==x){
         System.out.println("You Guess Correct Number !!!");
         break;
            }
            if(num>x){
                System.out.println("The Actual number is greater than guessed number "+x);
            }
            if(num<x){
                System.out.println("The Actual number is smaller than  Guessed number "+x);
            }
            
        } 
System.out.println("The actual number is:"+num);
    
    
    
    
    
    
    
    }
}
