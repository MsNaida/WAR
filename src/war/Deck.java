package war;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    	
  	 List<Card> cards = new ArrayList<Card>();
   	 List<String> suits = Arrays.asList("Clubs", "Hearts","Spades", "Diamonds");

   	    public Deck() {

   	        for (int i = 2; i < 15; i++) {

	            for (String suit : suits) {
    	                cards.add(new Card(i, suit));
        }
   	    }    
   	    }
    	
    	public String Deck;		
//    	List of Cards
    	
    	public static String createListOfCards(String valueOfCard,String nameOfCard) {
    		return valueOfCard + " " + nameOfCard;
    	}
    		
   	    public void shuffle() {
   	        Collections.shuffle(cards);
    	    }
    		
    	public Card draw() {
    		return cards.remove(0);
    		
    	}
}
