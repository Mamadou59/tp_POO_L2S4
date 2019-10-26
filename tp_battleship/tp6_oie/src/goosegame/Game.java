package goosegame;

import java.util.*;
import goosegame.util.*;

public class Game{

	protected List<Player> thePlayer;
	protected Board board;

	public Game(Board board){
		this.thePlayer = new ArrayList<>();
		this.board = board;
	}

	public void addPlayer(Player p){
		this.thePlayer.add(p);
	}

	private Cell movePlayer(Player p,int result){
		int pos = p.getCell().getIndex();
		int newPos = pos + result;
		int res = newPos;
		Cell newCell;
		if (newPos > this.board.getNbOfCells()){
			newPos =  2 * this.board.getNbOfCells() - newPos;
			res = newPos;
			newCell = this.board.getCell(newPos);
		} 
		else{
			newCell = this.board.getCell(newPos);
			int bound = newCell.bound(result,pos);
			newPos = bound;
			if (newPos > this.board.getNbOfCells()) newPos =  2 * this.board.getNbOfCells() - newPos;
			newCell = this.board.getCell(newPos);
		}
		String busy = "";
		if (newCell.isOccupied()){
			Player p1 = newCell.getPlayer();
			p1.setCell(this.board.getCell(pos));
			busy = " cell is busy,"+ p1.name +" is sent to cell "+pos;
		}else{
			this.board.getCell(pos).makeUnoccupied();
		}
		p.setCell(newCell);
		System.out.print(p.toString()+" is in cell "+pos+" , he was throws "+result+" and reaches cell "+res);
		System.out.println(newCell.stateToString()+busy);
		return newCell;
	}
	public void play(){
		int lastCell = this.board.getNbOfCells();
		boolean end = false;
		int indexPlayer = 0;
		Player nextPlayer = null;
		int cpt = 0;
		while (! end){
			cpt ++;
			nextPlayer = this.thePlayer.get(indexPlayer);
			if (nextPlayer.getCell().canBeLeft()){
				int result = nextPlayer.twoDiceThrow();
				//System.out.println(result);
				Cell newCell = this.movePlayer(nextPlayer,result);
				if (newCell.getIndex() == lastCell) end = true;
			}
			else System.out.println(nextPlayer.toString()+" he can not play"+nextPlayer.getCell().stateToString());
			indexPlayer = (indexPlayer + 1) % this.thePlayer.size();

			if(cpt%this.thePlayer.size() == 0) System.out.println();
		}
		System.out.println(nextPlayer.name+" has won the round!");
		
	}
}