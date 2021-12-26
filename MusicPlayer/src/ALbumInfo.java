import java.util.LinkedList;
import java.util.Scanner;

public class ALbumInfo {
    Scanner sc=new Scanner(System.in);
    public void createAlbum( LinkedList<Album> albums){
        System.out.println("Enter the Album name ");
        String albname=sc.next();
        System.out.println("Enter the albumId ");
        int id=sc.nextInt();
        Album al=new Album(albname,id);
        albums.add(al);
    }
    public void displayAlbumSongs(Album al){
        System.out.println("Album Name :"+al.getAlbumName());
        System.out.println("Album ID   :"+al.getAlbumID());
        if(al.s!=null){
            for(int i=0;i<al.s.size();i++){
                printSong(al.s.get(i));
            }
        }
    }
    public void diplayalbumName(LinkedList<Album> albums){
        System.out.println("AlbumID\t\tAlbumName");
        for(int i=0;i<albums.size();i++){
            System.out.println(albums.get(i).getAlbumID()+"\t\t"+albums.get(i).getAlbumName());
        }
    }
    public void printSong(Song s){
        System.out.println("-----------------------------------------------");
        System.out.println("Song Name   :"+s.getSongName());
        System.out.println("Song Duration:"+s.getDuration());
        System.out.println("song Artist  :"+s.getArtistName());
        System.out.println("-----------------------------------------------");
    }
    public int searchalbum(int id,LinkedList<Album> albums){
        for(int i=0;i<albums.size();i++){
            if(id==albums.get(i).getAlbumID()){
                return i;
            }
        }
        return -1;
    }
    public void albumplay(LinkedList<Album> albums){
        do{
            System.out.println("Enter the album id that you want to play ");
            int id=sc.nextInt();
            int i=searchalbum(id,albums);
            if(i>=0){
                System.out.println("-------------------------------------------------");
                System.out.println("Album Name :"+albums.get(i).getAlbumName());
                System.out.println("Album ID   :"+albums.get(i).getAlbumID());
                System.out.println("----------------Song List-----------------------");
                for(int j=0;j<albums.get(i).s.size();j++){
                    printSong(albums.get(i).s.get(j));
                }
                System.out.println("Enter the trackNumber you want to play first ");
                int trackNo=sc.nextInt();
                playsong(albums.get(i),trackNo);
            }
            System.out.println("do you want to play song from another album press 1");
        }while (sc.nextInt()==1);
    }
    public void addSong(LinkedList<Album> albums){
        System.out.println("enter the album id where you want to add songs ");
        int id=sc.nextInt();
        int cnt=1;
        int index=searchalbum(id,albums);
        if(index>=0){
            int i=0;
            do{
                System.out.println("song "+(i+1));
                System.out.println("Enter the Song NAme ");
                String sname=sc.next();
                System.out.println("Enter the Duration ");
                int dur=sc.nextInt();
                System.out.println("Enter the artistName ");
                String artName=sc.next();
                Song song=new Song(sname,dur,artName,cnt);
                albums.get(index).s.add(song);
                cnt++;
                System.out.println("do you want to continue press 1");
                i++;
            }while (sc.nextInt()==1);
        }
    }
    public int searchsong(Album al,int trackNo){
        for(int i=0;i<al.s.size();i++){
            if(trackNo==al.s.get(i).getSongID()){
                return i;
            }
        }
        return -1;
    }
    public void playsong(Album al,int trackNo){
        int index=searchsong(al,trackNo);
        if(index>=0){
            System.out.println("Playing........");
            printSong(al.s.get(index));
            System.out.println("Enter choice \n1.Prev \n2-next\n3-replay\n4-stop");
            switch (sc.nextInt()){
                case 1:{
                    playsong(al,trackNo-1);
                    break;
                }
                case 2:{
                    playsong(al,trackNo+1);
                    break;
                }
                case 3:{
                    playsong(al,trackNo);
                    break;
                }
                case 4:{
                    return ;
                }
            }
        }
    }
}
