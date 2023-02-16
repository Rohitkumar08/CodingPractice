import Tree.Node;

import javax.swing.tree.TreeNode;

/**
 * Given a complete binary tree, return the value of the rightmost node of the last level.
 *
 * A complete binary tree is a binary tree in which all the levels are completely filled except possibly the lowest one, which is filled from the left.
 *
 *                1
 *              /    \
 *             2      3
 *           /   \    /
 *          -4   5  -6
 */
public class Games24Test {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right  = new Node(3);
        int height = height(node);
//        System.out.println(height);
        System.out.println(rightMostNode(node, height));
    }

    public static int height(Node root){
        if(root == null)
            return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }

    public static int rightMostNode(Node node, int level){
        if(level == 1){
            return node.key;
        }
        int rightVal = rightMostNode(node.right, level-1);
        if(rightVal!= -1){
            return rightVal;
        }
        else{
            int leftVal = rightMostNode(node.left, level-1);
            return leftVal;
        }
    }
}
