import java.util.*;
public class MyProgram {
    public static void main(String[] args) {
   
Scanner scanner = new Scanner(System.in);
 ArrayList<Anime> allAnime = AnimeLibrary.getAllAnime();
   
   ArrayList<WatchList> watchList = new ArrayList<>();
   boolean running = true;
   
   
   System.out.print("Welcome to the Anime explorer!");
   
   while (running){
       System.out.println("\nMenu:");
       System.out.println("1. Browse Action Anime");
       System.out.println("2. Browse Romance Anime");
       System.out.println("3. Search Anime by Title");
       System.out.println("4. Filter Anime by Minimum Rating");
       System.out.println("5. Get a Random Anime suggestion");
       System.out.println("6. Add to watch list");
       System.out.println("7. View WatchList");
       System.out.println("8. Exit");
              System.out.print("\nEnter a number between 1-8: ");

       int choice;
       try {
           choice = Integer.parseInt(scanner.nextLine());
       } catch (NumberFormatException e) {
           System.out.println("Invalid input, please enter a number!");
           continue;
       }

       if (choice == 1) {
           displayList(AnimeLibrary.getActionAnime());
       }
       else if (choice == 2) {
           displayList(AnimeLibrary.getRomanceAnime());
       }
       else if (choice == 3) {
           System.out.print("Enter the title: ");
           String title = scanner.nextLine();
           Anime found = AnimeLibrary.searchByTitle(allAnime, title);
           if (found != null) {
               System.out.println("\nFound:\n" + found);
           } else {
               System.out.println("Anime was not found");
           }
       }
       else if (choice == 4) {
           System.out.print("Enter Minimum Rating (0.0 - 5.0): ");
           try {
               double minRating = Double.parseDouble(scanner.nextLine());
               ArrayList<Anime> filtered = AnimeLibrary.filterByRating(allAnime, minRating);
               if (filtered.size() == 0) {
                   System.out.println("There was no anime found");
               } else {
                   displayList(filtered);
               }
           } catch (NumberFormatException e) {
               System.out.println("Please enter a valid number.");
           }
       }
       else if (choice == 5) {
           int random = (int)(Math.random() * allAnime.size());
           Anime randomPick = allAnime.get(random);
           System.out.println("\nYour random pick is:\n" + randomPick);
       }
       else if (choice == 6) {
           System.out.print("Enter the title: ");
           String userTitle = scanner.nextLine();

           System.out.print("Enter the rating you want to give it (0.0 - 5.0): ");
           try {
               double userRating = Double.parseDouble(scanner.nextLine());
               WatchList userAnime = new WatchList(userTitle, userRating);
               watchList.add(userAnime);
               System.out.println("Added to your watch list!");
           } catch (NumberFormatException e) {
               System.out.println("Please enter a valid number for the rating.");
           }
       }
       else if (choice == 7) {
           if (watchList.isEmpty()) {
               System.out.println("\nYour Watch List is empty");
           } else {
               System.out.println();
               for (WatchList item : watchList) {
                   System.out.println(item);
               }
           }
       }
       else if (choice == 8) {
           running = false;
           System.out.println("Thanks for using the Anime Explorer!");
       }
       else {
           System.out.println("Invalid input, please try again!");
       }

   }  

   scanner.close();
   }  


   public static void displayList(ArrayList<Anime> list) {
       System.out.println("\nAnime List: ");
       for (Anime anime : list) {
           System.out.println("\n----------------------");
           System.out.println(anime);
       }
   }

}