package concept.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = MakeTree.myTree();
        levelOrder(root);
    }

    public static void levelOrder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        StringJoiner joiner = new StringJoiner(",", "[", "]");
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.remove();
            if (currNode != null) {
                joiner.add(String.valueOf(currNode.val));

                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);
            } else {
                if (!queue.isEmpty()) {
                    queue.add(null);
//                    System.out.println();
                    System.out.println(joiner);
                    joiner = new StringJoiner(",", "[", "]");
                } else {
                    break;
                }
            }
        }
        System.out.println(joiner);
    }
}
