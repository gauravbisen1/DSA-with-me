public class linearSearch2 {
    public static int linearSearch(String menu[] , String key){
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i ;//key index
            }
        }
        return -1;//key not exists
    }
    public static void main(String[] args) {
        String menu[] = {"Dosa","samosa","chai","biscuit"};
        String key = "chai";

        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("NOT Available in menu!");
        } else {
            System.out.println("Key is at index " + index + " yes your order " + menu[index] + " is processing!");
        }
    }
}
