public class Card{

    String cardFace;
    String cardSuit;
    int cardValue;

    public Card(String cardFace,String cardSuit,int cardValue){    
        this.cardFace= cardFace ;
        this.cardSuit= cardSuit ;
        this.cardValue= cardValue ;
    }
    public String toString(){
        return  cardFace  + cardSuit + " Value:" + cardValue ;
    }

    public int getCardValue(){
        return this.cardValue;
    }

    public String getCardSuit(){
        return this.cardSuit;
    }

    public String getCardFace(){
        return this.cardFace;
    }

    

}




