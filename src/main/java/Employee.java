public class Employee {

    public static double sala;
    public static final String DEPARTMENT = "development";
    public String name;
    private double salary;
    public Employee(String empName){
        name = empName;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void printEmp() {
        System.out.println("name : " + name);
        System.out.println("salary : " + salary);
    }


}
