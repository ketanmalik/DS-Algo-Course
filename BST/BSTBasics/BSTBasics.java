package BSTBasics;

import BST.BST;

public class BSTBasics {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);

        bst.traverse();
    }
}
