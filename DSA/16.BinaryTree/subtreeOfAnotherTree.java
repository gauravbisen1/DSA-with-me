public class subtreeOfAnotherTree {
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
    //subtree of another tree

    //check non identical
    public static boolean isIdentical(Node node , Node subRoot){
        //non identical if null
        if (node == null && subRoot == null) {
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        //left subtree - non Identical
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        //right subtree - non identical
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    //check subroot in tree
    public static boolean isSubtree(Node root, Node subRoot){
        if (root == null) {
            return false;
        }
        //check root for match
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        //check in left andright subtree
        return isSubtree(root.left, subRoot)  || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
