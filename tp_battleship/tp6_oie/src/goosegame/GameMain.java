package goosegame;

import goosegame.util.*;

public class GameMain{

	public static void main(String[] args){
		Player p1 = new Player("Mamadou");
		Player p2 = new Player("Diallo");
		Player p3 = new Player("Bidul");
		Player p4 = new Player("Timoleon");
		Board board = new ClassicalBoard(63);
		board.initBoard();
		Cell firstCell = board.getCell(0);
		p1.setCell(firstCell);
		p2.setCell(firstCell);
		p3.setCell(firstCell);
		p4.setCell(firstCell);
		Game game = new Game(board);
		game.addPlayer(p1);
		game.addPlayer(p2);
		game.addPlayer(p3);
		game.addPlayer(p4);
		game.play();

	}
}