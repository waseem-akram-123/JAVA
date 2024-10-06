import java.util.*;

public class Binary_tree {
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
    static class BinaryTree {
        static int idx = -1;

        public static Node builTree (int nodes[]){
            idx++;

            if (nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node (nodes[idx]);
            newNode.left = builTree(nodes);
            newNode.right = builTree(nodes);

            return newNode;
        }
    }
    // preorder traversal

    public static void preOrder (Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
        // inorder traversal

        public static void inOrder (Node root){
            if (root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
            // postorder traversal

    public static void postOrder (Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    // level order traversal

    public static void levelOrder (Node root){
        if (root == null){
            return;
        }
        Queue <Node> q = new LinkedList <>();

        q.add (root);
        q.add (null);

        while (!q.isEmpty()){
            Node currNode = q.remove();

            if (currNode == null){
                System.out.println();

                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add (null);
                }
            }
            else {
                System.out.print(currNode.data + " ");

                if (currNode.left != null){
                    q.add (currNode.left);
                }
                if (currNode.right != null){
                    q.add (currNode.right);
                }
            }
        }
    }
    // count of nodes
    public static int countOfNodes (Node root){
        if (root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    // sum of nodes
    public static int sumOfNodes (Node root){
        if (root == null){
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    // height of tree
    public static int height (Node root){
        if (root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myheight = Math.max (leftheight,rightheight)+1;
        return myheight;
    }

    // diameter of a tree
    public static int diameter (Node root){
        if (root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+height(root.right)+1;
        return Math.max (diam3, Math.max (diam1, diam2));
    }
    public static void main(String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    

        BinaryTree tree = new BinaryTree();

        Node root = tree.builTree(nodes);
        System.out.println(root.data);

        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();

        levelOrder(root);
        System.out.println();

        System.out.println(countOfNodes(root));

        System.out.println(sumOfNodes(root));

        System.out.println(height(root));

        System.out.println(diameter(root));
    }
}
