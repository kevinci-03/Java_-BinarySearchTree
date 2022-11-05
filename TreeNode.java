public class TreeNode {

    public int key;
    public String data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key, String data) {

        this.key = key;
        this.data = data;
        this.left = null;
        this.right = null;

    }

    public TreeNode(int key, String data, TreeNode left, TreeNode right) {

        this.key = key;
        this.data = data;
        this.left = left;
        this.right = right;

    }

}