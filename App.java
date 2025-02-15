package CodingProjectWeek06;

public class App {

	public static void main(String[] args) {
		
		//sets up two players
		Player player1 = new Player(); 
		Player player2 = new Player();
		
		//assigns name for each player
		player1.setName("Player 1");
		player2.setName("Player 2");
		
		//Initialize new deck
		Deck deck = new Deck();
		
		deck.shuffle();
		System.out.println("Deck has been shuffled and dealt!");
		
		//loop to deal cards to each player
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.drawCard(deck);
			} else
				player2.drawCard(deck);
		} //close for loop
		
		System.out.println("*********************************\n");
		
		//loop runs through cards until all cards are played
		for (int j = 0; j < 26; j++) {
            Card card1 = player1.flipCard();
            Card card2 = player2.flipCard();

            System.out.print(player1.getName() + " plays ");
            card1.describe();
            System.out.print(player2.getName() + " plays ");
            card2.describe();
            System.out.println();
            
            //who wins the hand
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round.");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round.");
            } else {
                 System.out.println("Tie, no point was awarded!");
            }
            //prints current score
            System.out.println("-------------------------------");
            System.out.println(player1.getName() + " current score is: " + player1.getScore());
            System.out.println(player2.getName() + " current score is: " + player2.getScore());
            System.out.println("++++++++++++++++++++++++++++++++\n");
		} //close for loop
		
		 int player1Score = player1.getScore();
		 int player2Score = player2.getScore();
		 
	    //prints outcome of game
		System.out.println("********** GAME OVER **********");
		System.out.println("Game Over");
		if (player1Score > player2Score) {
			System.out.println("Player 1 has won the game!");
		} else if (player2Score > player1Score) {
			System.out.println("Player 2 wins the game!");
		} else {
			System.out.println("Game is a draw, no one has won");
		}
		System.out.println("*******************************");
	}	
}

