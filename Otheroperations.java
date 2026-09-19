class Otheroperations {

    public static int countNodes(Node root) {

        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left)
                + countNodes(root.right);
    }


    public static int countleafnode(Node root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        return countleafnode(root.left)
            + countleafnode(root.right);
    }


    public static boolean search(Node root, char val) {

        if (root == null)
            return false;

        if (root.data == val)
            return true;

        return search(root.left, val)
            || search(root.right, val);
    }


    public static int sum(Node root) {

        if (root == null)
            return 0;

        return root.data
            + sum(root.left)
            + sum(root.right);
    }
}