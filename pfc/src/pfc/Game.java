package pfc;

import pfc.strategy.*;

public class Game{

	public static final int VICTORY_POINTS = 2;
	public static final int DEFEAT_POINTS = 0;
	public static final int TIE_POINTS = 1;
	private Player p1;
	private Player p2;
	private int nbTour;
	private int rounds; // To locate the current round
	
	/** Create a game betewen to players
	 * @param p1 the first player
	 * @param p2 the seconde player
	 * @param nbTour the number of rounds to play
	 */
	public Game(Player p1,Player p2,int nbTour){
		this.p1 = p1;
		this.p2 = p2;
		this.nbTour = nbTour;
		this.rounds = nbTour;
	}
	/**
	* Ensures the distribution of points according to the shape that each player has played
	*/
	private void givePoints(int result){
		int curentRound = this.rounds+1 - this.nbTour; // a current round
		if (result == 0){
			this.p1.addPoints(TIE_POINTS);
			this.p2.addPoints(TIE_POINTS);
			System.out.println("|            Personne n'a gagné le round "+curentRound);
		}
		else if (result < 0){
			this.p1.addPoints(DEFEAT_POINTS);
			this.p2.addPoints(VICTORY_POINTS);
			System.out.println("|           "+p2+" a gagné le round "+curentRound);
		}
		else{
			this.p1.addPoints(VICTORY_POINTS);
			this.p2.addPoints(DEFEAT_POINTS);
			System.out.println("|           "+p1+" a gagné le round "+curentRound);
		}
	}
	/**
	* Perform a round of the game.
	*/
	private void playOneRound(){
		Shape shapeP1 = p1.play();
		Shape shapeP2 = p2.play();
		System.out.println("|     # $"+p1+" a joué "+shapeP1+" et $"+p2+" a joué "+shapeP2+" #");
		int result = shapeP1.compareShape(shapeP2);
		this.givePoints(result);
		this.nbTour--;
	}

	/**
	* At the end of the game displays the status of the end, displays the player won
	* and in case of equal scores displays that no one has won
	*/
	private void endOfGame(){
		int diffPoint = Math.abs(p1.getScore() - p2.getScore());
		System.out.println("|           %%% C'EST LA FIN DU JEUX %%%");
		if (p1.getScore() == p2.getScore()) System.out.println("|           << Personne n'a gagné le jeux! >>");
		else if (p1.getScore() > p2.getScore()) System.out.println("|< "+p1+" a gagné le jeux avec "+diffPoint+" point(s) d'avance que "+p2+ " >");
		else System.out.println("|< "+p2+" a gagné le jeux avec "+diffPoint+" point(s) d'avance que "+p1+" >");
	}

	/**
	* Performs the entire game so the number of rounds to play
	*/
	public void playGame(){
		while (nbTour > 0){
			this.playOneRound();
		}
		this.endOfGame();
	}

}
