// Tyler Cingel
// Survivor
// My class that will be used for an array of people in
//   my apocalypse game, used to keep track of their name,
//   the day they joined, and eventually, their gender.

/* Improvements:
 *  Other instance variables for more customization
 *
 *  Implement new methods for removing survivors to overwrite the god-object's
 */


/* Possible other games to make:
 *  Simulate animal species
 *  Apocalypse simulation with more choices
 *  Better Hunger Games (again)
 *  War simulator
 *  Disease simulator
 *  Fantasy game
 */
public class Survivor
{
    private String myName;
    private char myGender;
    private int dayJoin;
    
    ////////////////////////////////////////////////Constructors
    public Survivor (String name)
    {
        myName = name;
    }
    public Survivor (String name, char gender)
    {
        myName = name;
        myGender = gender;
    }
    public Survivor (String name, int joined)
    {
        myName = name;
        dayJoin = joined;
    }
    public Survivor (String name, char gender, int joined)
    {
        myName = name;
        myGender = gender;
        dayJoin = joined;
    }
    ///////////////////////////////////////////////Accessor methods
    public int joined()
    {
        return dayJoin;
    }
    public String getName()
    {
        return myName;
    }
    public char getGender()
    {
        return myGender;
    }
    /////////////////////////////////////////////Editors
    public void newName(String name)
    {
        myName = name;
    }
    public void newJoin(int day)
    {
        dayJoin = day;
    }
    public void genderChange(char newGen)
    {
        myGender = newGen;
    }
}