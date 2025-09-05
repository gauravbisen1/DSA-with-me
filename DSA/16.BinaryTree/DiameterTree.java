public class DiameterTree{
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

    //Approch 1 ,  TC = O(n2)
    public static int diameter1(Node root){
        //base case
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter1(root.left);
        int rightDiameter = diameter1(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    //Approch 2 , TC = O(n)
    static class Info{
        int diameter;
        int height;
        public Info(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameter2(Node root){
        if (root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diameter , height);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //approch 1
        System.out.println(diameter1(root));

        //aaproch 2
        System.out.println(diameter2(root).diameter);
        System.out.println(diameter2(root).height);

    }
}