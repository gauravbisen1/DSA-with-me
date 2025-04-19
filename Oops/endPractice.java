public class endPractice{
    public static void main(String[] args) {
        vehicle v1 = new car();
        v1.print();
        vehicle v2 = new vehicle();
        v2.print();
    }
}
class vehicle{
    void print(){
        System.out.println("base class (vehcile)");
    }
}
class car extends vehicle{
    void print(){
        System.out.println("derived class (car)");
    }
}