package war;

public class Card{
		
		public int valueOfCard;		//number of each card
		public String nameOfCard;	//name of each card
		
		
		public Card(int newValueOfCard, String suit) {

			valueOfCard = newValueOfCard;

	        switch(newValueOfCard) {
	            case 2: nameOfCard = "Two";
	                break;
	            case 3: nameOfCard = "Three";
	                break;
	            case 4: nameOfCard = "Four";
	                break;
	            case 5: nameOfCard = "Five";
	                break;
	            case 6: nameOfCard = "Six";
	                break;
	            case 7: nameOfCard = "Seven";
	                break;
	            case 8: nameOfCard = "Eight";
	                break;
	            case 9: nameOfCard = "Nine";
	                break;
	            case 10: nameOfCard = "Ten";
	                break;
	            case 11: nameOfCard = "Jack";
	                break;
	            case 12: nameOfCard = "Queen";
	                break;
	            case 13: nameOfCard = "King";
	                break;
	            case 14: nameOfCard = "Ace";
	                break;
	        }

	        nameOfCard += " of " + suit;

	    }

	    public int getvalueOfCard() {
			return this.valueOfCard;
		}
		
	    public void setvalueOfCard(int valueOfCard) {
			this.valueOfCard = valueOfCard;
		}

	    public String getnameOfCard(String nameOfCard) {
			return this.nameOfCard;
		}
	    
	    public void setnameOfCard(String nameOfCard) {
	    	this.nameOfCard = nameOfCard;
	    }


		public Card() {
			
		}
		
//		2. describe (prints out information about a card) this is where the card will be described, example 2 of hearts, ace of diamonds will use our value and name property	
	
		public void describe() {
			System.out.println("Card: " + nameOfCard + "Value: " + valueOfCard);
			
		}	
	
}