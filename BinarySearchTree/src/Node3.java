import org.w3c.dom.Node;

public class Node3 {
    //insertion in BST
    int data;
    Node3 left,right;
    public Node3(int data){
        this.data=data;
        left=null;
        right=null;
    }

    public static void insert(int key,Node3 root){
        Node3 temp=new Node3(key);
        if(root==null){
            root=temp;
        }
        else{
            Node3 prev=null;
            Node3 ptr=root;
            while(ptr!=null){
                prev=ptr;
                if(key==ptr.data){
                    return;
                }
                else if(key<root.data){
                    ptr=ptr.left;
                }
                else{
                    ptr=ptr.right;
                }
            }
            if(prev.data>key){
                prev.left=temp;
            }
            else{
                prev.right=temp;
            }
        }
    }
    public static void display(Node3 root){
        //display in inorder
        //for inorder left root right
        if(root!=null){
            display(root.left);
            System.out.println(root.data);
            display(root.right);
        }
    }
    public static Node3 inORderPredeccesor(Node3 root){
        if(root==null){
            return null;
        }
        root=root.left;
        while(root.right !=null){
            root=root.right;
        }
        return root;
    }
    public static Node3 delete(Node3 root,int value){
        //Searching the node to be deleted
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            root=null;
        }
        else{
            Node3 iPre;
            if(value< root.data){
                root.left=delete(root.left,value);
            }
            else if(value> root.data){
                root.right=delete(root.right,value);
            }
            else{
                iPre=inORderPredeccesor(root);
                root.data=iPre.data;
                root.left=delete(root.left,iPre.data);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Node3 node3=new Node3(12);
        insert(13,node3);
        insert(19,node3);
        insert(1,node3);
        insert(1,node3);
        insert(9,node3);
        display(node3);
        delete(node3,1);
        System.out.println();
        display(node3);
        //System.out.println(node3.left.data);
    }
}
