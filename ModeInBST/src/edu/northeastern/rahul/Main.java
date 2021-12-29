package edu.northeastern.rahul;

public class Main {

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = createBST();
        System.out.println(tree.findMaxOccurringValueInATree());

    }

    private static  Node createBST(){
        Node root = new Node(8);

        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(9);
        root.left.right = new Node(3);
        root.right.right = new Node(9);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(1);
        root.right.right.left = new Node(4);

        return  root;
    }
}
