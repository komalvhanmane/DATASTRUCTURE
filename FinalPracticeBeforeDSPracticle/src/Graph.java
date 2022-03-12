import java.util.*;

public class Graph {
    int n;
    int e;
    ListNode head[];
    public Graph(){
        n=0;
        e=0;
        head=new ListNode[20];
    }
    Scanner sc=new Scanner(System.in);

    public void insert(int a,int b){
        ListNode temp=new ListNode(b);
        if(head[a]==null){
            head[a]=temp;
        }
        else{
            ListNode ptr=head[a];
            while (ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }
    public void create(){
        //do{
            System.out.println("enter the number of vertices :: ");
            n=sc.nextInt();
            System.out.println("Enter the number of edges :: ");
            e=sc.nextInt();
            for(int i=0;i<e;i++){
                System.out.println("Enter the starting vertex :: ");
                int st=sc.nextInt();
                System.out.println("Enter the ending vertex : :");
                int en=sc.nextInt();
                insert(st,en);
                insert(en,st);
            }
           // System.out.println("Do you want to continue press 1 ");
        //}while (sc.nextInt()==1);

    }

    public void display(){
        for(int i=1;i<=n;i++){
            System.out.println("\nVertex :: "+i);
            ListNode ptr=head[i];
            while (ptr!=null){
                System.out.print(ptr.data+"->");
                ptr=ptr.next;
            }
        }
    }

    public void bfs(){
        int visited[]=new int[20];
        Queue<ListNode> q=new LinkedList<>();
        System.out.println("Enter the starting index");
        int v1=sc.nextInt();
        ListNode v=new ListNode(v1);
        q.add(v);
        visited[v1]=1;
        while (q.size()!=0){
            ListNode temp1=q.remove();
            System.out.println(temp1.data);
            ListNode ptr=head[temp1.data];
            while (ptr!=null){
                if(visited[ptr.data]==0){
                    q.add(ptr);
                    visited[ptr.data]=1;
                }
                ptr=ptr.next;
            }
        }
    }
    public void dfs(){
        int visited[]=new int[20];
        Stack<ListNode> q=new Stack<>();
        System.out.println("Enter the starting index");
        int v1=sc.nextInt();
        ListNode v=new ListNode(v1);
        q.add(v);
        while (q.size()!=0){
            ListNode temp1=q.pop();
            if(visited[temp1.data]==0){
                System.out.println(temp1.data);
                visited[temp1.data]=1;
            }
            ListNode ptr=head[temp1.data];
            LinkedList<ListNode> lst=new LinkedList<>();
            while (ptr!=null){
                lst.add(ptr);
                ptr=ptr.next;
            }
            for(int i=lst.size()-1;i>=0;i--){
                if(visited[lst.get(i).data]==0){
                    q.add(lst.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g=new Graph();
        g.create();
        g.display();
        g.bfs();
        g.dfs();
    }
}