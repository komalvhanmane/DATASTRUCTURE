import java.util.Scanner;

public class Stack3 {
    int maxsize;
    int top;
    int stack[];
    public Stack3(int maxsize){
        this.maxsize=maxsize;
        top=-1;
        stack=new int[maxsize];
    }
    //ISEmpty condition
    public boolean isEmpty(){
        return top == -1;
    }
    //IsFull condition
    public boolean isFull(){
        return top == maxsize-1;
    }
    //Push
    public void push(int element){
        if(isFull()){
            System.out.println("Stack OverFlow");
        }
        else{
            stack[++top]=element;
            System.out.println(element+" is pushed....");
        }
    }
    //pop
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println(stack[top--]+" popped....");
        }
    }
    //Displayin the stack
    public void display(){
        System.out.println("Displaying the stack");
        for(int i=top;i>=0;i--){
            System.out.println("|"+stack[i]+"|");
            System.out.println(" | ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack3 s=new Stack3(5);
        do{
            System.out.println("Enter the choice \n1-Push\n2-Pop\n3-Display");
            switch (sc.nextInt()){
                case 1->{
                    System.out.println("Enter the Element you want to push");
                    int ele=sc.nextInt();
                    s.push(ele);
                }
                case 2->{
                    s.pop();
                }
                case 3->{
                    s.display();
                }
            }
            System.out.println("Do you want to continue press 1 ");
        }while (sc.nextInt()==1);
    }
}
