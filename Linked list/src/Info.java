import java.util.Scanner;
public class Info {
    Account ref;
    Account head;
    Scanner sc=new Scanner(System.in);
    public void create(){
        System.out.println("---------------Welcome-------------");
        do{
            System.out.println("Enter the Account Number : ");
            int accId=sc.nextInt();
            System.out.println("Enter the Account Name : ");
            String accName=sc.next();
            System.out.println("Enter the Account Balance : ");
            double accBal=sc.nextInt();
            Account temp=new Account(accId,accName,accBal);
            if(head==null){//List is empty
                head=temp;
            }
            else{
                ref=head;
                while(ref.link!=null){
                    ref=ref.link;
                }
                ref.link=temp;
            }
            System.out.println("Do you want to continue");
        }while (sc.nextInt()==1);
    }
    public void display(){
        int i=1;
        if(head==null){
            System.out.println("List is empty");
        }
        else {
            ref=head;
            while(ref!=null){
                System.out.println("Account "+i);
                System.out.println("-------------------------------------");
                System.out.println("Account number : "+ref.getAccId());
                System.out.println("Account name   : "+ref.getAccName());
                System.out.println("Account Balance: "+ref.getAccBal());
                System.out.println("-------------------------------------");
                ref=ref.link;
                i++;
            }
        }
    }
    public void insert(){
        System.out.println("Enter the position where you want to insert");
        int pos=sc.nextInt();
        System.out.println("Enter the Account Number : ");
        int accId=sc.nextInt();
        System.out.println("Enter the Account Name : ");
        String accName=sc.next();
        System.out.println("Enter the Account Balance : ");
        double accBal=sc.nextInt();
        Account temp=new Account(accId,accName,accBal);
        if(pos==1){
            temp.link=head;
            head=temp;
        }
        else{
            ref=head;
            for(int i=1;i<pos-1;i++){
                ref=ref.link;
            }
            temp.link=ref.link;
            ref.link=temp;
        }
    }
    public void delete(){
        System.out.println("Enter the position number which you want to delete");
        int pos=sc.nextInt();
        if(pos==1){
            head=head.link;
        }
        else{
            Account prev = ref;
            ref=head;
            for(int i=1;i<pos;i++){
                prev=ref;
                ref=ref.link;
            }
            prev.link=ref.link;
        }
    }
}
