import java.util.*;

/*
Project: Database.
Purpose: This Class is part of the main program. It is meant to hold the database
         and be called on when needed.
Began  : 8.22.2023
Hours  : 3.5 Daily
Ended  : 9.04.2023
Time   : Fourty-Nine Hours/Fourteen Days/Three Point Five Hours Daily
Author : Usher Lib.
*/

// Class Header 
public class GetDatabase 
{
    
    /*                      [Declaration Phase]
    Declaring and initializing Private fields: String Arrays.
    */
    private String[] names = {"Mary Cooper", "Sean Williams", "Matthew Johnson",
        "Jane Brown", "Emily Parker", "Jayleen Cobb", "Ainsley Slade",
        "Halle Causey", "Jen6 Cocks", "Case Robertson8", "Stephani Long", 
        "Jessie Radcliff", "Bradford Peter", "Evalyn Wilder", "Irvi_ne Merrill"};
    
    private String[] sub = {"Basic", "Plus", "Premium", "Plus", "Basic", "Plus", "Premium"};
    private String[] address = {"677 Cherry St. Vicksbur, NY", 
            "221 Arnold St. Hanovera, NY", "924 Racees Dr. Beverlys, NY",
            "107 Cedarr St. Roswells, NY", "870 Rosess St. Durhamin, NY",
            "358 Dorado Av. Leesburg, NY", "954 Pennie Rd. Tauntons, NY",
            "227 Arnold St. Hanovera, NY", "907 Racees Dr. Beverlys, NY",
            "452 Cherry St. Vicksbur, NY", "804 Pennie Rd. Tauntons, NY",
            "162 Cedarr St. Roswells, NY", "136 Dorado Av. Leesburg, NY",
            "155 Dorado Av. Leesburg, NY", "464 Arnold St. Hanovera, NY"};
    private short id = 001;
    private char[] sex = {'F', 'M', 'M', ' ', 'F', 'M', ' ', ' ', 'F', 'M', 'F', 
            'F', 'M', 'F', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    
    /*                      [Implementation Phase]
        Empty Method.
    */
    public GetDatabase()
    {
    }
    
    //method used to replace old data with altered data.
    public void editName(String[] newNames)
    {
        for(int i = 0; i < newNames.length && i < names.length; i++)
        {
            if(names[i] != newNames[i])
               names[i] = newNames[i];
        }
       
    }
    
    //method used to assign new data to names.
    public void addName(String[] newNames)
    {
               names = newNames;
       
    }
    
    //method used to assign new data to address.
     public void addAddress(String[] newAddress)
    {
               address = newAddress;
       
    }
    
    //method used to replace old data with altered data.
    public void editAddress(String[] newAddress)
    {
        for(int i = 0; i < newAddress.length && i < address.length; i++)
        {
            if(address[i] != newAddress[i])
               address[i] = newAddress[i];
        }
       
    }
    
    //method used to get data when called on.
    public String getName(int index)
    {
      return names[index];
    }
    
    //method used to get data when called on.
    public String getSubs(int index)
    {
        if(index < 7)
        {
        }
        else
        {
            index = index * 3 / 7;
        }
      return sub[index];
    }
    
    //method used to get data when called on.
    public String getAddress(int index)
    {
      return address[index];
    }
   
    //method used to get data when called on.
    public short getId()
    {
      return id++;
    }
    
    //method used to get data when called on.
    public char getSex(int index)
    {
      return sex[index];
    }
    
    //method used to get data when called on.
    public int getLength()
    {
        int size;
        return size = names.length;
    }
}
