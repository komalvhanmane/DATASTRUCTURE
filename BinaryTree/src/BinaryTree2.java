import java.util.Scanner;
import java.util.Stack;

public class BinaryTree2 {
    Node root=null;

    Scanner sc=new Scanner(System.in);
    //create
    public void create(){
        do{
            System.out.println("Enter the data :: ");
            int data=sc.nextInt();
            Node temp=new Node(data);
            if(root==null){
                root=temp;
            }
            else{
                Node ptr=root;
                while (ptr!=null){
                    System.out.println("Enter the direction \n1-left\n2-right of "+ptr.data);
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

    //inorder
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    //preorder
    public void preorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    //postorder
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }

    //nonrecursive inorder
    public void inorder1(Node root){
        Stack<Node> s=new Stack<>();
        Node ptr=root;
        s.add(ptr);
        ptr=ptr.left;
        while (ptr!=null || !s.isEmpty()){
            while (ptr!=null){
                s.add(ptr);
                ptr=ptr.left;
            }
            ptr=s.pop();
            System.out.println(ptr.data);
            ptr=ptr.right;
        }
    }

    //nonrecursive preorder
    public void preorder1(Node root){
        Stack<Node> s=new Stack<>();
        Node ptr=root;
        s.add(ptr);
        System.out.println(ptr.data);
        ptr=ptr.left;
        while (ptr!=null || !s.isEmpty()){
            while (ptr!=null){
                System.out.println(ptr.data);
                s.add(ptr);
                ptr=ptr.left;
            }
            ptr=s.pop();
            ptr=ptr.right;
        }
    }

    /*
    * 1. Push root to first stack.
2. Loop while first stack is not empty
   2.1 Pop a node from first stack and push it to second stack
   2.2 Push left and right children of the popped node to first stack
3. Print contents of second stack*/

    public void postorder1(Node root){
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()){
            Node ptr=s1.pop();
            s2.push(ptr);
            if(ptr.left!=null){
                s1.push(ptr.left);
            }
            if(ptr.right!=null){
                s1.push(ptr.right);
            }
        }
        while (!s2.isEmpty()){
            System.out.println(s2.pop().data);
        }
    }
    public static void main(String[] args) {
        BinaryTree2 bt=new BinaryTree2();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the choice \n1-create\n2-recursive inorder\n3-recursive postorder\n4-recursive preorder\n5-nonrecursive inorder\n6-nonrecursive preorder\n7-nonrecursive postorder");
            switch (sc.nextInt()){
                case 1:{
                    bt.create();
                    break;
                }
                case 2:{
                    bt.inorder(bt.root);
                    break;
                }
                case 3:{
                    bt.postorder(bt.root);
                    break;
                }
                case 4:{
                    bt.preorder(bt.root);
                    break;
                }
                case 5:{
                    bt.inorder1(bt.root);
                    break;
                }
                case 6:{
                    bt.preorder1(bt.root);
                    break;
                }
                case 7:{
                    bt.postorder1(bt.root);
                    break;
                }
            }
            System.out.println("Do you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
