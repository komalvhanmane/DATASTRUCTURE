public class Song {
    private String songName;
    private int duration;
    private String artistName;
    private int songID;
    Song left;

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    Song right;

    public Song(String songName, int duration, String artistName,int songID) {
        this.songName = songName;
        this.duration = duration;
        this.artistName = artistName;
        this.songID=songID;
        left=null;
        right=null;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
