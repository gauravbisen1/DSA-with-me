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
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
         
        int k = 3;
        kLevel(root, 1, k);
    }
}
