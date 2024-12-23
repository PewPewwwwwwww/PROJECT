import java.util.Scanner;


public class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //THE MAIN
        int Myage;
        int Attempts;
        Myage = 19;
        Attempts = 3;

        //INTRO
        System.out.println("HELLO GUYS SO THIS GAME IS TO GUEST THE AGE OF ERICK IF YOU GEST YOU ARE HUNDSOME OR BEAUTIFUL GOODLUCK :) ");
        sc.nextLine();

        //INTRUCTION. GESST THE AGE OF ERICK 
        System.out.print("HERE IS SOME INSTRUCTION \n\nPRESS ENTER TO SEE IT");
        sc.nextLine();
        System.out.print("\nSO HERE IS THE INTRUCTION IF YOU ATTEMPT 3 TIMES YOU WILL GONE SO GOODLUCK");
        sc.nextLine();

        System.out.println("\nGUESS THE AGE OF ERICK. YOU HAVE " + Attempts + " ATTEMPT SO GOODLUCK HAVE FUN :) " );

        //THE MAIN METTOD
        for(int attempts = 1; attempts <= Attempts; attempts++) {
            System.out.print("ATTEMPT" + attempts + " : ");
            int userGuess = sc.nextInt();

            if (userGuess == Myage) {
                System.out.println("CONGRATS! YOU GUESSED THE AGE IT RIGHT");
                return;
            } else {
                System.out.print("WRONG GUESS. SOW KEEP GOING TO GUESS THE AGE. ");
            }
        } 

        System.out.print("\n\nSORRY. YOU'VE USED ALL OF YOUR ATTEPTS. THE NUMBER WAS " + Myage + ".  " );


        
    }
    
}
