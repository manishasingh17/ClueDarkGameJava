
/**
 * This class is part of the "Clue Dark" application.
 * Player class represents  getter and setter to maintain the name of player. 
 
 * @Manisha
 * @version 20-04-2014
 */
public class Player
{
    private String name;
    private String targetItem;
    
    /**
     * accessor to get the name.
     * @return name of the player
     */
    public String getName()
   {
       return name;
   }
   /**
     * method to set the given name. 
     */
    
   public void setName (String firstname)
   {
       name = firstname;
    }
 }
