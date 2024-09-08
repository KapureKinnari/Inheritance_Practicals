public class Employee extends  Person{

    private int emp_id;
    private double salary;

    public Employee(int emp_id,double salary,String name,int age){
        super(age,name);
        this.emp_id=emp_id;
        this.salary=salary;
    }

    public Employee(int empId, int salary) {
    }

    public void display(){
        System.out.println(emp_id);
        System.out.println(salary);
    }
}
