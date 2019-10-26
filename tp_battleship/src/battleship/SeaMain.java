package battleship;

import battleship.*;

import battleship.util.*;

public class SeaMain{
	public static void main(String[] args) {
		Sea S = new Sea(12,10);
		Ship ship = new Ship(3);
		Ship ship2 = new Ship(6);
		Cell c1 = S.getCell(new Position(1,2));
		S.addShip(ship,new Position(0,0),false);
		c1.shoot();
		Cell c2 = S.getCell(new Position(4,2));
		S.addShip(ship2,new Position(5,5),false);
		//c2.setShip(ship2);
		//c2.shoot();
		//Cell c2 = S.getCell(new Position(9,0));
		S.display(true);
		S.display(false);
	}

}
