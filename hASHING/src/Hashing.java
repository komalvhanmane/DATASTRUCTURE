import java.util.Scanner;

public class Hashing {
    int arr[];
    Hashing(){
        arr=new int[10];
    }

    public int hash(int ele){
        return ele%arr.length;
    }
    Scanner sc=new Scanner(System.in);
    public boolean isFull(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
    //linear probing
    public void insert(){
        do{
            if(isFull()){
                System.out.println("Table is full");
            }
            else{
                System.out.println("Enter the data :: ");
                int data=sc.nextInt();
                int hashvalue=hash(data);
                while (arr[hashvalue]!=0){
                    hashvalue++;
                    hashvalue=hash(hashvalue);
                }
                arr[hashvalue]=data;
            }
            System.out.println("Do you want to continue adding press 1");
        }while (sc.nextInt()==1);
    }
    public void insertQuadratic(){
        do{
            if(isFull()){
                System.out.println("Table is full");
            }
            else{
                System.out.println("Enter the data :: ");
                int data=sc.nextInt();
                int hashvalue=hash(data);
                int i=0;
                while (arr[hashvalue]!=0){
                    hashvalue=(hash(hashvalue)+(i*i))%10;
                    i++;
                }
                arr[hashvalue]=data;
            }
            System.out.println("Do you want to continue adding press 1");
        }while (sc.nextInt()==1);
    }
    public void doubleHashing(){
        do{
            if(isFull()){
                System.out.println("Table is full");
            }
            else{
                System.out.println("Enter the data :: ");
                int data=sc.nextInt();
                int hashvalue=hash(data);
                int h2=7-hash(hashvalue)%7;

                int i=0;
                while (arr[hashvalue]!=0){
                    hashvalue=(hash(hashvalue)+i*h2)%10;
                    i++;
                }
                arr[hashvalue]=data;
            }
            System.out.println("Do you want to continue adding press 1");
        }while (sc.nextInt()==1);
    }
    public void display(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println(i+" "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Hashing h=new Hashing();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the choice \n1-inset \n2-display\n3-insertQuadratic\n4-double hashing");
            switch (sc.nextInt()){
                case 1: {
                    h.insert();
                    break;
                }
                case 2:{
                    h.display();
                    break;
                }
                case 3:{
                    h.insertQuadratic();
                    break;
                }
                case 4:{
                    h.doubleHashing();
                    break;
                }
            }
            System.out.println("Do you wamt to continue ");
        }while (sc.nextInt()==1);
    }
}
