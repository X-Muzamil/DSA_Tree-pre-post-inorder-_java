class Main {

    public static void main(String[] args) {

        Node root = new Node('A');

        root.left = new Node('B');
        root.left.left = new Node('D');
        root.left.left.left = new Node('H');

        root.left.right = new Node('E');
        root.left.right.left = new Node('J');

        root.left.left.right = new Node('I');

        root.right = new Node('C');
        root.right.left = new Node('F');
        root.right.right = new Node('G');
        root.right.right.left = new Node('K');

        System.out.print("Inorder: ");
        BasicTree.inorder(root);

        System.out.println();

        System.out.print("Preorder: ");
        BasicTree.Preorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        BasicTree.Postorder(root);
    }
}