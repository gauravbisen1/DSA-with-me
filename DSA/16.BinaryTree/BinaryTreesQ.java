public class BinaryTreesQ {
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
    //height of a tree
    public static int height(Node root){
        //base case
        if (root == null) {
            return 0;
        }
        //left height
        int lh = height(root.left);
        //right height
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of a tree = " + height(root));
    }
}
