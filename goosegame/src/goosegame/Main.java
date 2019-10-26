package goosegame;
import java.util.*;
import goosegame.*;
import goosegame.cell.*;
/**
* Class Main
* @author Barry  Diallo
* @version 1.0
*/
public class Main{

    public static void main(String[] args){
          Board board = ClassicBoard.theBoard;
          Game game = new Game(board);
          for(int i = 0; i<args.length; i++)
                game.addPlayer(new Player(args[i]));
          game.play();
    }
}
