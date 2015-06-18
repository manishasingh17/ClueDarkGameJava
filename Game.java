import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
/**
 *  This class is the game class of the "Clue Dark" application. 
 *  "Clue Dark" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery and serach for the clues. 
 * To play this game, create an instance of this class and call the "play"
 *  method.This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * @author  Manisha
 * @version 20-04-2014 
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    private HashMap<String,Clue> clueMap;
    private  ArrayList<String> clueBag ;
    private Player player;


    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        clueMap = new HashMap<String,Clue>();
        createRooms();
        player=new Player();
        parser = new Parser();
        clueBag = new ArrayList<String>();
    }
    
     /**
     * input player information from keyboard .
     */
    private void player()
    {
        Scanner play=new Scanner(System.in);
        System.out.println("*******************");
        System.out.println("Enter your name to start the game.");
        String player1=play.nextLine();
        player.setName(player1);
        System.out.println(" Hey "+player.getName()+" , start your game session now..");
        System.out.println("###################");
        
        
   }
     /**
     * Create all the rooms and link their exits together.
     * @return void
     */
   private void createRooms()
    {
        
      Room kitchen, ballroom, conservatory, dinningroom, billiardroom,library,hall,lounge,dormitory,outside;
      Room passage1,passage2,passage4,passage9,passage3,passage5,passage6,passage7,passage8,passage10,passage11,passage12,passage13,passage14,passage15;
      Room passage16,passage17,passage18,passage19,passage20,passage21,passage22,passage23,passage24,passage25,passage26;
        // create the rooms and passages
         outside = new Room("outside of the house");
         passage1=new Room(" in passage 1");
         passage2=new Room(" in passage 2");
         passage3=new Room(" in passage 3");
         passage4=new Room(" in passage 4");
         passage5=new Room (" in passage 5");
         passage6=new Room(" in passage 6");
         passage7=new Room(" in passage 7");
         passage8=new Room(" in passage 8");
         passage9=new Room("in passage 9");
         passage10=new Room("in passage 10");
         passage11=new Room("in passage 11");
         passage12=new Room("in passage 12");
         passage13=new Room("in passage 13");
         passage14=new Room("in passage 14");
         passage15=new Room("in passage 15");
         passage16=new Room("in passage 16");
         passage17=new Room("in passage 17");
         passage18=new Room("in passage 18");
         passage19=new Room("in passage 19");
         passage20=new Room("in passage 20");
         passage21=new Room("in passage 21");
         passage22=new Room("in passage 22");
         passage23=new Room("in passage 23");
         passage24=new Room("in passage 24");
         passage25=new Room("in passage 25");
         passage26=new Room("in passage 26");
          
        kitchen = new Room("in kitchen");
        ballroom = new Room("in the ballroom");
        conservatory = new Room("in conservatory");
        dinningroom = new Room("in the dinning room");
        billiardroom=new Room("in the billiard room");
        library=new Room("in the  library");
        hall=new Room("in the  hall");
        lounge=new Room("in the  lounge room");
        dormitory=new Room("in the doormatory");
         // initialise room exits
       outside.setExit("north",passage1);
       outside.setExit("west",passage5);
       outside.setExit("west",passage11);
       outside.setExit("south",passage16);
       outside.setExit("east",passage24);
       
       lounge.setExit("north",passage5);
       lounge.setExit("west",passage1);
       dormitory.setExit("south",passage6);
       dormitory.setExit("west",passage20);
       dormitory.setExit("east",passage8);
       dinningroom.setExit("west",passage7);
       dinningroom.setExit("north",passage5);
       ballroom.setExit("west",passage16);
       ballroom.setExit("east",passage12);
       billiardroom.setExit("east",passage24);
       billiardroom.setExit("east",passage21);
       conservatory.setExit("north",passage19);
       conservatory.setExit("east",passage17);
       library.setExit("north",passage24);
       library.setExit("east",passage26);
       hall.setExit("west",passage25);
       hall.setExit("east",passage2);
       kitchen.setExit("west",passage13);
       kitchen.setExit("south",passage11);
       
       passage1.setExit("south",outside);
       passage1.setExit("east",lounge);
       passage1.setExit("north",passage4);
       passage1.setExit("west", passage2);
       passage2.setExit("north",passage3);
       passage2.setExit("east",passage1);
       passage2.setExit("west",hall);
       passage3.setExit("north",passage8);
       passage3.setExit("east",passage4);
       passage3.setExit("west",passage6);
       passage3.setExit("south",passage2);
       passage4.setExit("east",passage5);
       passage4.setExit("west",passage3);
       passage4.setExit("north",passage7);
       passage4.setExit("south",passage1);
       passage5.setExit("east",outside);
       passage5.setExit("west",passage4);
       passage5.setExit("north",dinningroom);
       passage5.setExit("south",lounge);
       passage6.setExit("east",passage3);
       passage6.setExit("west",passage22);
       passage6.setExit("north",dormitory);
       passage7.setExit("east",dinningroom);
        passage7.setExit("west",passage8);
        passage7.setExit("north",passage10);
        passage7.setExit("south",passage4);
       passage8.setExit("west",dormitory);
       passage8.setExit("north",passage9);
       passage8.setExit("east",passage7);
       passage8.setExit("south",passage3);
       passage9.setExit("west",passage14);
       passage9.setExit("east",passage10);
       passage9.setExit("north",passage12);
       passage9.setExit("south",passage8);
       passage10.setExit("east",passage11);
       passage10.setExit("west",passage9);
       passage10.setExit("south",passage7);
       passage10.setExit("north",passage13);
       passage11.setExit("east",outside);
       passage11.setExit("west",passage10);
       passage11.setExit("north",kitchen);

       passage13.setExit("east",kitchen);
       passage13.setExit("west",passage12);
       passage13.setExit("south",passage10);
       passage12.setExit("west",ballroom);

       passage12.setExit("east",passage13);
       passage12.setExit("south",passage9);
       passage14.setExit("north",ballroom);
       passage14.setExit("south",dormitory);

       passage14.setExit("east",passage9);
       passage14.setExit("west",passage15);
       passage15.setExit("east",passage14);
       passage15.setExit("west",passage18);
       passage15.setExit("north",passage16);
       passage15.setExit("south",passage20);
       passage16.setExit("east",ballroom);
       passage16.setExit("west",passage17);
       passage16.setExit("north",outside);
       passage16.setExit("south",passage15);
       passage17.setExit("east",passage16);
       passage17.setExit("west",conservatory);
       passage17.setExit("south",passage18);
       passage18.setExit("east",passage15);
       passage18.setExit("west",passage19);
       passage18.setExit("north",passage17);
       passage18.setExit("south",passage21);
       passage19.setExit("east",passage18);
       passage19.setExit("north",conservatory);
       passage20.setExit("east",dormitory);
       passage20.setExit("west",passage21);
       passage20.setExit("north",passage15);
       passage20.setExit("south",passage22);
       passage21.setExit("east",passage20);
       passage21.setExit("west",billiardroom);
       passage21.setExit("north",passage18);
       passage21.setExit("south",passage23);
       passage22.setExit("east",passage6);
       passage22.setExit("west",passage23);
       passage22.setExit("north",passage20);
       passage22.setExit("south",passage25);
       passage23.setExit("east",passage22);
       passage23.setExit("west",passage24);
       passage23.setExit("north",passage21);
       passage23.setExit("south",passage26);
       passage24.setExit("east",passage23);
       passage24.setExit("west",outside);
       passage24.setExit("north",billiardroom);
       passage24.setExit("south",library);
       passage25.setExit("east",hall);
       passage25.setExit("west",passage26);
       passage25.setExit("north",passage22);
       passage26.setExit("east",passage25);
       passage26.setExit("west",library);
       passage26.setExit("north",passage22);

       currentRoom = outside;
       clueMap.put("rope",new Clue("rope", "in the kitchen"));
       clueMap.put("revolver",new Clue("revolver", " in the dining room"));
       clueMap.put("knife",new Clue("knife","in the lounge room"));
       clueMap.put("wrench",new Clue("wrench", " in the hall room"));
       clueMap.put("dagger",new Clue("dagger", " in the dormitory"));
       clueMap.put("candlestick",new Clue("candlestick"," in the billiard room"));
       clueMap.put("lead pipe",new Clue("lead pipe", " in the conservatory"));
       clueMap.put("wire",new Clue("wire"," in the ballroom"));
       clueMap.put("gun",new Clue("gun"," in the library"));
        //add clues to each room
        ballroom.addRoomClue(clueMap.get("wire"));
        kitchen.addRoomClue(clueMap.get("rope"));
        dinningroom.addRoomClue(clueMap.get("revolver"));
        lounge.addRoomClue(clueMap.get("knife"));
        hall.addRoomClue(clueMap.get("wrench"));
        dormitory.addRoomClue(clueMap.get("dagger"));
        billiardroom.addRoomClue(clueMap.get("candlestick"));
        conservatory.addRoomClue(clueMap.get("lead pipe"));
        library.addRoomClue(clueMap.get("gun"));
    }
    /**
     *  Main play routine.  Loops until end of play.
     *  @return void
     */
    public void play() 
    {            
        printWelcome();
       
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     * @return void
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the Clue Dark!");
        System.out.println("Clue Dark is a new,incredibly adventurous game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        player();
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;
        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {
            case UNKNOWN:
                System.out.println("I don't know what you mean...");
                break;
            case HELP:
                printHelp();
                break;
            case GO:
                goRoom(command);
                break;
            case ADD:
                addClue(command);
                break;
            case DROP:
                dropClue(command);
                break;
            case SEARCH:
                searchRoom(command);
                break;
             case QUIT:
                wantToQuit = quit(command);
                break;
            }
        // else command not recognised.
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around a big house.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }
    /** 
     * Try to go in one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     * @param Command the command to be processed to go to available exits.
     * @return void
     */
     private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

     /**
     *Method to look for the clues in current room 
     * from search command.
     * @param command The command to be processed to search the clue.
     * @return void
     */
    private void searchRoom(Command command)
    {
        if(!command.hasSecondWord())
        {
            System.out.println("search What!");
            return;
        }
        String clueFound = command.getSecondWord();
        System.out.println(currentRoom.getRoomClue());
    }
    /**
     *Method to add the clues in cluebag by player in current room 
     * using "add" command.
     * show error if clue aleady added and evavluates the win condition and print the win message
     * @param command The command to be processed to carry clue with the player.
     * @return void
     */
    
    private void  addClue(Command command)
    {
        if(!command.hasSecondWord())
        {
            System.out.println("add What!");
            return;
        }
         String clueFound = command.getSecondWord();
         
         if(!(clueBag.equals(clueFound)))
        {
            clueBag.add(clueFound);
            System.out.println("Clue added is " + clueBag);
        }
        else
        {
            System.out.println("clue is already added ");
        }
          
         if(clueBag.size()==3)
        {
          System.out.println("Congratulations!"+ player.getName()+ ", you have successfully found 3 clues.You won the game.Type quit to close the game session");
        }   
}
    /**
     *Method to drop the clues by player in current room 
     * using "drop" command and after removing the clue show message.
     * show error if clue aleady added .
     * @param command The command to be processed to drop the clue.
     * @return void
     */
    
    private void dropClue(Command command)
    {
        if(!command.hasSecondWord()){
            System.out.println("drop What!");
            return;
        }
         String clueFound = command.getSecondWord();
        
         if (!(clueBag.equals(clueFound)))
        {
            clueBag.remove(clueFound);
            System.out.println( clueFound + " is removed from cluebag. ");
        }
        else
        {
            System.out.println("Clue is already in clue bag");
        }
    }
    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
  }
