public class Queue1 {
    int queue[];
    int maxsize;
    int front,rear;
    public Queue1(int maxsize){
        this.maxsize=maxsize;
        front=0;
        rear=0;
        queue=new int[maxsize];
    }
    boolean isEmpty(){
        return front == 0 && rear==0;
    }
    boolean isFull(){
        return front == maxsize-1 && rear == maxsize-1;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Queue is Empty");
        }
        else{

        }
    }

    public static void main(String[] args) {

    }
}
