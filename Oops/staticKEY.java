public class staticKEY {
    public static void main(String[] args) {
        student s1 = new student();
        s1.school = "kvm";
        student s2 = new student();
        System.out.println(s2.school );
    }
}
class student{
    String name;
    int roll;
    static String school;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    static int returnPercentage(int p , int m , int c){
        return (p+m+c)/3;
    }
}
