import java.util.*;

public class HashMapCode{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int N;
        private int n; //n
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        //put
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
        private int searchLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")

        private void reHash(){
            LinkedList <Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            //nodes -> add on buckets
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            //if key exist
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                //not exists,create new
                buckets[bi].add(new Node(key, value));
                n++;
            }
        }
        //contains key
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }
        //get
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }
        //remove
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }
        //key set
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
        //isEmpty
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("A", 100);
        hm.put("B", 140);
        hm.put("C", 190);
        hm.put("D", 10);
        hm.put("E", 120);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }
}