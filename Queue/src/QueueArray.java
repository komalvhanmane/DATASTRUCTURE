import java.util.Scanner;

public class QueueArray {
    int front;
    int rear;
    int queue[];
    int maxsixe;

    public QueueArray(int maxsixe) {
        this.maxsixe = maxsixe;
        front=-1;
        rear=-1;
        queue=new int[maxsixe];
    }
    void insert(int element){
        queue[++rear]=element;
    }
    int delete(){
        if (front==rear){
            System.out.println("Queue is empty");
            return 0;
        }else{
            int d=queue[++front];
            queue[front]=0;
            return d;
        }
    }
    void display(){
        int t=front;
        while (t!=rear){
            System.out.println(queue[++t]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QueueArray q=new QueueArray(5);
        do{
            System.out.println("Enter choice \n1-insert\n2-delete\n3-Display");
            switch(sc.nextInt()){
                case 1:{
                    System.out.println("Enter the Element which you want insert");
                    int ele=sc.nextInt();
                    q.insert(ele);
                    break;
                }
                case 2:{
                    int i=q.delete();
                    System.out.println("popped element :"+i);
                    break;
                }
                case 3:{
                    System.out.println("Displaying the queue");
                    q.display();
                }
            }
            System.out.println("enter 1 for continuation ");
        }while (sc.nextInt()==1);
    }
}
