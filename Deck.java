import java.util.Random;
import java.util.*;
import java.util.ArrayList;
public class Deck{
    
    private ArrayList<Card> cards;
    private ArrayList<Integer> randomNumbers;
    private int masterIndex = 0; 
    public Deck(){
        populateCards();
    }       
    
    private void populateCards(){
        Card card1 = new Card("Ace ","of Diamonds ", 1);
        Card card2 = new Card("Ace ", "of Spades ", 1);
        Card card3 = new Card("Ace ", "of Hearts ", 1);
        Card card4 = new Card("Ace ", "of Clubs ", 1);
        
        //twos deck
        Card card5 = new Card("Two ", "of Diamonds ", 2);
        Card card6= new Card("Two ", "of Spades ", 2);
        Card card7 = new Card("Two ", "of Hearts ", 2);
        Card card8= new Card("Two ", "of Clubs ", 2);
        
        //threes deck 
        Card card9= new Card("Three ", " of Diamonds ", 3);
        Card card10= new Card("Three ", "of Spades ", 3);
        Card card11 = new Card("Three ", "of Hearts ", 3);
        Card card12 = new Card("Three ", "of Clubs ", 3);
        
        //fours deck
        Card card13= new Card("Four ", "of Diamonds ", 4);
        Card card14= new Card("Four ", "of Spades ", 4);
        Card card15= new Card("Four ", "of Hearts ", 4);
        Card card16= new Card("Four ", "of Clubs", 4);
        
        //fives deck
        Card card17= new Card("Five ", "of Diamonds ", 5);
        Card card18= new Card("Five ", "of Spades ", 5);
        Card card19= new Card("Five ", "of Hearts ", 5);
        Card card20 = new Card("Five ", "of Clubs ", 5);
        
        //sixs deck
        Card card21= new Card("Six ", "of Diamonds ", 6);
        Card card22= new Card("Six ", "of Spades ", 6);
        Card card23= new Card("Six ", "of Hearts ", 6);
        Card card24= new Card("Six ", "of Clubs ",6);
        
        //sevens deck
        Card card25= new Card("Seven ", "of Diamonds ", 7);
        Card card26= new Card("Seven ", "of Spades ", 7);
        Card card27= new Card("Seven ", "of Hearts ", 7);
        Card card28= new Card("Seven ", "of Clubs ", 7);
        
        //eights deck
        Card card29= new Card("Eight ", "of Diamonds ", 8);
        Card card30= new Card("Eight ", "of Spades ", 8);
        Card card31= new Card("Eight ", "of Hearts ", 8);
        Card card32= new Card("Eight ", "of Clubs ", 8);
        
        //nines deck
        Card card33= new Card("Nine ", "of Diamonds ", 9);
        Card card34= new Card("Nine ", "of Spades ", 9);
        Card card35= new Card("Nine ", "of Hearts ", 9);
        Card card36= new Card("Nine ", "of Clubs ", 9);
        
        //tens deck
        Card card37= new Card("Ten ", "of Diamonds ", 10);
        Card card38= new Card("Ten ", "of Spades ", 10);
        Card card39= new Card("Ten ", "of Hearts ", 10);
        Card card40= new Card("Ten ", "of Clubs ", 10);
       
        //jacks deck
        Card card41 = new Card("Jack ", "of Diamonds ", 10);
        Card card42= new Card("Jack ", "of Spades ", 10);
        Card card43= new Card("Jack ", "of Hearts ", 10);
        Card card44= new Card("Jack ", "of Clubs ", 10);
        
        //queens deck
        Card card45= new Card("Queen ", "of Diamonds ", 10);
        Card card46= new Card("Queen ", "of Spades ", 10);
        Card card47= new Card("Queen ", "of Hearts ", 10);
        Card card48= new Card("Queen ", "of Clubs ", 10);
        
        //kings deck
        Card card49= new Card("King ", "of Diamonds ", 10);
        Card card50= new Card("King ", "of Spades ", 10);
        Card card51= new Card("King ", "of Hearts ", 10);
        Card card52= new Card("King ", "of Clubs ", 10);
        
    
        cards = new ArrayList<Card>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);
        cards.add(card13);
        cards.add(card14);
        cards.add(card15);
        cards.add(card16);
        cards.add(card17);
        cards.add(card18);
        cards.add(card19);
        cards.add(card20);
        cards.add(card21);
        cards.add(card22);
        cards.add(card23);
        cards.add(card24);
        cards.add(card25);
        cards.add(card26);
        cards.add(card27);
        cards.add(card28);
        cards.add(card29);
        cards.add(card30);
        cards.add(card31);
        cards.add(card32);
        cards.add(card33);
        cards.add(card34);
        cards.add(card35);
        cards.add(card36);
        cards.add(card37);
        cards.add(card38);
        cards.add(card39);
        cards.add(card40);
        cards.add(card41);
        cards.add(card42);
        cards.add(card43);
        cards.add(card44);
        cards.add(card45);
        cards.add(card46);
        cards.add(card47);
        cards.add(card48);
        cards.add(card49);
        cards.add(card50);
        cards.add(card51);
        cards.add(card52);
       
        shuffle();

    }
    
    public void shuffle(){
        populateRandomNumbers();
        masterIndex = 0;
    }

    private void populateRandomNumbers(){
        randomNumbers = new ArrayList<>();

        while(randomNumbers.size() < cards.size()){
            Random r = new Random();
            int number = r.nextInt(cards.size());
            if(randomNumbers.contains(number)){
                //nothing
            }else{
                
                randomNumbers.add(number);
            }
        }
    }

    public Card drawCard(){

    
        if(masterIndex == cards.size() -1 ){
            shuffle();
        }else{
            
            Integer randomNumber = randomNumbers.get(masterIndex);
            masterIndex = masterIndex + 1;
            return cards.get(randomNumber);

        }
        return drawCard(); 
    }
}
    




