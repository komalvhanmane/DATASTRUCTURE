import java.util.Scanner;

class Node1{
    int data;
    Node1 link;
    public Node1(int data){
        this.data=data;
        link=null;
    }
}
public class Stack4 {
    Node1 head=null;
    public void push(int element){
        Node1 temp=new Node1(element);
        if (head != null) {
            temp.link = head;
        }
        head=temp;
    }
    public int pop(){
            int v= head.data;
            head=head.link;
            return v;
    }
    public void display(){
        Node1 ptr=head;
        while (ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       //Stack3 s=new Stack3(5);
        Stack4 s=new Stack4();
        do{
            System.out.println("Enter the choice \n1-Push\n2-Pop\n3-Display");
            switch (sc.nextInt()){
                case 1->{
                    System.out.println("Enter the Element you want to push");
                    int ele=sc.nextInt();
                    s.push(ele);
                }
                case 2->{
                   int c= s.pop();
                    System.out.println(c+" popped...");
                }
                case 3->{
                    s.display();
                }
            }
            System.out.println("Do you want to continue press 1 ");
        }while (sc.nextInt()==1);
    }
}
