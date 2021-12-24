public class Stack2 {
    int maxsize;
    int stack[];
    int top;
    Stack2(int maxsize){
        this.maxsize=maxsize;
        top=-1;
        stack=new int[maxsize];
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
        if(top==maxsize-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top]=element;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{

        }
    }
}
