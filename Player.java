package CodingProjectWeek06;

import java.util.ArrayList;
import java.util.List;

//each play has a hand of cards, score and a name
//methods to describe players and hand, flip top card, draw next card in deck
//method to keeps score

public class Player {
		
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();
	
	public Player() {
	}
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
		
	public void drawCard(Deck deck) {
		hand.add(deck.draw());
	}
		
	public void incrementScore() {
		score++;
	}

	public Card flipCard() {
		return hand.remove(0);
	}
	
	public List<Card> Hand() {
		return hand;
	}

	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	
}
