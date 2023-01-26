package Tema17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tema17_Homework {
    public static void main(String[] args) {

        //HashMap Catalog with some of MY Favourite Songs
        HashMap<String, String> Catalog = new HashMap<>();
        //              Song:               Group:
        Catalog.put("How you like that", "BLACKPINK");
        Catalog.put("BOOMBAYAH", "BLACKPINK");
        Catalog.put("Kill this Love", "BLACKPINK");
        Catalog.put("Ddu-du Ddu-du", "BLACKPINK");
        Catalog.put("Forever Young", "BLACKPINK");
        Catalog.put("Playing with Fire", "BLACKPINK");
        Catalog.put("Wannabe", "ITZY");
        Catalog.put("I can't stop me", "TWICE");
        Catalog.put("Like OOH-AHH", "TWICE");
        Catalog.put("Scientist", "TWICE");
        Catalog.put("The Feels", "TWICE");
        Catalog.put("ICY", "ITZY");
        Catalog.put("Bad Boy", "Red Velvet");
        Catalog.put("Black Mamba", "aespa");

        //Print the Catalog Size and Content
        System.out.println("The Catalog contains: " + Catalog.size() + " songs.");
        System.out.println("The Catalog contains: " + Catalog);
        System.out.println();

        //Create Search Type
        System.out.println("Please Choose Searching by <Group> or Searching by <Song> : ");
        String Answer = new Scanner(System.in).nextLine().toLowerCase();

        // If the user Search by Group
        if (Answer.equals("group"))
        {
            System.out.println("Please Enter Group: ");
            String Group = new Scanner(System.in).nextLine(); // Enter Group Name
            System.out.println();

            SearchByGroup(Catalog, Group); // Call Method to Search for the Entered Group

        }

        // If the user Search by Song
        if (Answer.equals("song"))
        {
            System.out.println("Please Enter Song: ");
            String Song = new Scanner(System.in).nextLine(); // Enter Song Name
            System.out.println();

            SearchBySong(Catalog, Song); // Call Method to Search for the Entered Song
        }
    }

    public static void SearchByGroup(HashMap<String,String> Catalog, String Group)
    {
        //Loop for each Element
        for (Map.Entry<String,String> toSearch : Catalog.entrySet())
        {
            if (toSearch.getValue().equals(Group)) // Check is the current Element equal to the Entered Group
            {
                System.out.println("For this Group: " + Group + " is Found Song: " + toSearch.getKey()); // Print the Found Group
            }
        }
    }

    public static void SearchBySong(HashMap<String,String> Catalog, String Song)
    {
        //Loop for each Element
        for (Map.Entry<String,String> toSearch : Catalog.entrySet())
        {
            if (toSearch.getKey().equals(Song)) // Check is the current Element equal to the Entered Song
            {
                System.out.println("For this Song: " + Song + " is Found Group: " + toSearch.getValue()); // Print the Found Song
            }
        }
    }

}