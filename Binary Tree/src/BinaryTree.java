public class BinaryTree {
    Node root;

    public BinaryTree() {
        root=null;
    }

    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
        b.root=new Node(5);
        /*-
        *     5
        * |       |
        * null   null
        * */
        b.root.left=new Node(4);
        b.root.right=new Node(6);
        /*-
        *       5
        *   |      |
        *   4      6
        * |   |  |   |
        * N   N  N   N*/
        b.root.left.left=new Node(7);
        /*
        *               5
        *           |        |
        *            4       6
        *          |    |  |    |
        *          7    N  N    N
        *       |     |
        *       N     N
        * maximum number of nodes on level ‘l’ is 2l
        * The Maximum number of nodes in a binary tree of height ‘h’ is 2^h – 1.
        * In a Binary Tree with N nodes, minimum possible height or the minimum number of levels is? Log2(N+1) ?
        * A Binary Tree with L leaves has at least | Log2L? |+ 1   levels
        * In Binary tree where every node has 0 or 2 children, the number of leaf nodes is always one more than nodes with two children. */
    }
}
