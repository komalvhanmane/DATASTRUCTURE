
public class BinaryTreeNode {
    int data;
    BinaryTreeNode left,right;
    public BinaryTreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
    public static void inorder(BinaryTreeNode root){
        //left root right
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    public static int BST(BinaryTreeNode root){
        BinaryTreeNode ptr=null;
        if(root!=null){
            if(BST(root.left)==0){
                return 0;
            }
            if(ptr!=null && root.data<=ptr.data){
                return 0;
            }
            ptr=root;
            return BST(root.right);
        }
        else {
            return 1;
        }
    }
    public static BinaryTreeNode Search(BinaryTreeNode node,int key){
        if(node==null){
            return null;
        }
        else if(node.data==key){
            return node;
        }
        else if(node.data>key){
           return Search(node.left,key);
        }
        else {
            return Search(node.right,key);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode b1=new BinaryTreeNode(9);
        BinaryTreeNode b2=new BinaryTreeNode(4);
        BinaryTreeNode b3=new BinaryTreeNode(11);
        BinaryTreeNode b4=new BinaryTreeNode(8);
        BinaryTreeNode b5=new BinaryTreeNode(7);
        BinaryTreeNode b6=new BinaryTreeNode(5);
        BinaryTreeNode b7=new BinaryTreeNode(8);
        BinaryTreeNode b8=new BinaryTreeNode(15);
        BinaryTreeNode b9=new BinaryTreeNode(14);
        b1.left=b2;
        b1.right=b3;
        b2.left=b4;
        b2.right=b5;
        b5.left=b6;
        b5.right=b7;
        b3.right=b8;
        b8.left=b9;
        //always remember the if you want to check if the Given tree is binary search tree or not check the inorder traversal then we will get sorted order then it is a BST
        //It is a recursive method
        inorder(b1);
        //Now lets see iterative method
        //BST
       int c= BST(b1);
       if(c==1){
           System.out.println("IT is a binary Search tree ");
       }
       else{
           System.out.println("IT is not a binary tree ");
       }
       BinaryTreeNode node=Search(b1,2);
       if(node==null){
           System.out.println("Element Not found");
       }
       else{
           System.out.println("Found : "+node.data);
       }
    }
}
