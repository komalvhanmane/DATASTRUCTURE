import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Album> albums=new LinkedList<>();
        ALbumInfo ai=new ALbumInfo();
        do{
            System.out.println("enter choice \n1-Create Album\n2-Display album\n3-Play Album songs\n4-Add songs in album");
            switch (sc.nextInt()){
                case 1:{
                    ai.createAlbum(albums);
                    break;
                }
                case 2:{
                    ai.diplayalbumName(albums);
                    break;
                }
                case 3:{
                    ai.albumplay(albums);
                    break;
                }
                case 4:{
                    ai.addSong(albums);
                    break;
                }
            }
            System.out.println("Do you want to continue");
        }while (sc.nextInt()==1);

    }
}
