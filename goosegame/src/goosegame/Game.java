package goosegame;
import java.util.*;


/**
* Class Game
* @author Barry  Diallo
* @version 1.0
*/
public class Game{
    /** the table of player*/
    protected List<Player> thePlayers;
    /** the board we use*/
    protected Board board;
    /** the iterator for the player*/
    private Iterator<Player> it;

    /**
    * @param board the board we use in Game
    */
    public Game(Board board){
          this.board = board;
          this.thePlayers = new ArrayList<Player>();
    }

    /**
    * this fonction addplayer in Game
    * @param p the player we can add to Game
    */
    public void addPlayer(Player p){
          this.thePlayers.add(p);
          this.board.getcell(0).welcomePlayer(p);
          p.setCell(this.board.getcell(0));
    }

    /**
    * this function give the next player in game
    * @return Player the next player
    */
    private Player nextPlayer(){
        if(it==null || (!it.hasNext())){
            it = this.thePlayers.iterator();
        }
        return it.next();
    }

    /**
    * cheick if the player can play
    * @return true if player can play false otherwise
    */
    private boolean canPlay(Player player){
         Cell c = player.getCell();
         return c.canBeLeft();
    }

    /**
    * this function move the player at the cell
    * @param p the player
    * @param reached the new cell
    */
    private void movePlayer(Player p, Cell reached){
            if (reached.isBussy()){
            Cell c = p.getCell();
            Player p2 =reached.getPlayer();
            c.welcomePlayer(p2);
            p2.setCell(c);
            System.out.print(" cell is busy, "+p2.toString()+" is sent to "+c.toString());
          }
          reached.welcomePlayer(p);
          p.setCell(reached);

  }
    /**
    * Fonction who search the new cell for the player
    *@param Player the player
    *
    */
    private Cell fct(Player player,int des){
          Cell c = player.getCell();
          c.welcomePlayer(null);
          int ind = c.getIndex();
          int next = ind+des;
          int val;
          boolean boucle = false;
          while(next>63 || this.board.getcell(next).handleMove(des)>63){
            int a = next-63;
            boucle = true;
            if(a>0){
            next = 63- a;
            next = this.board.getcell(next).handleMove(des);
          }
            else{
              next = this.board.getcell(next).handleMove(des);
              val = 63 - next;
              next = 63 + val;
            }
          }
          System.out.print(this.board.getcell(next).toString());
          if (boucle ==false){
            int next1 = this.board.getcell(next).handleMove(des);
            if (next1!=next){
              System.out.print(" and jump to "+board.getcell(next1).toString());
            }
            return board.getcell(next1);
          }
          return board.getcell(next);
    }

    /**
    *Give a representation of the turn
    *@param p it's the player
    */
    private void displayTurn(Player p){
      String pnom = p.toString();
      int ind = p.getCell().getIndex();
      System.out.print(pnom+" is in cell "+ind+",");
    }

    /**
    *Give a representation of the turn
    *@param p it's the player
    */
    private void displayWinner(Player p){
      System.out.println(p.toString()+" has won");}

    /**
    *Give a representation of the turn
    *@param p it's the player
    */
    private void displayCanNotPlay(Player p){
      String pnom = p.toString();
      System.out.print(pnom+" cannot play.");}

      
    /**
    * this fonction allow to play Game
    */
    public void play(){
        boolean won =false;
        Player player = null;
        int cpt = 0;
        while(!won){
            player = this.nextPlayer();
            this.displayTurn(player);
            if(this.canPlay(player)){
                  int des = player.twoDiceThrow();
                  System.out.print(player.toString()+" throws "+des+" and reaches ");
                  Cell reached = this.fct(player, des);
                  this.movePlayer(player, reached);
                  won = (reached.getIndex()==Board.getNbOfCells()-1);
            }
            else{
                  this.displayCanNotPlay(player);
            }
            cpt += 1;
            System.out.println("");
            if (cpt % thePlayers.size() == 0)
              System.out.println();
          }
        this.displayWinner(player);

    }

}
