import java.util.Scanner;

public class Hash {
    Account hashtable[]=new Account[10];

    //calculating hashvalue
    public int hashval(int ele){
        return ele%hashtable.length;
    }

    public boolean isFull(){
        for(int i=0;i<hashtable.length;i++){
            if(hashtable[i]==null){
                return false;
            }
        }
        return true;
    }
    Scanner sc=new Scanner(System.in);

    //insert
    public void insert(){
        do{
            if(!isFull()){
                System.out.println("Enter the Account number :: ");
                int acc_no=sc.nextInt();
                System.out.println("Enter the Customer Name  :: ");
                String name=sc.next();
                System.out.println("Enter the Account Balanace:: ");
                double acc_bal=sc.nextInt();
                Account acc=new Account(acc_no,name,acc_bal);
                int hashvalue=hashval(acc.getAcc_no());
                while (hashtable[hashvalue]!=null){
                    hashvalue++;
                    hashvalue=hashval(hashvalue);
                }
                hashtable[hashvalue]=acc;
            }
            else{
                System.out.println("Table is Full !!!");
            }
            System.out.println("Do you want to continue press 1 ");
        }while (sc.nextInt()==1);
    }

    //display
    public void display(){
        for(int i=0;i<hashtable.length;i++){
            if(hashtable[i]!=null){
                System.out.println("---------------------------------------------");
                System.out.println("At index :: "+i);
                System.out.println("Account Number :: "+hashtable[i].getAcc_no());
                System.out.println("Customer Name  :: "+hashtable[i].getCust_name());
                System.out.println("Account Balance:: "+hashtable[i].getAcc_bal());
            }
        }
    }

    //search
    public int search(int acc_no){
        int hashvalue=hashval(acc_no);
        while (hashtable[hashvalue]!=null){
            if(hashtable[hashvalue].getAcc_no()==acc_no){
                return hashvalue;
            }
            hashvalue++;
            hashvalue = hashval(hashvalue);
        }
        return -1;
    }

    //delete
    public void delete(int acc_no){
        int index=search(acc_no);
        if(index==-1){
            System.out.println("Account with this is not found !!");
            return;
        }
        hashtable[index]=null;
        System.out.println("Account deleted successfully");
    }

    //update
    public void update(int acc_no){
        int index=search(acc_no);
        if(index==-1){
            System.out.println("Account with this is not found !!");
            return;
        }
        System.out.println("Enter the choice update \n1-name \n2-balance");
        switch (sc.nextInt()){
            case 1:{
                System.out.println("Enter the updated name you want :: ");
                String name =sc.next();
                System.out.println("Previous name :: "+hashtable[index].getCust_name());
                hashtable[index].setCust_name(name);
                System.out.println("updated name :: "+name);
                break;
            }
            case 2:{
                System.out.println("Enter the updated balance you want :: ");
                double bal =sc.nextDouble();
                System.out.println("Previous balance :: "+hashtable[index].getAcc_bal());
                hashtable[index].setAcc_bal(bal);
                System.out.println("updated balance  :: "+bal);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hash h=new Hash();
        do{
            System.out.println("Enter the choice \n1-insert\n2-display\n3-update\n4-delete");

            switch (sc.nextInt()){
                case 1:{
                    h.insert();
                    break;
                }
                case 2:{
                    h.display();
                    break;
                }
                case 3:{
                    System.out.println("Enter the acc number where you want to update ::");
                    h.update(sc.nextInt());
                    break;
                }
                case 4:{
                    System.out.println("Enter the acc number which you want to delete :: ");
                    h.delete(sc.nextInt());
                    break;
                }
            }
            System.out.println("Do you want to continue press 1 ");
        }while (sc.nextInt()==1);

    }
}
