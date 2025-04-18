public class interfaces {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
        player p = new player();
        p.tricking();
        p.moves();
    }
}
interface chess{
    void moves();
}
interface trick{
    void tricking();
}
//multiple inheritance
class player implements chess,trick{
    public void moves(){
        System.out.println("playing chess");
    }
    public void tricking(){
        System.out.println("trick is used");
    }
}
class queen implements chess{
    public void moves(){
        System.out.println("u,d,l,r,diagonal in all 4 direct");
    }
}
class king implements chess{
    public void moves(){
        System.out.println("u,d,l,r,diagonal in all 4 direct with one move");
    }
}
