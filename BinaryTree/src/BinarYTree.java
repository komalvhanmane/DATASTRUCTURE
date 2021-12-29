import java.util.Scanner;

public class BinarYTree {
    Node root=null;
    //Create
    Scanner sc=new Scanner(System.in);
    public void accept(){
        do{
            System.out.println("Enter the element :: ");
            int ele=sc.nextInt();
            Node temp=new Node(ele);
            if(root==null){
                root=temp;
            }
            else{
                Node ptr=root;
                while (ptr!=null){
                    System.out.println("Enter the choice 1.Left 2.Right of "+ptr.data);
                    int c=sc.nextInt();
                    if(c==1){
                        if(ptr.left==null){
                            ptr.left=temp;
                            break;
                        }
                        else{
                            ptr=ptr.left;
                        }
                    }
                    else if(c==2){
                        if(ptr.right==null){
                            ptr.right=temp;
                            break;
                        }
                        else{
                            ptr=ptr.right;
                        }
                    }
                    else{
                        System.out.println("Invalid choice ");
                    }
                }
            }
            System.out.println("do you want to continue press 1");
        }while (sc.nextInt()==1);
    }

    //inorder traversal
    public void inorder(Node root){
        //left root right
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    //preorder
    public void preorder(Node root){
        //root left right
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    //postorder
    public void postorder(Node root){
        //left right root
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinarYTree b=new BinarYTree();
        do{
            System.out.println("Enter the choice \n1-Create/Insert\n2-Inorder traversal\n3-preorder traversal\n4-postorder traversal");
            switch (sc.nextInt()){
                case 1:{
                    b.accept();
                    break;
                }
                case 2:{
                    System.out.println("INORDER TRAVERSAL");
                    b.inorder(b.root);
                    break;
                }
                case 3:{
                    System.out.println("PREORDER TRAVERSAL");
                    b.preorder(b.root);
                    break;
                }
                case 4:{
                    System.out.println("POSTORDER TRAVERSAL ");
                    b.postorder(b.root);
                    break;
                }
            }
            System.out.println("do you want to continue press 1");
        }while (sc.nextInt()==1);
        System.out.println("---------------------------THANK YOU--------------------------");
    }
}
