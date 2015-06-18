
/**
 *  This class is the main class of the "Clue Dark" application. 
 *  "Clue Dark" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery and serach for the clues. 
 * To play this game, create an instance of this class and call the "play"
 *  method.This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  
 *  It enables the player to search,add,drop the clues hidden in rooms.It also evaluates and
 *  executes the commands that the parser returns.
 * @author  Manisha
 * @version 20-04-2014 
 */
public class ClueDark
{
   public static void main(String[] args){
       Game game = new Game();
       game.play();
       
    }
}
