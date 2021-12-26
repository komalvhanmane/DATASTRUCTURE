import java.util.LinkedList;

public class Album {
    private String albumName;
    private int albumID;
    LinkedList<Song> s;

    public Album(String albumName, int albumID) {
        this.albumName = albumName;
        this.albumID = albumID;
        s=new LinkedList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }
}
