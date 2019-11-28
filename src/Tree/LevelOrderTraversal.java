package Tree;

import java.util.logging.Level;

/**
 * level order traversal of a binary tree in spiral form
 * @author rrawani
 */
public class LevelOrderTraversal {
    static Node root;

    public static void printLeftToRightGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.println(root.key);
        } else if (level > 1) {
            printLeftToRightGivenLevel(root.left, level - 1);
            printLeftToRightGivenLevel(root.right, level - 1);
        }
    }

    public static void printRightToLeftGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.println(root.key);
        } else if (level > 1) {
            printRightToLeftGivenLevel(root.right, level - 1);
            printRightToLeftGivenLevel(root.left, level - 1);
        }
    }

    public static void printLevelOrder (){
        int h = height(root);
        System.out.println("height of the tree is: "+h);
        printLeftToRightGivenLevel(root, 2);
       /* for(int i=1; i<=h; i++){
            if(i%2 ==0)
            printLeftToRightGivenLevel(root, i);
            else{
                printRightToLeftGivenLevel(root, i);
            }
        }*/

    }

    public static int height(Node root){

        if(root != null){
            int leftHeight =  height(root.left);
            int rightHeight = height(root.right);

            if(leftHeight > rightHeight){
                return leftHeight+1;
            }else{
                return rightHeight+1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        printLevelOrder();

    }

}
