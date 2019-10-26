package battleship;

import battleship.*;
import battleship.util.*;

public class GameMain{
	public static void main(String[] args) {
		Sea plateau = new Sea(10,12);
		Ship ship1 = new Ship(1);
		Ship ship2 = new Ship(1);
		Ship ship3 = new Ship(1);
		Position p1 = new Position(0,0);
		Position p2 = new Position(2,2);
		Position p3 = new Position(8,0);
		plateau.addShip(ship1,p1,true);
		plateau.addShip(ship2,p2,false);
		plateau.addShip(ship3,p3,true);
		Game game = new Game(plateau);
		game.play();
	}
}