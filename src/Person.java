public class Person {

    private int age;
    private String Name;

    //DEFAULT CONSTRUCTOR
    public Person(){
        age=1;
        Name="no-name";
        System.out.println("Default constructor called");
    }

    //parametarized CONSTRUCTOR
    public Person(int age,String Name){
        this.age=age;
        this.Name=Name;
        System.out.println("parametarized constructor called");
    }

    public void setData(int age,String Name){
        this.age=age;
        this.Name=Name;
    }

    public void display(){
        System.out.println(this.age);
        System.out.println(this.Name);
    }
}
