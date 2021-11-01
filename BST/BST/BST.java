package BST;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BST {

    Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if(this.root == null) {
            this.root = node;
        } else {
            Node current = this.root;
            while(true) {
               if(value < current.value) {
                   if(current.left == null) {
                       current.left = node;
                       return;
                   } else {
                       current = current.left;
                   }
               } else {
                   if(current.right == null) {
                       current.right = node;
                       return;
                   } else {
                       current = current.right;
                   }
               }
            }
        }
    }

    public void traverse() {
        if(this.root == null) {
            System.out.println("Tree is empty");
        } else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()) {
                Node currentNode = q.poll();
                if(currentNode.left != null) q.add(currentNode.left);
                if(currentNode.right != null) q.add(currentNode.right);
                System.out.println(currentNode.value);
            }
        }
    }
}
