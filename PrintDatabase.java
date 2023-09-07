import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

/*
Project: Database.
Purpose: This program is meant to be a customer database where you can choose
         to view, edit and add data into the database. [QUEST] There maybe errors
         in the names, see if you can fix it by running the program.
Began  : 8.22.2023
Hours  : 3.5 Daily
Ended  : 9.04.2023
Time   : Fourty-Nine Hours/Fourteen Days/Three Point Five Hours Daily
Author : Usher Lib.
*/

// Class Header 
public class PrintDatabase {

    // Method Header
    public static void main(String[] args) throws IOException 
    {
        /*                      [Declaration Phase]
        Declaring a scanner, string, char, and a string array variable.
        Declaring two outside classes: EnrollDatabase and GetDatabase.
        */
        Scanner keyboard = new Scanner(System.in);  //will be used to recieve users input.
        String input;       //user input will be held here.
        String revision;    //user input will be held here.
        char answer;        //results will be held here.
        String[] hold;      //will be used to hold string arrays.
        GetDatabase getData = new GetDatabase();    //what I like to call, importing classes.
        EnrollDatabase editData = new EnrollDatabase(); //importing classes.
        
        //Prompt the user a question and recieve an answer, 
        //use the answer for the File class. -> line 39.
        System.out.print("\nTo Login, Please Enter Your Name that is "
                + "Labeled in your Computer Account\nLogin: ");
        input = keyboard.nextLine();
        //Input will be used to download a file if requested 
        //to the right file destination.
        File dataDownload = new File("C:\\Users\\" + input + "\\Documents\\newDatabase.txt");
        //PrintWriter will be used to insert the downloaded file txt into a format.
        PrintWriter outputFile = new PrintWriter(dataDownload);
            
        /*                      [Implementation Phase]
        placing a for loop to be able to return on request.
        once the for loop begins the variable "i" either ends the
        loop or is reduce to iterate again.
        */
        for(int i = 5; i < 6; i++)
        {
            //Create a list of options the user would like to do.
            System.out.print("\n\n\t\tWelcome To Hyper Database v2.1"
                + "\nWhat would you like to do today. Enter a letter prompt "
                + "in the menu options. \nExample[B or A]\n\n[Main Menu]"
                + "\n - A. View Customer Data. \n - B. Download Customer "
                + "Data onto txt. \n - C. Edit Customer Data. \n - D. Add "
                + "Customer Data. \n - E. Exit. \nEnter Here: ");
                input = keyboard.nextLine();
                answer = input.charAt(0);
        
        //Whatever option the user chose the switch will run the case.
        switch (Character.toUpperCase(answer)) 
        {
            //Case A. Viewing database, which contains a request of data
            //from class GetDatabase. 
        case 'A':
        System.out.print("\nViewing DataBase\nId:    Names:\t       Sex:\t\t Address:\t       "
                        + "Subcription: \n-------------------------------------"
                        + "----------------------------------------------------\n");
        for(int index = 0; index < getData.getLength(); index++)
        {
         System.out.printf("%-4d %-15s\t %c\t %s\t %2s\n",getData.getId(), getData.getName(index), 
         getData.getSex(index), getData.getAddress(index), getData.getSubs(index));
        }
        //Ask the user if he wishes to return or end the
        //program. using the variable "i" from the for 
        //loop from line 50.
        System.out.print("\nA. Return to Menu \nB. Exit : ");
        input = keyboard.nextLine();
        answer = input.charAt(0);
        switch (Character.toUpperCase(answer))
        {
         case 'A':
         i = 4;
        break;
                                    
         case 'B':
        break;   
        }
        break;
                
         //Case B. Download database, which contains a request of data
         //from class GetDatabase which is then placed in a file.
         case 'B':
         System.out.print("\nReady? (Y): ");
         input = keyboard.nextLine();
         answer = input.charAt(0);
         switch (Character.toUpperCase(answer))
        {
         case 'Y':
         //creates file.
         dataDownload.createNewFile();
         System.out.println("File created: " + dataDownload.getName());
         for(int index = 0; index < getData.getLength(); index++)
        {
         outputFile.printf("%-4d %-15s\t %c\t %s\t %2s\n",getData.getId(), getData.getName(index), 
         getData.getSex(index), getData.getAddress(index), getData.getSubs(index));
         outputFile.close();
        }
         //Ask the user if he wishes to return or end the
         //program. using the variable "i" from the for 
         //loop from line 50.
         System.out.print("\nA. Return to Menu \nB. Exit : ");
         input = keyboard.nextLine();
         answer = input.charAt(0);
         switch (Character.toUpperCase(answer))
        {
         case 'A':
         i = 4;
        break;
                                    
         case 'B':
        break;   
        }
        }     
        break;
                
        //Case C. Alter database, which contains a variable being sent to 
        //a class Method to be used to update the database with 
        //new data.
        case 'C':
        System.out.print("What would you like to revise for the customer: \n - A. Names."
                        + "\n - B. Address. \nEnter Here: ");
        input = keyboard.nextLine();
        answer = input.charAt(0);
        switch (Character.toUpperCase(answer))
       {
        case 'A':
        for(int index = 0; index < getData.getLength(); index++)
       {
        System.out.printf("\n%s",getData.getName(index));
       }
        System.out.print("\n\nWrite the name you would like to Change: ");
        input = keyboard.nextLine();
        System.out.print("\nNow write the revised vesion: ");
        revision = keyboard.nextLine();
        hold = editData.setNames(input, revision);
        getData.editName(hold);
        for(int index = 0; index < getData.getLength(); index++)
       {
        System.out.printf("\n%s",getData.getName(index));
       }
        //Ask the user if he wishes to return or end the
        //program. using the variable "i" from the for 
        //loop from line 50.
        System.out.print("\nA. Return to Menu \nB. Exit : ");
        input = keyboard.nextLine();
        answer = input.charAt(0);
        switch (Character.toUpperCase(answer))
       {
        case 'A':
        i = 4;
       break;
                                    
        case 'B':
       break;   
                                }
       break;
                        
        case 'B':
        for(int index = 0; index < getData.getLength(); index++)
       {
        System.out.printf("\n%s",getData.getAddress(index));
       }
        System.out.print("\n\nWrite the address you would like to Change: ");
        input = keyboard.nextLine();
        System.out.print("\nNow write the revised vesion: ");
        revision = keyboard.nextLine();
        hold = editData.setAddress(input, revision);
        getData.editAddress(hold);
        for(int index = 0; index < getData.getLength(); index++)
       {
        System.out.printf("\n%s",getData.getAddress(index));
       }
        //Ask the user if he wishes to return or end the
        //program. using the variable "i" from the for 
        //loop from line 50.
        System.out.print("\nA. Return to Menu \nB. Exit : ");
        input = keyboard.nextLine();
        answer = input.charAt(0);
        switch (Character.toUpperCase(answer))
       {
        case 'A':
        i = 4;
       break;
                                    
        case 'B':
       break;   
       }
       }     
       break;
                         
        //Case D. Add data to database, which contains a variable being sent to 
        //a class Method to be used to update the database with 
        //new data.
        case 'D':
        System.out.print("What customer information would you like to add: \n - A. Names."
                        + "\n - B. Address. \nEnter Here: ");
        input = keyboard.nextLine();
        answer = input.charAt(0);
        switch (Character.toUpperCase(answer))
       {
        case 'A':
        for(int index = 0; index < getData.getLength(); index++)
       {
        System.out.printf("\n%s",getData.getName(index));
       }
        System.out.print("\n\nWrite the name you would like to add: ");
        input = keyboard.nextLine();
        hold = editData.addNames(input);
        getData.addName(hold);
        for(int index = 0; index < hold.length; index++)
       {
        System.out.printf("\n%s",getData.getName(index));
       }
        //its required to have an address if you choose 
        //to import a new name.
        System.out.print("\n\nPlease add an address that is associated with the name: ");
        input = keyboard.nextLine();
        hold = editData.addAddress(input);
        getData.addAddress(hold);
        for(int index = 0; index < hold.length; index++)
       {
        System.out.printf("\n%s",getData.getAddress(index));
       }
        //Ask the user if he wishes to return or end the
        //program. using the variable "i" from the for 
        //loop from line 50.
        System.out.print("\n\nA. Return to Menu \nB. Exit : ");
        input = keyboard.nextLine();
        answer = input.charAt(0);
        switch (Character.toUpperCase(answer))
       {
        case 'A':
        i = 4;
        break;
                                    
        case 'B':
        break;   
       }
        break;
                        
        case 'B':
        for(int index = 0; index < getData.getLength(); index++)
       {
        System.out.printf("\n%s",getData.getAddress(index));
       }
        System.out.print("\n\nWrite the address you would like to add: ");
        input = keyboard.nextLine();
        hold = editData.addAddress(input);
        getData.addAddress(hold);
        for(int index = 0; index < hold.length; index++)
       {
        System.out.printf("\n%s",getData.getAddress(index));
       }
        //its required to have a name if you choose 
        //to import a new address.
        System.out.print("\n\nPlease add a name that is associated with the address: ");
        input = keyboard.nextLine();
        hold = editData.addNames(input);
        getData.addName(hold);
        for(int index = 0; index < hold.length; index++)
       {
        System.out.printf("\n%s",getData.getName(index));
       }
        //Ask the user if he wishes to return or end the
        //program. using the variable "i" from the for 
        //loop from line 50.
        System.out.print("\n\nA. Return to Menu \nB. Exit : ");
        input = keyboard.nextLine();
        answer = input.charAt(0);
        switch (Character.toUpperCase(answer))
       {
        case 'A':
        i = 4;
       break;
                                    
        case 'B':
       break;   
       }
       }
       break;
                
        //Case E. Exit or End program, which contains a string literal 
        //informing the user the program has ended.
        case 'E':
        System.out.println("\n\t\t\tSession Ended.");
        break;
        default:
        break;
        }
        }
    }
    
}

