import java.util.Scanner;
import java.util.Stack;

public class BT {
    TreeNode root=null;
    Scanner sc=new Scanner(System.in);
    public void insert(){
        do{
            System.out.println("Enter the data :: ");
            int data=sc.nextInt();
            TreeNode temp=new TreeNode(data);
            if(root==null){
                root=temp;
            }
            else{
                TreeNode ptr=root;
                while (ptr != null) {
                    System.out.println("Enter the choice \n1-left\n2-right of "+ptr.data);
                    int c=sc.nextInt();
                    if(c==1){
                        if(ptr.left==null) {
                            ptr.left = temp;
                            break;
                        }
                        else{
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
            System.out.println("Do you want to continue press 1");
        }while (sc.nextInt()==1);
    }

    //preorder
    public void preorder(TreeNode root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    //preorder nonrecursive
    public void preorder1(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        System.out.println(root.data);
        TreeNode ptr=root.left;
        while (ptr!=null || !stack.empty()){
            while (ptr!=null){
                System.out.println(ptr.data);
                stack.push(ptr);
                ptr=ptr.left;
            }
            ptr=stack.pop();
            ptr=ptr.right;
        }
    }

    //inorder
    public void inorder(TreeNode tr){
        if(tr!=null){
            inorder(tr.left);
            System.out.println(tr.data);
            inorder(tr.right);
        }
    }

    //nonrecursive inorder
    public void inorder1(TreeNode root){
        Stack<TreeNode> s=new Stack<>();
        s.add(root);
        TreeNode ptr=root;
        ptr=ptr.left;
        while (ptr!=null || !s.isEmpty()){
            while (ptr!=null){
                s.push(ptr);
                ptr=ptr.left;
            }
            ptr=s.pop();
            System.out.println(ptr.data);
            ptr=ptr.right;
        }
    }
    public void postorder1(TreeNode root){
        if(root!=null){
            postorder1(root.left);
            postorder1(root.right);
            System.out.println(root.data);
        }
    }
    //postorder
    public void postorder(TreeNode root){
        Stack<TreeNode> str1=new Stack<>();
        Stack<TreeNode> str2=new Stack<>();
        str1.add(root);
        while (!str1.isEmpty()){
            TreeNode temp=str1.pop();
            str2.push(temp);
            if(temp.left!=null){
                str1.push(temp.left);
            }
            if(temp.right!=null){
                str1.push(temp.right);
            }
        }
        while (!str2.isEmpty()){
            System.out.println(str2.pop().data);
        }
    }
    public static void main(String[] args) {
        BT bt=new BT();
        bt.insert();
//        bt.preorder(bt.root);
//        System.out.println();
//        bt.preorder1(bt.root);
        System.out.println();
        bt.postorder(bt.root);
        System.out.println();
        bt.postorder1(bt.root);
    }
}
