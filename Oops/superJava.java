public class superJava{
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal c called");
    }
}
class horse extends Animal{
    horse(){
        //super.color = "brown";
        super();
        System.out.println("horse c called");
    }
}