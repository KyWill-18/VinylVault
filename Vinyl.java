public class Vinyl {
    protected String title;
    protected String artist;

    public void userVinyl(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the vinyls full title: ");
        title = input.nextLine();

        System.out.println("Enter the artist full name: ");
        artist = input.nextLine();
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public printVinyl(){
        return title + "by" + artist;
    } 
}
