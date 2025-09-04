import java.util.*;

public class BinaryTreesB{
    //build tree preOrder
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //binary tree class
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;//first element create -1 -> 0
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        //TREE TRAVERSALS O(n)

        //a) Preorder
        public static void preOrder(Node root){
            //base case
            if (root == null) {
                return;
            }
            //root
            System.out.print(root.data + " ");
            //left subtree
            preOrder(root.left);
            //right subtree
            preOrder(root.right);
        }
        //b) Inorder
        public static void InOrder(Node root){
            //base case
            if (root == null) {
                return;
            }
            //left subtree
            InOrder(root.left);
            //root
            System.out.print(root.data + " ");
            //right subtree
            InOrder(root.right);
        }
        //c) Postorder
        public static void postOrder(Node root){
            //base case
            if (root == null) {
                return;
            }
            //left subtree
            postOrder(root.left);
            //right subtree
            postOrder(root.right);
            //root
            System.out.print(root.data + " ");
        }

        //d) Level order
        public static void levelOrder(Node root){
            if (root == null) {
                return;
            }

            Queue <Node> q = new LinkedList<>();
            q.add(root); // add root and null on queue at start
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) { //for null/nextline print
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    //check L and R for null if yes add on queue
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }


    }
    public static void main(String[] args) {
        int nodes[] = {1 ,2 ,4 ,-1 ,-1 , 5 ,-1 ,-1 ,3 ,-1 ,6 ,-1 ,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);

        // tree.preOrder(root);
        
        // tree.InOrder(root);
        
        // tree.postOrder(root);

        tree.levelOrder(root);
    }
}