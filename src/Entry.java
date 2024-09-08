public class Entry {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setData(20,"Kavya");
        person1.display();
        Employee emp = new Employee(1,20000);
        emp.display();


        Person person2 = new Person();
        person1.setData(21,"Priya");
        person1.display();

        Person person3 = new Person();
        person1.setData(18,"Honey");
        person1.display();
    }
}