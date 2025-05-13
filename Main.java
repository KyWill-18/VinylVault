import java.util.*;
//user interface - displays menu, takes user input
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //collection of three list each vinyl will be sorted into
        ArrayList<Vinyl> wantList = new ArrayList<>();
        ArrayList<Vinyl> haveList = new ArrayList<>();
        ArrayList<Vinyl> favList = new ArrayList<>();
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
            //for(Vinyl v : ****List) -> goes through and finds vinyl with that status and prints it out 
            else if (userChoice.equals("1")){
                System.out.println("Viewing Your Want List...");
                for (Vinyl v : wantList){
                    System.out.println(v);
                }
            }

            else if (userChoice.equals("2")){
                System.out.println("Viewing Your Have List...");
                for (Vinyl v : haveList){
                    System.out.println(v);
                }
            }
            
            else if (userChoice.equals("3")){
                System.out.println("Viewing Your Favorite List...");
                for (Vinyl v : favList){
                    System.out.println(v);
                }
                
            }
            //add vinyl -> let's user pick a list to add to 
            else if (userChoice.equals("4")){
                System.out.println("Adding Vinyl...");
                System.out.println("");
                System.out.println("What list would you like to add a vinyl to?");
                System.out.println("");
                System.out.println("1) Want List");
                System.out.println("2) Have List");
                System.out.println("3) Favorites List");

                String userAdd = input.nextLine();
                String status = "";

                if (userAdd.equals("1")){
                    System.out.println("Want List Loading...");
                    System.out.println("");
                    status = "Want";
                }

                else if (userAdd.equals("2")){
                    System.out.println("Have List Loading...");
                    System.out.println("");
                    status = "Have";
                }

                else if (userAdd.equals("3")){
                    System.out.println("Favorites List Loading...");
                    System.out.println("");
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

                Vinyl newVinyl = new Vinyl(title, artist, year, genre,status);

                if (status.equals("Want")){
                    wantList.add(newVinyl);
                }

                else if (status.equals("Have")){
                    haveList.add(newVinyl);
                }

                else if (status.equals("Favorite")){ 
                    favList.add(newVinyl);
                }

                System.out.println(title + " by " + artist + " has been added to your " + status + " list! ");

            }
            //remove vinyl -> let's user pick a list to add from (will remove ONLY from that list)
            else if (userChoice.equals("5")){
                System.out.println("Removing Vinyl...");
                System.out.println("");
                System.out.println("What list would you like to remove a vinyl from?");
                System.out.println("");
                System.out.println("1) Want List");
                System.out.println("2) Have List");
                System.out.println("3) Favorites List");

                String userRemove = input.nextLine();

                if (userRemove.equals("1")){
                    //status = "want";
                    System.out.println("Loading Want List...");
                    for (Vinyl v : wantList){
                        System.out.println(v);
                    }
                }
                
                else if (userRemove.equals("2")){
                   //status = "have";
                    System.out.println("Loading Have List...");
                    for (Vinyl v : haveList){
                        System.out.println(v);
                    }
                }

                else if (userRemove.equals("3")){
                    //status = "favorites";
                    System.out.println("Loading Favorites List...");
                    for (Vinyl v : favList){
                        System.out.println(v);
                }
            }
            
            else{
                System.out.println("INVALID INPUT!");
                keepGoing = false;
            }
        }

        }
    }

}