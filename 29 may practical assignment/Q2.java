//2. Write a program to create an object of an class which contain a method and call that class method in
//main method.
class A{
    void hello(){
        System.out.println("Hello World");
    }
}
public class Q2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.hello();
    }
}
