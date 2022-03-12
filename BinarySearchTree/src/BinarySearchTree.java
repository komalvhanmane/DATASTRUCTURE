import java.util.Scanner;

public class BinarySearchTree {
    Node root=null;

    Scanner sc=new Scanner(System.in);

    //create
    public void create_insert(){
        do{
            System.out.println("Enter the word :: ");
            String word=sc.next();
            System.out.println("Enter the meaning :: ");
            String meaning=sc.next();
            Node temp=new Node(word,meaning);
            if(root==null){
                root=temp;
            }
            else{
                Node ptr=root;
                while (ptr!=null){
                    if(ptr.word.compareTo(word)>0){
                        //left
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

    //traversal
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.word+" "+root.meaning);
            inorder(root.right);
        }
    }

    //search
    public void search(){
        System.out.println("Enter the word you want to search :: ");
        String word=sc.next();
        Node ptr=root;
        while (ptr!=null){
            if(ptr.word.compareTo(word)==0){
                System.out.println("Word searched .....");
                System.out.println("Word    :: "+ptr.word);
                System.out.println("Meaning :: "+ptr.meaning);
                break;
            }
            else if(ptr.word.compareTo(word)>0){
                ptr=ptr.left;
            }
            else{
                ptr=ptr.right;
            }
        }
    }

    //delete
    public void delete(){
        System.out.println("Enter the word which you want to delete : ");
        String word=sc.next();
        Node ptr=root;
        Node parent=root;
        while (ptr!=null){
            if(ptr.word.compareTo(word)==0){
                if(ptr.left==null && ptr.right==null){
                    if(parent.left==ptr){
                        parent.left=null;
                    }
                    else if(parent.right==ptr){
                        parent.right=null;
                    }
                    else{
                        ptr=null;
                    }
                    break;
                }
                if(ptr.left==null && ptr.right!=null){
                    if(parent.right==ptr){
                        parent.right=ptr.right;
                    }
                    else{
                        parent.left=ptr.right;
                    }
                    break;
                }
                if(ptr.left!=null && ptr.right==null){
                    if(parent.right==ptr){
                        parent.right=ptr.left;
                    }
                    else{
                        parent.left=ptr.left;
                    }
                    break;
                }
                if(ptr.left!=null  && ptr.right!=null){
                    Node temp=ptr.left;
                    while (temp.right!=null){
                        parent=temp;
                        temp=temp.right;
                    }
                    ptr.word= temp.word;
                    ptr.meaning= temp.meaning;
                    if(temp.left!=null){
                        parent.right=temp.left;
                    }
                    else{
                        parent.right=null;
                    }
                    break;
                }
            }
            else if(ptr.word.compareTo(word)>0){
                parent=ptr;
                ptr=ptr.left;
            }
            else{
                parent=ptr;
                ptr=ptr.right;
            }
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.create_insert();
        bst.inorder(bst.root);
        bst.search();
        bst.delete();
        bst.inorder(bst.root);
    }
}
