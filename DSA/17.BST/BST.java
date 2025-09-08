import java.util.*;

public class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
        }
    }
//-----------------------------------------------------------------------------------------------------------------------------------------

    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
        } else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------

    //inordertraversal
    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
//-----------------------------------------------------------------------------------------------------------------------------------------

    //search in BST TC = O(n)
    public static boolean search(Node root, int key){
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
//-----------------------------------------------------------------------------------------------------------------------------------------

    //Delete a node
    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val){
        //search the node which we want to delete
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        
        else{
            //voilla - root found in node

            //case 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2 single child
            if (root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            //case 2 both child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------

    //print in range
    public static void printInRange(Node root , int k1 , int k2){
        //base case
        if (root == null ) {
            return;
        }
        //case1
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        //case2
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            //case3
            printInRange(root.right, k1, k2);
        }
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    //root to leaf path
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    //validate BST
    public static boolean isValidBST(Node root, Node min, Node max){
        if (root==null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if(max != null && root.data >= max.data) {
            return  false;
        }
        return isValidBST(root.left, min, max) && isValidBST(root.right, min, max);
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    //mirror a BST
    public static Node createMirror(Node root){
        if (root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    //preorder
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // int values[] = {5,1,3,4,2,7};
        int values[] = {8,5,3,1,4,6,10,11,14};

        Node root = null;
         //traverse and insert in bst
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // inOrder(root);
        // System.out.println();

        //search in BST
        // if (search(root, 1)) {
        //     System.out.println("FOUND");
        // } else {
        //     System.out.println("NOT FOUND");
        // }

        //delete a node
        // root = delete(root, 14);
        // System.out.println();
        // inOrder(root);

        // printInRange(root, 5, 12);

        // printRootToLeaf(root, new ArrayList<>());

        // if (isValidBST(root, null, null)) {
        //     System.out.println("VALID BST");
        // } else {
        //     System.out.println("NOT VALID BST");
        // }

        Node rooot = new Node(8);
        rooot.left = new Node(5);
        rooot.right = new Node(10);
        rooot.left.left = new Node(3);
        rooot.left.right = new Node(6);
        rooot.right.right = new Node(11);

        rooot = createMirror(rooot);
        preorder(rooot);

    }
   
}