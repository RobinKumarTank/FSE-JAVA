class Vehicle{
    String Brand = "TATA";
    public void display(){
        System.out.println("Welcome in TATA");
    }
}
public class Car extends Vehicle {
     String Model="NEXON";

     public static void main(String args []){
         Car c=new Car();
         c.display();
     }

}
