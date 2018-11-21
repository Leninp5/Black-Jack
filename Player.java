import java.util.ArrayList;
import java.util.Random;
import java.util.*;


 public class Player{
    private String name;
    private ArrayList<Card> cards;
    private int score;    

    public Player(String n){
        this.name = n;
        this.cards = new ArrayList<Card>();
        this.score = 0;
    }

    public void setName(String n){
        name = n;
    }  
    public String getName(){
        return name;
    }
    public void setCards(ArrayList<Card> c){
        cards = c;
    }
    public ArrayList<Card> getCards(){
        return cards;
    }  
    public void addCard(Card c){
        cards.add(c);
    }
   
    public void printCards(){
        System.out.println(cards);
    }
    public void setScore(int s){
        score = s;
    }
    public int getScore(){
        return score;
    }

    public int handValue(){
        int handValue = 0;
        for(Card c : cards){
            handValue = handValue + c.getCardValue();
        }
        return handValue;
    }

 }


