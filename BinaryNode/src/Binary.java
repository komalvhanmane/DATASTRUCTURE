import java.util.Scanner;

public class Binary {
    Scanner sc=new Scanner(System.in);
    Node root=null;
    //create
    public void create(int element){
        Node temp=new Node(element);
        if(root==null){
            root=temp;
        }
        else{
            Node prev=root;
            Node ptr=root;
            while (ptr!=null && element!=ptr.data){
                prev=ptr;
                if(ptr.data>element){
                    ptr=ptr.left;
                }
                else {
                    ptr=ptr.right;
                }
            }
            if(prev.data<element){
                prev.right=temp;
            }
            else{
                prev.left=temp;
            }
        }
    }
    //search
    public void search(int ele){
        if(root!=null){
            if(root.data==ele){
                System.out.println("Data found");
            }
            else{
                Node ptr=root;
                while (ptr!=null && ptr.data!=ele){
                    if(ptr.data<ele){
                        ptr=ptr.right;
                    }
                    else {
                        ptr=ptr.left;
                    }
                }
                if(ptr==null){
                    System.out.println("Data Not found");
                }else{
                    System.out.println("Found");
                }
            }
        }
    }
    //delete leaf Node
    //delete node with one child
    //delete node with two child
    public void delete(){
        //1 3 4 6 7 8 10 13 14
        Node parent=root;
        Node ptr=root;
        System.out.println("Enter the data :: ");
        int data=sc.nextInt();
        while (ptr!=null){
            if(ptr.data==data){
                if(ptr.left!=null && ptr.right!=null){
                    Node temp=root;
                    temp=temp.left;
                    while (temp.right!=null){
                        parent=temp;
                        temp=temp.right;
                    }
                    ptr.data= temp.data;
                    if(temp.left!=null){
                        parent.left=temp.left;
                    }
                    else{
                        parent.right=null;
                    }
                    break;
                }
                if(ptr.left!=null && ptr.right==null){
                    if(parent.left==ptr){
                        parent.left=ptr.left;
                    }
                    else if(parent.right==ptr){
                        parent.right=ptr.left;
                    }
                    break;
                }
                if(ptr.right!=null && ptr.left==null){
                    if(parent.left==ptr){
                        parent.left=ptr.right;
                    }
                    else if(parent.right==ptr){
                        parent.right=ptr.right;
                    }
                    break;
                }
                if(ptr.right==null && ptr.left==null){
                    if(ptr==root){
                        root=null;
                    }
                    else{
                        if(parent.left==ptr){
                            parent.left=null;
                        }
                        else{
                            parent.right=null;
                        }
                    }
                    break;
                }
            }
            else if(ptr.data<data){
                parent=ptr;
                ptr=ptr.right;
            }
            else {
                parent=ptr;
                ptr=ptr.left;
            }
        }
    }
    //inorder
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Binary b=new Binary();
        do{
            System.out.println("Enter choice \n1-create/insert\n2-Inorder traversal\n3-Search\n4-Delete");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("enter the data::");
                    int ele=sc.nextInt();
                    b.create(ele);
                    break;
                }
                case 2:{
                    System.out.println("INORDER TRAVERSAL");
                    b.inorder(b.root);
                    break;
                }
                case 3:{
                    System.out.println("Enter the data you want to search ::");
                    int data=sc.nextInt();
                    b.search(data);
                    break;
                }
                case 4:{
                    b.delete();
                    break;
                }
            }
            System.out.println("do you want to continue press 1");
        }while (sc.nextInt()==1);
    }
}
