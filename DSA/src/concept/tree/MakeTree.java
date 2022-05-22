package concept.tree;

public class MakeTree {

    public static void main(String[] args) {

    }

    public static TreeNode myTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        return root;
    }
}
