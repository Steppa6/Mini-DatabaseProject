import java.util.*;

/*
Project: Database.
Purpose: This Class is part of the main program. It is meant to be used to
         enroll any new data, added or altered. This could've been done easier
         but I like the challenge. ;)
Began  : 8.22.2023
Hours  : 3.5 Daily
Ended  : 9.04.2023
Time   : Fourty-Nine Hours/Fourteen Days/Three Point Five Hours Daily
Author : Usher Lib.
*/

// Class Header 
public class EnrollDatabase 
{
    /*                      [Declaration Phase]
    Declaring and initializing Private fields: String Arrays.
    */
    GetDatabase newData = new GetDatabase();    //importing class
    private String[] names = {"Mary Cooper", "Sean Williams", "Matthew Johnson",
        "Jane Brown", "Emily Parker", "Jayleen Cobb", "Ainsley Slade",
        "Halle Causey", "Jen6 Cocks", "Case Robertson8", "Stephani Long", 
        "Jessie Radcliff", "Bradford Peter", "Evalyn Wilder", "Irvi_ne Merrill"};
    private String[] address = {"677 Cherry St. Vicksbur, NY", 
            "221 Arnold St. Hanovera, NY", "924 Racees Dr. Beverlys, NY",
            "107 Cedarr St. Roswells, NY", "870 Rosess St. Durhamin, NY",
            "358 Dorado Av. Leesburg, NY", "954 Pennie Rd. Tauntons, NY",
            "227 Arnold St. Hanovera, NY", "907 Racees Dr. Beverlys, NY",
            "452 Cherry St. Vicksbur, NY", "804 Pennie Rd. Tauntons, NY",
            "162 Cedarr St. Roswells, NY", "136 Dorado Av. Leesburg, NY",
            "155 Dorado Av. Leesburg, NY", "464 Arnold St. Hanovera, NY"};
    
    /*                      [Implementation Phase]
        a replace method from online. used to recieve the oldvalue to 
        replace with a newvalue.
    */
    public String[] Replace(String[] items, String oldValue, String newValue)
    {
    for (int index = 0; index < items.length; index++)
        if (items[index].equals(oldValue))
            items[index] = newValue;
            return items;
    }
    
    //add method from online. used to recieve an array length and data 
    //stored in the array, to be copied, increased, and returned with 
    //added data.
    public String[] Add(String[] items, String newValue)
    {
    int length;
   
    length = items.length;
    String[] newArray = Arrays.copyOf(items, length + 1);
    newArray[length] = newValue;
    return newArray;
    }
    
    //Empty Method
    public EnrollDatabase()
    {
    }
    
    //method calls to replace method with given parameters and returns new data.
    public String[] setNames(String input, String revision)
    {
        Replace(names, input, revision);
        return names;
    }
    
    //method calls to replace method with given parameters and returns new data.
    public String[] setAddress(String input, String revision)
    {
        Replace(address, input, revision);
        return address;
    }
    
    //method calls to replace method with given parameters and returns new data.
    public String[] addNames(String input)
    {
        names = Add(names, input);
        return names;
    }
    
    //method calls to replace method with given parameters and returns new data.
    public String[] addAddress(String input)
    {
        address = Add(address, input);
        return address;
    }
}
