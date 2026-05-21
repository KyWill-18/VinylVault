import java.util.*;

//user interface - displays menu, takes user input
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //collection of three list each vinyl will be sorted into
        ArrayList<Vinyl> wantList = new ArrayList<>();
        ArrayList<Vinyl> haveList = new ArrayList<>();
        ArrayList<Vinyl> favList = new ArrayList<>();

        //Hardcoded for testing
        wantList.add(new Vinyl("For Cryin' Out Loud!", "FINNEAS", "2024", "Alt", "Want"));
        wantList.add(new Vinyl("Sunburn", "Dominic Fike", "2023", "Alt", "Want"));
        haveList.add(new Vinyl("Hit Me Hard And Soft", "Billie Eilish", "2024", "Alt", "Have"));
        haveList.add(new Vinyl("Swimming", "Mac Miller", "2018", "Rap", "Have"));
        favList.add(new Vinyl("Hit Me Hard And Soft", "Billie Eilish", "2024", "Alt", "Fav"));
        favList.add(new Vinyl("Blonde", "Frank Ocean", "2016", "Pop", "Fav"));
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
                for (int v = 0; v < wantList.size(); v++){
                    System.out.println((v + 1) + ". " + wantList.get(v));

                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press ENTER to return to the Main Menu...");

                scanner.nextLine();
            }

            else if (userChoice.equals("2")){
                System.out.println("Viewing Your Have List...");
                for (int v = 0; v < haveList.size(); v++){
                    System.out.println((v + 1) + ". " + haveList.get(v));
                }
            }
            
            else if (userChoice.equals("3")){
                System.out.println("Viewing Your Favorite List...");
                for (int v = 0; v < favList.size(); v++){
                    System.out.println((v + 1) + ". " + favList.get(v));
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

                Vinyl newVinyl = new Vinyl(title, artist, year, genre, status);

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
                    System.out.println("Loading Want List...");
                    for (int v = 0; v < wantList.size(); v++){
                        System.out.println((v + 1) + ". " + wantList.get(v));
                    }
                    System.out.println("Input the number of the vinyl you would like to remove: ");
                    Scanner remove = new Scanner(System.in);

                    int v = remove.nextInt();
                    Vinyl Removed = wantList.get(v - 1);

                    System.out.println("Are you sure you want to remove " + Removed.getTitle() + " by " + Removed.getArtist() + " from your " + Removed.getStatus() + " list? (Y/N)");
                    String userConfirm = input.nextLine();

                    if (userConfirm.equals("Y")){
                        wantList.remove(v - 1);
                        System.out.println(Removed.getTitle() + " by " + Removed.getArtist() + " has been removed from your " + Removed.getStatus() + " list!");
                    }

                    else if (userConfirm.equals("N")){
                        System.out.println("This vinyl will NOT be removed!");
                    }

                    else
                        System.out.println("INVALID INPUT!");
                }
                
                else if (userRemove.equals("2")){
                    System.out.println("Loading Have List...");
                    for (int v = 0; v < haveList.size(); v++){
                        System.out.println((v + 1) + ". " + haveList.get(v));
                    }
                    System.out.println("Input the number of the vinyl you would like to remove: ");
                    Scanner remove = new Scanner(System.in);

                    int v = remove.nextInt();
                    Vinyl Removed = haveList.get(v - 1);

                    System.out.println("Are you sure you want to remove " + Removed.getTitle() + " by " + Removed.getArtist() + " from your " + Removed.getStatus() + " list? (Y/N)");
                    String userConfirm = input.nextLine();

                    if (userConfirm.equals("Y")){
                        haveList.remove(v - 1);
                        System.out.println(Removed.getTitle() + " by " + Removed.getArtist() + " has been removed from your " + Removed.getStatus() + " list!");
                    }

                    else if (userConfirm.equals("N")){
                        System.out.println("This vinyl will NOT be removed!");
                    }

                    else
                        System.out.println("INVALID INPUT!");

                }

                else if (userRemove.equals("3")){
                    System.out.println("Loading Favorites List...");
                    for (int v = 0; v < favList.size(); v++){
                        System.out.println((v + 1) + ". " + favList.get(v));
                }
                    System.out.println("Input the number of the vinyl you would like to remove: ");
                    Scanner remove = new Scanner(System.in);

                    int v = remove.nextInt();
                    Vinyl Removed = favList.get(v - 1);

                    System.out.println("Are you sure you want to remove " + Removed.getTitle() + " by " + Removed.getArtist() + " from your " + Removed.getStatus() + " list? (Y/N)");
                    String userConfirm = input.nextLine();

                    if (userConfirm.equals("Y")){
                        favList.remove(v - 1);
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