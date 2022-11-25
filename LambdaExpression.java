@FunctionalInterface
interface A{
    void show();
    String toString();
}
public class DemoFIAndLambdaExpression {

    public static void main(String args []){
        A a=() -> System.out.println("Hello lambda Expression"); //lambda expression
        a.show();
    }
}
