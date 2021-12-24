public class StackWithLinkedList {
    int data;
    StackWithLinkedList next;
    StackWithLinkedList(int data){
        this.data=data;
        next=null;
    }
}
class stack{
    StackWithLinkedList head=null;
    boolean isEmpty(){
      return head==null;
    }
    //isFull will npot be there as we are using linked list as a data structure
    public void push(int elemnet){
        StackWithLinkedList temp = new StackWithLinkedList(elemnet);
        if(head==null){
            head=temp;
        }
        else{
            StackWithLinkedList ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
        System.out.println(elemnet+" Pushed.....");
    }
    public void pop(){

    }
    public static void main(String[] args) {

    }
}
