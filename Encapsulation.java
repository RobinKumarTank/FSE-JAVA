class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encap {

    public static void main(String args []){
        Person p=new Person();
        p.setName("Robin");
        System.out.println(p.getName());
    }
}
