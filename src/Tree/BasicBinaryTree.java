package Tree;

/**
 * @author rrawani
 */


public class BasicBinaryTree {
    static Node root;

    BasicBinaryTree(int item){
        root = new Node(item);
    }

    BasicBinaryTree(){
        root= null;
    }

    public static void preorderTraverse(Node root){
        if(root == null){
            return;
        }
        preorderTraverse(root.left);
        System.out.println(root.key);
        preorderTraverse(root.right);
    }

    public static void main(String[] args) {
        BasicBinaryTree binaryTree = new BasicBinaryTree();
        //created the root
        binaryTree.root= new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);

        preorderTraverse(root);
        int result = maxDepth(root);
        System.out.println("Height of tree is : "+result);
    }
     static int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
