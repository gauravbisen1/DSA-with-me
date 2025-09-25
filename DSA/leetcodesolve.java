public class leetcodesolve {
    public static void prefix(String arr[]) {
        int start = 0;
        int end = arr.length;

        for (int i = start; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length(); j++) {
                System.out.println(arr[j].charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        prefix(strs);
    }
}