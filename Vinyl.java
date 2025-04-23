
public class Vinyl {
    private String title;
    private String artist;
    private String year;
    private String genre;
    private String status; 

    public Vinyl(String title, String artist, String year, String genre, String status){
      this.title = title;
      this.artist = artist;
      this.year = year;
      this.genre = genre;
      this.status = status;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getYear(){
        return year;
    }

    public String getGenre(){
        return genre;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return title + " by " + artist + " Released: " + year + " Genre: " + genre;
    } 
}
