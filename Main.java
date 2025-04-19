import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        while(keepGoing){
            System.out.println("Welcome to Vinyl Vault! Your Personal Vinyl Tracker!");
            System.out.println("");
            System.out.println("What would you like to do?");
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
                System.out.println("Loading Your Want List...");
                viewWant();
            }

            else if (userChoice.equals("2")){
                System.out.println("Loading Your Have List...");
                viewHave();
            }

            else if (userChoice.equals("3")){
                System.out.println("Loading Your Favorite List...");
                viewFav();
            }

            else if (userChoice.equals("4")){
                System.out.println("Adding Vinyl...");
                System.out.println("");
                System.out.println("What list would you like to add a vinyl to?")
                System.out.println("");
                System.out.println("1) Want List");
                System.out.println("2) Have List");
                System.out.println("3) Favorites List");

                String userList = input.nextLine();

                if (userList.equals("1"));
            }

            else if (userChoice.equals("5")){
                System.out.println("Removing Vinyl...");
                removeVinyl();
            }

            else{
                System.out.println("INVALID INPUT!");
                keepGoing = false;
            }

        }
    }

    public static void viewWant(){
        System.out.println("Want List:");
    }

    public static void viewHave(){
        System.out.println("Have List:");
    }

    public static void viewFav(){
        System.out.println("Favorites");
    }

    public static void addVinyl(){
        System.out.println("Type in the information of your vinyl");
    }

    public static void removeVinyl(){
        System.out.println("What is the title of the ")
    }

}