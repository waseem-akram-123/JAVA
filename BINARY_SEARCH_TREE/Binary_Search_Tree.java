import java.util.*;

public class Binary_Search_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // build a binary search tree
    public static Node insert (Node root, int val){
        if (root == null){
            root = new Node (val);
            return root;
        }
        if (root.data > val){
            root.left = insert (root.left, val);
        }
        else {
            root.right =insert (root.right, val);
        }
        return root;
    }
    // inorder traversal --> gives a sorted sequence in a bst
    public static void inOrder (Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // search in a BST
    public static boolean search (Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data > key){
            return search(root.left, key);
        }
        else if (root.data == key){
            return true;
        }
        else {
            return search(root.right, key);
        }
    }
    
    // delete a node in BST
    public static Node delete (Node root, int val){
        if (root.data > val){
            root.left = delete (root.left, val);
        }
        else if (root.data < val){
            root.right = delete (root.right, val);
        }
        else { // root.data == val

            // case 1
            if (root.left == null && root.right == null){
                return null;
            }

            // case 2
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            
            // case 3
            Node IS = inorderSuccessor (root.right);
                IS.data = root.data;

                root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor (Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    // print the valuse in a given range in a BST

    public static void printInRange (Node root, int x, int y){
        if (root == null){
            return;
        }
        if (root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }
        else if (root.data >= y){
            printInRange(root.left, x, y);
        }
        else {
            printInRange(root.right, x, y);
        }
    }
    public static void printPath (ArrayList <Integer> path){
        for (int i=0; i<path.size(); i++){
            System.out.print(path.get (i) + "->");
        }
        System.out.println();
    }

    // print root to leaf path in a BST
    public static void printRoot2Leaf (Node root, ArrayList <Integer> path){
        if (root == null){
            return;
        }
        path.add (root.data);

        // leaf
        if (root.left == null && root.right == null){
            printPath (path);
        }
        else { // non leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove (path.size ()-1);
    }

    public static void main(String[] args) {

        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i=0; i<values.length; i++){
            root = insert (root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if (search(root, 1)){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }

        // delete (root, 4);
        // inOrder(root);

        printInRange(root, 6, 10);
        System.out.println();

        printRoot2Leaf(root, new ArrayList <> ());
    }
}
