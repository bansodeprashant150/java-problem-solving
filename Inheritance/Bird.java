package Inheritance;
public class Bird extends Animal{
    void fly(){
        System.out.println("Bird is flying");
    }
    void sing(){
        System.out.println("Bird is singing");
    }
}
 class Main{
    public static void main(String[] args) {
        Bird b=new Bird();
        b.walk();
        b.fly();
        b.sing();
    }
}
