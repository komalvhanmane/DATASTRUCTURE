import java.util.*;

public class Stack1 {
    int top;
    int maxSize;
    int arr[];
    Stack1(int size){
        maxSize=size;
        arr=new int[maxSize];
        top=-1;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if(top==maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean push(int data){
        if(isFull()){
            return true;
        }else{
            arr[++top]=data;
            return false;
        }
    }
    int pop(){
        if(isEmpty()){
            return 0;
        }else{
            return arr[top--];
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            System.out.println("Elements in the Stack are ........");
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack1 stk=new Stack1(4);
        do{
            System.out.println("Enter the choice \n1.Push\n2.pop\n3.display");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Enter the element you want to push");
                    int ele =sc.nextInt();
                    if(stk.push(ele)){
                        System.out.println("Stack overflow");
                    }else{
                        System.out.println("Element Pushed Successfully...");
                    }
                    break;
                }
                case 2:{
                    int i= stk.pop();
                    if(i==0){
                        System.out.println("Stack underflow");
                    }
                    else{
                        System.out.println("popped element is "+i);
                    }
                    break;
                }
                case 3:{
                    stk.display();
                    break;
                }
            }
            System.out.println("Enter the number 1 for continuation");
        }while (sc.nextInt()==1);
        System.out.println("-------------------Thank you---------------------");

        List<Integer> lst=new LinkedList<>();
        Set<Integer> st=new TreeSet<>();
        Object[] arr;
        arr=st.toArray();
        int ans= (int) arr[4];
        List<Integer> s=new ArrayList<>();
    }
}
