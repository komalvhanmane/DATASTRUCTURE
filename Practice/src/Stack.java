import java.util.Scanner;

public class Stack {
    int maxsize;
    int top;
    int []stack;

    public Stack(int maxsize) {
        this.maxsize = maxsize;
        top=-1;
        stack=new int[maxsize];
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull() {
        return top == maxsize - 1;
    }

    //Push which will push an elment in the stack;
    public void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top]=element;
            System.out.println(element+" Pushed......");
        }
    }
    //Pop
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println(stack[top--]+" poppped......");
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack(5);
        do{
            System.out.println("Enter the Choice \n1-PUSH \n2-POP \n3-Display");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the Element which you want to push");
                    s.push(sc.nextInt());
                }
                case 2 -> s.pop();
                case 3 -> {
                    System.out.println("Displaying the List");
                    s.display();
                }
            }
            System.out.println("Do you want to continue press 1 ");
        }while (sc.nextInt()==1);
    }
}
