import java.nio.file.Paths;
import java.util.Scanner;

public class CreateMethodRecursive {
    static TreeNode root;

    public static void create(TreeNode root1,TreeNode temp){
        if(root1==null){
            root=temp;
            return;
        }
        else{
            if(root1.data< temp.data){
                if(root1.right==null){
                    root1.right=temp;
                    return;
                }
                else{
                    create(root1.right,temp);
                }
            }
            else{
                if(root1.left==null){
                    root1.left=temp;
                    return;
                }
                else{
                    create(root1.left,temp);
                }
            }
        }
    }

    public static void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        root=null;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the Number :: ");
            int x=sc.nextInt();
            TreeNode temp=new TreeNode(x);
            if(root==null) {
                root=temp;
            }
            else{
                create(root,temp);
            }
            System.out.println("Do you want to continuing adding ? press 1");
        }while (sc.nextInt()==1);

        inorder(root);

    }
}
