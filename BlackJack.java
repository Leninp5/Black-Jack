import java.util.Scanner;
import java.util.*;

public class BlackJack{

    public static void main(String[] args){
   
    
    
    
    
        System.out.println("Player 1 please enter a name.");

            Scanner p1 = new Scanner(System.in);

            String pl1= p1.nextLine();

        System.out.println("Hi," + pl1+ " Let the games begin!");

      

        Deck deck = new Deck();
        Player player1 = new Player(pl1);

        Player dealer = new Player("Dealer");

        System.out.println("Dealer Has:");
        int dealerPoints = 0;
        dealer.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        dealer.printCards();
        System.out.println("for a total of:" + dealer.handValue());

        System.out.println(pl1 + " Has:");
        player1.addCard(deck.drawCard());
        player1.addCard(deck.drawCard());
        player1.printCards();
        System.out.println("for a total of:" + player1.handValue());

        System.out.println("");
        System.out.println("Ok " + pl1 + " please type if you'd like to hit or stay ");
    
        Scanner c = new Scanner(System.in);
    
        String choice = c.nextLine();
    
   
        

        if(choice.equalsIgnoreCase("hit")){

            System.out.println( pl1 + " chooses to hit:");
            System.out.println("");
            player1.addCard(deck.drawCard());
            player1.printCards();
            System.out.println("for a total of:" + player1.handValue());
    
        }
        if(player1.handValue() > 21){
            System.out.println("OOOPPPSS Game Over that's a BUST!!");
        } 
        if(choice.equalsIgnoreCase("stay")){

            System.out.println( pl1 + " chooses to stay:");
            System.out.println("");
            player1.printCards();
            System.out.println("for a total of:" + player1.handValue());
            System.out.println("");
            System.out.println("And now it is the Dealer's turn");
            dealer.addCard(deck.drawCard());
            dealer.printCards();
            System.out.println("The Dealer chooses to hit and now has a total of: " + dealer.handValue());

        }    
          if(dealer.handValue()< 15){
            dealer.addCard(deck.drawCard());
            System.out.println("The Dealer now has: ");
            dealer.printCards();
            System.out.println(" Which is now worth: " + dealer.handValue());
        }
        
        if(player1.handValue()== 21){
            System.out.println("Black Jack!!!!!");
        }
        if(dealer.handValue() == 21) {
            System.out.println("Black Jack goes to the Dealer!!!!! Better luck next time" + pl1);
        }

        if(player1.handValue()==dealer.handValue()){
            System.out.println("We have a draw!");
            
        }
        if(player1.handValue() == 21 || player1.handValue() <= 21 && player1.handValue() > dealer.handValue()){
            System.out.println( pl1 + " you just won you awesome person you!");
        }
        if(dealer.handValue() <= 21 && dealer.handValue() > player1.handValue()){
            System.out.println("");
            System.out.println("Sorry, you just lost, the house always wins " + pl1 + " you should know this!");

    }
  
}
   
}
