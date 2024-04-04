public class BST_Demo{
    public static void main(String[]args){

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(20));
        bst.insert(new Node(35));
        bst.insert(new Node(13));
        bst.insert(new Node(6));
        bst.insert(new Node(24));
        bst.insert(new Node(18));
        bst.insert(new Node(48));
        bst.insert(new Node(1));
        bst.insert(new Node(27));

        System.out.println("------------------------------------------");
        System.out.println("Initial Binary Search Tree: ");
        BSTPrint.print2D(bst.getRoot());

        bst.remove(18);
        bst.remove(48);

        System.out.println("-------------------------------------------");
        System.out.println("Binary Search Tree after removing nodes 18 and 48: ");
        BSTPrint.print2D(bst.getRoot());

        bst.insert(new Node(16));
        bst.insert(new Node(45));

        BSTPrint.print2D(bst.getRoot());

        bst.remove(6);
        bst.remove(24);

        BSTPrint.print2D(bst.getRoot());

        bst.remove(20);
        bst.remove(38);

        BSTPrint.print2D(bst.getRoot());


    }
}