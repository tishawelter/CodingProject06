package CodingProjectWeek06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//create list of cards
//create methods for shuffle and draw of the cards
//Standard deck of cards 52, 13 time 4 suits

public class Deck {
	
	List<Card> cards = new ArrayList<Card>(); 
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	Deck() {
		
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		// for loop to add each value to a suit 
		for (String suit: suits) {
			int count = 2;  
				for (Integer value : values) {
					this.cards.add(new Card(value, suit));
					count++;
					}
			}
	} 

	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}
