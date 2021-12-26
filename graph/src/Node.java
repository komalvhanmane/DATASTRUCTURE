/*
 * NAME ;- KOMAL VHANMANE
 * ROLL NO :- 2470
 * CNO:-C22020221471
 * ASSIGNMENT-7
 * DATE OF SUBMISSION :- 27-12-21*/
import java.util.*;
class Node{
    int data;
    Node link;

    Node (int data){
        this.data=data;
        link=null;
    }
}
class Graph2{
    int n;//number of vertices
    int e;//number of edges
    int [][]adjMat;//adjatancy matrix
    Node []head;//adjantancy List

    Graph2(){
        n=0;
        e=0;
        head=new Node[20];
        adjMat=new int[n+1][n+1];
    }
    int[] visited ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//visited array to store store the record which is visited and which is not

    Scanner sc=new Scanner(System.in);
    void createUsingAdjMatrix(){
        System.out.println("Enter the number of vertices ");
        n=sc.nextInt();//4
        System.out.println("Enter the Number of Edges ");
        e=sc.nextInt();//3
        adjMat=new int[n+1][n+1];
        for(int i=0;i<adjMat.length;i++) {
            for(int j=0;j<adjMat.length;j++) {
                adjMat[i][j]=0;
            }
        }
        for(int i=0;i<e;i++) {
            System.out.println("Enter the one end of edge and another end of edge ");
            int u=sc.nextInt();//1
            int v=sc.nextInt();//2
            adjMat[u][v]=1;
            adjMat[v][u]=1;
        }
    }

    void displayAdjMatrix(){
        System.out.println("Adjacency Matrix is :- ");
        //4 3 1-2 2-3 3-4
        /*  0 1 2 3 4
         *0 0 0 0 0 0
         *1 0 0 1 0 0
         *2 0 1 0 1 0
         *3 0 0 0 0 1
         *4 0 0 0 0 0*/
        for(int i=0;i<adjMat.length;i++) {//5
            for(int j=0;j<adjMat.length;j++) {//5
                if(adjMat[i][j]==1) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    void insert(int a,int b){
        Node temp=new Node(b);
        if(head[a]==null){
            head[a]=temp;
        }
        else{
            Node ptr=head[a];
            while(ptr.link!=null){
                ptr=ptr.link;
            }
            ptr.link=temp;
        }
    }

    void createUsingAdjList(){
        System.out.println("Enter the number of vertices ");
        n=sc.nextInt();
        System.out.println("Enter the Number of Edges ");
        e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.println("Enter the one end of edge and another end of edge ");
            int u=sc.nextInt();
            int v=sc.nextInt();
            insert(u,v);
            insert(v,u);
        }

    }

    void displayAdjList(){
        for(int i=1;i<n;i++){
            System.out.println("Adjacency list of vertex " + i);
            Node ptr=head[i];
            while(ptr!=null){
                System.out.println(ptr.data);
                ptr=ptr.link;
            }
            System.out.println();
        }
    }


    void bfs(){
        Queue<Node> q=new LinkedList<>();//using queue as it is FIFO
        int visited[]=new int[20];//visited array to store store the record which is visited and which is not
        for(int i=0;i<visited.length;i++){
            visited[i]=0;//initialising each elment of visited array by 0
        }
        //asking user to enter the vertex number from where you want to start
        System.out.println("Enter the Starting Vertex ");
        int v=sc.nextInt();
        System.out.println();

        Node v1=new Node(v);
        q.add(v1);
        visited[v]=1;

        while(!q.isEmpty()){
            v1=q.remove();
            System.out.println(v1.data);
            Node ptr=head[v1.data];
            while(ptr!=null){
                if(visited[ptr.data]==0){
                    q.add(ptr);
                    visited[ptr.data]=1;
                }
                ptr=ptr.link;
            }
        }
    }
    int[] visited1 ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//visited array to store store the record which is visited and which is not

    void recursiveDfsmatrix(int i,int m){
        int j;
        System.out.println(i);
        visited1[i]=1;
        for(j=0;j<n+1;j++){
            if(visited1[j]==0 && adjMat[i][j]==1){
                recursiveDfsmatrix(j,n);
            }
        }
    }
    int[] visited2 ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//visited array to store store the record which is visited and which is not

    void recursiveDfsList(int i,int m){
        visited2[i]=1;
        Node p=head[i];
        System.out.println(i);
        while(p!=null){
            int w=p.data;
            if(visited2[w]==0){
                recursiveDfsList(w,n);
            }
            p=p.link;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph2 g=new Graph2();
        do{
            System.out.println("Enter the choice \n1-.Adjacency Matrix\n2-.Adjacency List\n3-Exit");
            switch (sc.nextInt()){
                case 1:{
                    do{
                        System.out.println("Enter the choice \n1-Create a Matrix Graph\n2-Display A Matrix edges\n3-DFS-Traversal");
                        switch (sc.nextInt()){
                            case 1:{
                                g.createUsingAdjMatrix();
                                break;
                            }
                            case 2:{
                                g.displayAdjMatrix();
                                break;
                            }
                            case 3:{
                                System.out.println("Enter the starting vertex");
                                int c=sc.nextInt();
                                g.recursiveDfsmatrix(c,g.n);
                                break;
                            }
                        }
                        System.out.println("Do you want to continuing in AdjaMatrix? if yes press 1");
                    }while (sc.nextInt()==1);
                    break;
                }
                case 2:{
                    do{
                        System.out.println("Enter the choice \n1-Create a List Representation Graph\n2-Display each List\n3-DFS-Traversal\n4-BFS traversal");
                        switch (sc.nextInt()){
                            case 1:{
                                g.createUsingAdjList();
                                break;
                            }
                            case 2:{
                                g.displayAdjList();
                                break;
                            }
                            case 3:{
                                System.out.println("Enter the starting vertex");
                                int c=sc.nextInt();
                                g.recursiveDfsList(c,g.n);
                                break;
                            }
                            case 4:{
                                System.out.println();
                                g.bfs();
                                break;
                            }
                        }
                        System.out.println("Do you want to continuing in AdjList? if yes press 1");
                    }while (sc.nextInt()==1);
                    break;
                }
                case 3:{
                    System.exit(0);
                }
            }
            System.out.println("Do you want to continuing in chossing method? if yes press 1");
        }while (sc.nextInt()==1);
    }
}

