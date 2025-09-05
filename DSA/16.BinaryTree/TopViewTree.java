import java.util.*;

public class TopViewTree{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        Node node;
        int hd; //horizontal Distance
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        //level order
        Queue <Info> q = new LinkedList<>();
        //to store hd and node ,we create map
        HashMap <Integer , Node> map = new HashMap<>();
        int min = 0;
        int max = 0;

        q.add(new Info(root , 0));//by default root hd is 0
        q.add(null);//for levelwise traversal / for next line

        while (!q.isEmpty()) {
            Info curr = q.remove();
            //to print null in next line
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                //first time hd is occuring
                if (!map.containsKey(curr.hd)) {
                    //add on map as key
                    map.put(curr.hd, curr.node);
                }
                //check if left node not null for curr node on queue
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd - 1);
                }
                //check if right node is not null
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        //to print to view
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}