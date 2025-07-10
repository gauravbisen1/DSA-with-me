public class ByReference {
    public static void update(int marks[] , int nonChangable){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        nonChangable = 10;
    };
    public static void main(String[] args) {
        int marks[] = {99,98,97};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);
        
        //print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        
    }
}
