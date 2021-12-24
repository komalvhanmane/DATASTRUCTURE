public class BinaryNode {
    int data;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int data) {
        this.data = data;
        left=null;
        right=null;
    }
    //Recursive preorder
    public static void preorder(BinaryNode bn){
        if(bn!=null){
            System.out.print(bn.data+" ");
            preorder(bn.left);
            preorder(bn.right);
        }
        System.out.println();
    }
    //Recursive postorder
    public static void postorder(BinaryNode bn){
        if(bn!=null){
            postorder(bn.left);
            postorder(bn.right);
            System.out.print(bn.data+" ");
        }
    }
    //Recursive inorder
    public static void inorder(BinaryNode bn){
        if(bn!=null){
            inorder(bn.left);
            System.out.print(bn.data+" ");
            inorder(bn.right);
        }
    }
    public static void main(String[] args) {

        BinaryNode bn=new BinaryNode(4);
        BinaryNode bn1=new BinaryNode(1);
        BinaryNode bn2=new BinaryNode(6);
        BinaryNode bn3=new BinaryNode(5);
        BinaryNode bn4=new BinaryNode(2);

        bn.left=bn1;
        bn.right=bn2;
        bn1.left=bn3;
        bn1.right=bn4;
        postorder(bn);
        preorder(bn);
        inorder(bn);
    }
}
