import java.util.*;
public class Solution {
    public static List<Integer> zigZagTraversal(Node root) {
        // Write your code here!
        LinkedList<Integer> lst=new LinkedList<Integer>();
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return null;
        }
        q.add(root);
        int c=1;
        while(!q.isEmpty()){
            Node temp= q.remove();
            lst.add(temp.data);
            if(c%2==0){
                if(temp.right!=null){
                    q.add(temp.right);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                c++;
            }
            else{
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                c++;
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        Node bn=new Node(4);
        Node bn1=new Node(1);
        Node bn2=new Node(6);
        Node bn3=new Node(5);
        Node bn4=new Node(2);

        bn.left=bn1;
        bn.right=bn2;
        bn1.left=bn3;
        bn1.right=bn4;
        List<Integer> l=zigZagTraversal(bn);
        System.out.println(l);
    }
}
