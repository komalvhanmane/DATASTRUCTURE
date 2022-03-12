import java.util.Scanner;

public class Graph {
    int n;//no. of vertices
    int e;//number of edges
    Node[] head;

    public Graph(){
        n=0;
        e=0;
        head=new Node[10];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(int u,int v){
        Node temp=new Node(v);
        if(head[u]==null){
            head[u]=temp;
        }
        else{
            Node ptr=head[u];
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }
    public void create(){
        System.out.println("Enter tha Total Number of vertices :: ");
        n=sc.nextInt();
        System.out.println("Enter the Total Number of edges    :: ");
        e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.println("Enter the first edge Number ::");
            int u=sc.nextInt();
            System.out.println("Enter the second edge Number ::");
            int v=sc.nextInt();
            insert(u,v);
            insert(v,u);
        }
    }

    public void display(){
        for(int i=0;i<n;i++){
            System.out.println("Vertex ::");
            Node ptr=head[i];
            System.out.print(i+" ---> ");
            while (ptr!=null){
                System.out.print(ptr.data+" ---> ");
                ptr=ptr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g=new Graph();
        g.create();
        g.display();
    }
}
