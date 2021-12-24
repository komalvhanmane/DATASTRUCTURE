import java.util.LinkedList;
import java.util.Queue;

public class Graph1 {
    int i=1;
    int[] visited ={0,0,0,0,0,0,0};
    int[][] a ={
            {0,1,1,1,0,0,0},
            {1,0,1,0,0,0,0},
            {1,1,0,1,1,0,0},
            {1,0,1,0,1,0,0},
            {0,0,1,1,0,1,1},
            {0,0,0,0,1,0,0},
            {0,0,0,0,1,0,0}
    };
    void dfs(int i,int n){
        int j;
        System.out.println(i);
        visited[i]=1;
        for(j=0;j<n;j++){
            if(a[i][j]==1 && visited[j]==0){
                dfs(j,n);
            }
        }
    }
    public static void main(String[] args) {
       // Queue<Integer> q=new LinkedList<>();
        int i=1;
        int[] visited ={0,0,0,0,0,0,0};
        int[][] a ={
                {0,1,1,1,0,0,0},
                {1,0,1,0,0,0,0},
                {1,1,0,1,1,0,0},
                {1,0,1,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}
        };
     /*   System.out.println(i);
        visited[i]=1;
        q.add(i);
        while(!q.isEmpty()){
            int node=q.remove();
            for(int j=0;j<7;j++){
                if(a[node][j]==1 && visited[j]==0){
                    System.out.println(j);
                    visited[j]=1;
                    q.add(j);
                }
            }
        }*/
        Graph1 g=new Graph1();
        g.dfs(1,7);
    }
}
