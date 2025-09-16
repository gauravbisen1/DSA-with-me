import java.util.*;

public class heapp {
    static class HeapClass{
        ArrayList <Integer> arr = new ArrayList<>();

        //add
        public void add(int data){
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; // child idx
            int par = (x -1)/2; //parent idx

            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1)/2;
            }
        }

        //peek
        public int peek(){
            return arr.get(0);
        }

        //heapify
        private void heapify(int i){
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            //check for leaf node too
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        //delete
        public int remove(){
            int data = arr.get(0);

            //step1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 - delete last'
            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);

            return data;
        }

        //isEmpty
        public boolean isEmpty(){
            return arr.size()== 0;
        }
    }
    public static void main(String[] args) {
        HeapClass h = new HeapClass();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
