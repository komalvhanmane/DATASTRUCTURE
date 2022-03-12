import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class graph1 {
    int n;
    int e;
    Node head[];

    public graph1() {
        n = 0;
        e = 0;
        head = new Node[20];
    }
    Scanner sc=new Scanner(System.in);
    public void insert(int a,int b){
        Node newnode=new Node(b);
        if(head[a]==null){
            head[a]=newnode;
        }
        else{
            Node ptr=head[a];
            while (ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
    }
    //create
    public void create(){
        System.out.println("Enter the number of vertices :: ");
        n=sc.nextInt();
        System.out.println("Enter the number of edges :: ");
        e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.println("Enter the starting index :: ");
            int i1=sc.nextInt();
            System.out.println("Enter the ending index :: ");
            int i2=sc.nextInt();
            insert(i1,i2);
            insert(i2,i1);
        }
    }

    //display
    public void display(){
        for(int i=1;i<=n;i++){
            System.out.print("\nVertex : "+ i );

            Node ptr=head[i];
            System.out.println();
            while (ptr!=null){
                System.out.print(ptr.data+"-->");
                ptr=ptr.next;
            }
        }
    }

    //bfs
    public void bfs(){
        int visited[]=new int[20];
        Queue<Node> q=new LinkedList<>();
        System.out.println("Enter the starting index :: ");
        int in=sc.nextInt();
        Node s1=new Node(in);
        q.add(s1);
        visited[s1.data]=1;
        while (q.size()!=0){
            Node ptr=q.remove();
            System.out.println(ptr.data);
            Node ptr1=head[ptr.data];
            while (ptr1!=null){
                if(visited[ptr1.data]==0){
                    q.add(ptr1);
                    visited[ptr1.data]=1;
                }
                ptr1=ptr1.next;
            }
        }
    }
    public void dfs(){
        int visited[]=new int[20];
        Stack<Node> q=new Stack<>();
        System.out.println("Enter the starting index :: ");
        int in=sc.nextInt();
        Node s1=new Node(in);
        q.add(s1);
        while (q.size()!=0){
            Node ptr=q.pop();
            if(visited[ptr.data]==0){
                System.out.println(ptr.data);
                visited[ptr.data]=1;
            }
            Node ptr1=head[ptr.data];
            LinkedList<Node> lst=new LinkedList<>();
            while (ptr1!=null){
                if(visited[ptr1.data]==0){
                    lst.add(ptr1);
                    //q.add(ptr1);
                    //visited[ptr1.data]=1;
                }
                ptr1=ptr1.next;
            }
            for(int i=lst.size()-1;i>=0;i--){
                q.add(lst.get(i));
            }
        }
    }
    public static void main(String[] args) {
        graph1 g=new graph1();
        g.create();
        g.display();
        g.bfs();
        g.dfs();
    }
}
