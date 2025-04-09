public class inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
    
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats..");
    }
    void breath(){
        System.out.println("breathes..");
    }
}
//derived class
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swimss..");
    }
}
//derived class
class mammals extends Animal{
    int legs;
}
//derived from mammals
class Dog extends mammals{
    String breed;
}
