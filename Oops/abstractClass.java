public class abstractClass{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println();
        Mustang m = new Mustang();
    }
}
abstract class Animal{
    String color;
    void eat(){
        System.out.println("animals eats.");
    }
    Animal(){
        System.out.println("Animal constructor is called.");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called.");
    }
    void walk(){
        System.out.println("walks on 4 legs.");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called.");
    }
}
class chicken extends Animal{
    chicken(){
        System.out.println("Chicken constructor is called.");
    }
    void walk(){
        System.out.println("walks on 2 legs.");
    }
}