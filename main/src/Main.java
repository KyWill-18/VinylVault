import java.util.*;
import com.google.gson.Gson;

//user interface - displays menu, takes user input
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //collection of three list each vinyl will be sorted into
        VinylCollection collection = new VinylCollection();

        //Hardcoded for testing
        collection.addVinyl(new Vinyl("For Cryin' Out Loud!", "FINNEAS", "2024", "Alt", "Want"));
        collection.addVinyl(new Vinyl("Sunburn", "Dominic Fike", "2023", "Alt", "Want"));
        collection.addVinyl(new Vinyl("Hit Me Hard And Soft", "Billie Eilish", "2024", "Alt", "Have"));
        collection.addVinyl(new Vinyl("Swimming", "Mac Miller", "2018", "Rap", "Have"));
        collection.addVinyl(new Vinyl("Hit Me Hard And Soft", "Billie Eilish", "2024", "Alt", "Fav"));
        collection.addVinyl(new Vinyl("Blonde", "Frank Ocean", "2016", "Pop", "Fav"));
        boolean keepGoing = true;

        while(keepGoing){
            //welcome menu
            System.out.println("Welcome to Vinyl Vault! Your Personal Vinyl Tracker!");
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("0) Exit");
            System.out.println("1) View Want List");
            System.out.println("2) View Have List");
            System.out.println("3) View Favorite List");
            System.out.println("4) Add Vinyl");
            System.out.println("5) Remove Vinyl");

            String userChoice = input.nextLine();

            if (userChoice.equals("0")){
                System.out.println("Goodbye!");
                keepGoing = false;
            }

            else if (userChoice.equals("1")){
                System.out.println("Viewing Your Want List...");

                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                for (int v = 0; v < collection.getWantList().size(); v++){
                    System.out.println((v + 1) + ". " + collection.getWantList().get(v));

                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press ENTER to return to the Main Menu...");

                scanner.nextLine();
            }

            else if (userChoice.equals("2")){
                System.out.println("Viewing Your Have List...");

                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                for (int v = 0; v < collection.getHaveList().size(); v++){
                    System.out.println((v + 1) + ". " + collection.getHaveList().get(v));
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press ENTER to return to the Main Menu...");

                scanner.nextLine();
            }
            
            else if (userChoice.equals("3")){
                System.out.println("Viewing Your Favorite List...");

                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                for (int v = 0; v < collection.getFavList().size(); v++){
                    System.out.println((v + 1) + ". " + collection.getFavList().get(v));
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press ENTER to return to the Main Menu...");

                scanner.nextLine();
                
            }
            //add vinyl
            else if (userChoice.equals("4")){
                System.out.println("Adding Vinyl...");

                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                System.out.println("What list would you like to add a vinyl to?");
                System.out.println("");
                System.out.println("1) Want List");
                System.out.println("2) Have List");
                System.out.println("3) Favorites List");

                String userAdd = input.nextLine();
                String status = "";

                if (userAdd.equals("1")){
                    status = "Want";
                }

                else if (userAdd.equals("2")){
                    status = "Have";
                }

                else if (userAdd.equals("3")){
                    status = "Favorite";
                }

                else{
                    System.out.println("INVALID INPUT!");

                }

                System.out.println("What is the title of the vinyl? ");
                String title = input.nextLine();

                System.out.println("What is the artist? ");
                String artist = input.nextLine();

                System.out.println("What year was it released? ");
                String year = input.nextLine();

                System.out.println("What is the genre? ");
                String genre = input.nextLine();

                Vinyl newVinyl = new Vinyl(title, artist, year, genre, status);

                collection.addVinyl(newVinyl);

                System.out.println(title + " by " + artist + " has been added to your " + status + " list! ");


            }
            //remove vinyl
            else if (userChoice.equals("5")){
                System.out.println("Removing Vinyl...");

                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                System.out.println("What list would you like to remove a vinyl from?");
                System.out.println("");
                System.out.println("1) Want List");
                System.out.println("2) Have List");
                System.out.println("3) Favorites List");

                String userRemove = input.nextLine();

                if (userRemove.equals("1")){
                    for (int v = 0; v < collection.getWantList().size(); v++){
                        System.out.println((v + 1) + ". " + collection.getWantList().get(v));
                    }
                    System.out.println("Input the number of the vinyl you would like to remove: ");
                    Scanner remove = new Scanner(System.in);

                    int v = remove.nextInt();
                    Vinyl Removed = collection.getWantList().get(v - 1);

                    System.out.println("Are you sure you want to remove " + Removed.getTitle() + " by " + Removed.getArtist() + " from your " + Removed.getStatus() + " list? (Y/N)");
                    String userConfirm = input.nextLine();

                    if (userConfirm.equals("Y")){
                        collection.removeVinyl(userRemove, v - 1);
                        System.out.println(Removed.getTitle() + " by " + Removed.getArtist() + " has been removed from your " + Removed.getStatus() + " list!\nNow Returning to Main Menu...");
                        try{
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }

                    else if (userConfirm.equals("N")){
                        System.out.println("This vinyl will NOT be removed!\nReturning to Main Menu...");
                        try{
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }

                    else
                        System.out.println("INVALID INPUT!");
                }
                
                else if (userRemove.equals("2")){

                    for (int v = 0; v < collection.getHaveList().size(); v++){
                        System.out.println((v + 1) + ". " + collection.getHaveList().get(v));
                    }
                    System.out.println("Input the number of the vinyl you would like to remove: ");
                    Scanner remove = new Scanner(System.in);

                    int v = remove.nextInt();
                    Vinyl Removed = collection.getHaveList().get(v - 1);

                    System.out.println("Are you sure you want to remove " + Removed.getTitle() + " by " + Removed.getArtist() + " from your " + Removed.getStatus() + " list? (Y/N)");
                    String userConfirm = input.nextLine();

                    if (userConfirm.equals("Y")){
                        collection.removeVinyl(userRemove, v - 1);
                        System.out.println(Removed.getTitle() + " by " + Removed.getArtist() + " has been removed from your " + Removed.getStatus() + " list!");
                    }

                    else if (userConfirm.equals("N")){
                        System.out.println("This vinyl will NOT be removed!");
                    }

                    else
                        System.out.println("INVALID INPUT!");

                }

                else if (userRemove.equals("3")){

                    for (int v = 0; v < collection.getFavList().size(); v++){
                        System.out.println((v + 1) + ". " + collection.getFavList().get(v));
                }
                    System.out.println("Input the number of the vinyl you would like to remove: ");
                    Scanner remove = new Scanner(System.in);

                    int v = remove.nextInt();
                    Vinyl Removed = collection.getFavList().get(v - 1);

                    System.out.println("Are you sure you want to remove " + Removed.getTitle() + " by " + Removed.getArtist() + " from your " + Removed.getStatus() + " list? (Y/N)");
                    String userConfirm = input.nextLine();

                    if (userConfirm.equals("Y")){
                        collection.removeVinyl(userRemove, v - 1);
                        System.out.println(Removed.getTitle() + " by " + Removed.getArtist() + " has been removed from your " + Removed.getStatus() + " list!");
                    }

                    else if (userConfirm.equals("N")){
                        System.out.println("This vinyl will NOT be removed!");
                    }

                    else
                        System.out.println("INVALID INPUT!");
            }
            
            else{
                System.out.println("INVALID INPUT!");
                keepGoing = false;
            }
        }

        }
    }

}