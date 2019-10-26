package pfc;

import pfc.*;

import pfc.strategy.*;

public class GameMain{

	public static void main(String[] args){
		int nbTour = 5; // a default value for the number of revolutions if it is not defined
		String playerName = "Mamadou"; // a default player name if it is not defined
		if (args.length > 0) {
			nbTour = Integer.parseInt(args[0]);
			if (args.length > 1) playerName = args[1];
		}
		Strategy stratp1 = new InteractiveStart();
		Strategy stratp2 = new RandomStrat();
		Player p1 = new Player(playerName, stratp1);
		Player p2 = new Player("Virtual",stratp2);
		Game game = new Game(p1,p2,nbTour);
		System.out.println();
		System.out.println("++++++++++++++-Le jeux de pierre feuille ciseaux-+++++++++++++++++");
		System.out.println("|                                                                |");
		game.playGame();
		System.out.println("|                                                                |");
		System.out.println("++++++++++++++++++++++++-Fin de jeux!!-+++++++++++++++++++++++++++");
	}
	


}