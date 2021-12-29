import java.util.Scanner;

public class Stack2 {
    int maxsize;
    int[]arr;
    int top;

    public Stack2(int maxsize) {
        this.maxsize = maxsize;
        top=-1;
        arr=new int[maxsize];
    }

    //isEmpty method
    public boolean isEmpty(){
        return top==-1;
    }

    //isFull method
    public boolean isFull(){
        return top==maxsize-1;
    }

    //push
    public void push(int element){
        if(isFull()){
            System.out.println("stack Overflow");
        }
        else{
            arr[++top]=element;
            System.out.println("Pushed ....."+element);
        }
    }

    //pop
    public void pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
        }
        else{
            int popped=arr[top--];
            System.out.println("popped....."+popped);
        }
    }

    //display
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack2 stack2=new Stack2(5);
        do{
            System.out.println("Enter the choice \n1-Push \n2-pop \n3-Display");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Enter the Data ::");
                    stack2.push(sc.nextInt());
                    break;
                }
                case 2:{
                    stack2.pop();
                    break;
                }
                case 3:{
                    stack2.display();
                    break;
                }
            }
            System.out.println("Do you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
