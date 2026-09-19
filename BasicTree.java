class BasicTree{

    public static void inorder(Node root){
        if(root == null)
        return;

        inorder(root.left);
        System.out.print(root);
        inorder(root.right);
    }

    public static void Preorder(Node root){
        if(root == null)
        return;

        System.out.print(root);
        Preorder(root.left);
        Preorder(root.right);
    }

        public static void Postorder(Node root){
        if(root == null)
        return;

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root);
    }


}