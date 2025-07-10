public class linearSearch {
    public static int linearSearch(int numbers[] , int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i ;//key index
            }
        }
        return -1;//key not exists
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,20,10,1,15};
        int key = 1;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
