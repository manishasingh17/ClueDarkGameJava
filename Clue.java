
/**
 * This class is part of the "Clue Dark" application.
 * Clue class represents clue and their description for clue object. 
 * 
 * @author Manisha
 * @version 08-04-2014
 */
public class Clue
{
    // instance variables 
    private String clue;
    private String description;
   
    /**
     * Constructor of class Clue
     */
    public Clue(String clue,String description)
    {
        this.clue=clue;
        this.description=description;
    }

    /**
     * accessor to get the clue. 
     */
    public String getClue()
    {
        return this.clue;
    }
    /**
     * accessor to get the description of the clue. 
     */
    
    private String getdescription()
    {
            return description;
    }
}
