package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Case 1: When the current node has no left subtree. In this scenario, there is nothing to be traversed on the left side, so we simply print the value of the current node and move to the right of the current node.
 * Case 2: When there is a left subtree and the right-most child of this left subtree is pointing to null. In this case we need to set the right-most child to point to the current node, instead of NULL and move to the left of the current node.
 * Case 3: When there is a left subtree and the right-most child of this left-subtree is already pointing to the current node. In this case we know that the left subtree is already visited so we need to print the value of the current node and move to the right of the current node.
 *
 */
public class IterativeInorderTraversal {

    public List<Integer> inorderTraversal(Node root) {
        List<Integer> inorder = new ArrayList<>();

        Node cur = root;
        while(cur != null) {
            if(cur.left == null) {
                inorder.add(cur.key);
                cur = cur.right;
            }
            else {
                Node prev = cur.left;
                //go to rightmost of the left subtree
                while(prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                //make a link to the curr
                if(prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                }
                // unlink the link with rightmost and curr and move to the right subtree
                else {
                    prev.right = null;
                    inorder.add(cur.key);
                    cur = cur.right;
                }
            }
        }
        return inorder;
    }
}
