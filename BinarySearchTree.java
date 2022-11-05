import org.javatuples.Pair;

public class BinarySearchTree {

    public TreeNode root;

    public BinarySearchTree() {

        this.root = null;

    }

    public BinarySearchTree(TreeNode root) {

        this.root = root;

    }

    public boolean isEmpty() {

        if (this.root == null) {
            return true;
        }
        return false;

    }

    public boolean search(int key) {

        return this.searchRec(key, this.root);

    }

    public boolean searchRec(int key, TreeNode node) {

        if (node == null) {
            return false;
        }
        else {
            if (key == node.key) {
                return true;
            }
            else if (node.key < key) {
                return this.searchRec(key, node.right);
            }
            else {
                return this.searchRec(key, node.left);
            }
        }

    }

    public void insert(int key, String data) {

        this.root = insertRec(root, key, data);

    }

    public TreeNode insertRec(TreeNode root, int key, String data) {

        if (root == null) {
            root = new TreeNode(key, data);
            return root;
        }
        else if (root.key < key) {
            root.right = insertRec(root.right, key, data);
        }    
        else {
            root.left = insertRec(root.left, key, data);
        }
        return root;

    }

    public Pair<Integer, String> findMin() {

        if (this.root == null) {
            return null;
        }
        else {
            TreeNode node = this.root;
            while (node.left != null) {
                node = node.left;
            }
            int min_key = node.key;
            String data = node.data;
            Pair<Integer, String> tuple = new Pair<Integer,String>(min_key, data);
            return tuple;
        }

    }

    public Pair<Integer, String> findMax() {

        if(this.root == null) {
            return null;
        }
        else {
            TreeNode node = this.root;
            while (node.right != null) {
                node = node.right;
            }
            int max_key = node.key;
            String data = node.data;
            Pair<Integer, String> tuple = new Pair<Integer,String>(max_key, data);
            return tuple;
        }

    }

    public int treeHeight() {

        if (this.root == null) {
            return -1;
        }
        return treeHeightRec(this.root) - 1;

    }

    public int treeHeightRec(TreeNode node) {

        if (node == null) {
            return 0;
        }
        else {
            int left_height = treeHeightRec(node.left);
            int right_height = treeHeightRec(node.right);
            return 1 + Math.max(left_height, right_height);
        }

    }

    public void inOrder() {
        
        this.inOrder_rec(this.root);

    }

    public void inOrder_rec(TreeNode node) {

        if (node == null) {
            return;
        }
        inOrder_rec(node.left);
        System.out.print(node.key + " ");
        inOrder_rec(node.right);

    }

    public void preOrder() {

        this.preOrder_rec(this.root);

    }

    public void preOrder_rec(TreeNode node) {

        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        preOrder_rec(node.left);
        preOrder_rec(node.right);

    }

    public void postOrder() {

        this.postOrder_rec(this.root);

    }

    public void postOrder_rec(TreeNode node) {

        if (node == null) {
            return;
        }
        postOrder_rec(node.left);
        postOrder_rec(node.right);
        System.out.print(node.key + " ");

    }

}