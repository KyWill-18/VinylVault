import java.util.ArrayList;

public class VinylCollection {
    private ArrayList<Vinyl> wantList = new ArrayList<>();
    private ArrayList<Vinyl> haveList = new ArrayList<>();
    private ArrayList<Vinyl> favList = new ArrayList<>();

    public ArrayList<Vinyl> getWantList() { return wantList; }
    public ArrayList<Vinyl> getHaveList() { return haveList; }
    public ArrayList<Vinyl> getFavList() { return favList; }

    public void addVinyl(Vinyl vinyl){
        if (vinyl.getStatus().equals("Want")){
            wantList.add(vinyl);
        }

        else if (vinyl.getStatus().equals("Have")){
            haveList.add(vinyl);
        }

        else if (vinyl.getStatus().equals("Favorite")){
            favList.add(vinyl);
        }
    }

    public void removeVinyl(Vinyl vinyl){

    }
}
