import java.util.Scanner;

public class BinaryNode1 {
    int data;
    BinaryNode1 left,right;
    BinaryNode1(int data){
       this.data=data;
        left=null;
        right=null;
    }BinaryNode1 root=null;
    public void insert(){
        Scanner sc=new Scanner(System.in);
        int c=0;
        do{
            System.out.println("Enter the data");
            int value=sc.nextInt();
            BinaryNode1 temp=new BinaryNode1(value);
            if(root==null){
                root=temp;
            }
            else {
                BinaryNode1 ptr=root;
                while (ptr!=null){
                    System.out.println("Enter in which direction you want to insert 1. left direction 2.right direction of "+ptr.data);
                    int c1=sc.nextInt();
                    if(c1==1){
                        if(ptr.left==null){
                            ptr.left=temp;
                            break;
                        }
                        else {
                            ptr=ptr.left;
                        }
                    }
                    else{
                        if(ptr.right==null){
                            ptr.right=temp;
                            break;
                        }
                        else{
                            ptr=ptr.right;
                        }
                    }
                }
            }
            System.out.println("Do you want to continue ");
        }while (sc.nextInt()==1);
    }
    //Postorder recursive traversal
    public static void postorder(BinaryNode1 root){
        //left right root
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    //preorder recursive traversal
    public static void preorder(BinaryNode1 root){
        //root left right//
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    //inorder recursive traversal
    public static void inorder(BinaryNode1 root){
        //left root right
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        BinaryNode1 bn=new BinaryNode1(5);
        bn.insert();
        postorder(bn.root);
    }
}
