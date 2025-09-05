import java.util.*;
public class BTpart3 {
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
// ------------------------------------------------------------------------------------------------
    //K th level of a tree
    public static void kLevel (Node root, int level, int k){
        if (root == null) {
            return;
        }
        //level equal then print  and return
        if (level == k) {
            System.out.println(root.data + " ");
            return;
        }
        //if level is not equal to k call subtrees
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);

    }
// ------------------------------------------------------------------------------------------------

    //Lowest common ancestor

    //approch 1
    //get path
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    //lowest common ancestor
    public static Node LCA (Node root, int n1, int n2){
        ArrayList <Node> path1 = new ArrayList<>();
        ArrayList <Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //LCA
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        //last equal node -> i-1th
        Node Lca = path1.get(i-1);
        return Lca;
    }

    //approch 2
    public static Node LCA2(Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        //search on left & right subtree
        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);

        //valid value on leftLCA but rightLCA became null
        if (rightLCA == null) {
            return leftLCA;
        }
        //valid value on rightLCA but leftLCA became null
        if (leftLCA == null) {
            return rightLCA;
        }

        //if both not null
        return root;
    }


// ------------------------------------------------------------------------------------------------

    //min distance between nodes
    public static int LCAdist(Node root, int n){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = LCAdist(root.left, n);
        int rightDist = LCAdist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        else if(leftDist == -1){
            return  rightDist+1;
        }else{
            return  leftDist+1;
        }
    }
    public static int minDist(Node root, int n1 , int n2){
        Node Lca = LCA2(root, n1, n2);
        int dist1 = LCAdist(Lca, n2);
        int dist2 = LCAdist(Lca, n2);

        return dist1 + dist2;
    }

// ------------------------------------------------------------------------------------------------

    //kth ancestor of node
    public static int kAncestor(Node root ,int n , int k){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max+1;
    }


// ------------------------------------------------------------------------------------------------
    //transfor to sum tree
    public static int transform(Node root){
        if (root == null) {
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int newLeft = root.left == null?0: root.left.data;
        int newRight = root.right == null?0: root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;

        return data;

    }

    public static void preOrder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


// ------------------------------------------------------------------------------------------------



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
         
        // int k = 3;
        // kLevel(root, 1, k);

        // int n1 = 4 , n2 = 5;
        // System.out.println(LCA(root, n1, n2).data);

        // int n1 = 4 , n2 = 7;
        // System.out.println(LCA2(root, n1, n2).data);

        // int n1 = 4 , n2 = 6;
        // System.out.println(minDist(root, n1, n2));

        // int n = 5 , k =2;
        // kAncestor(root, n, k);

        transform(root);
        preOrder(root);


    }
}
