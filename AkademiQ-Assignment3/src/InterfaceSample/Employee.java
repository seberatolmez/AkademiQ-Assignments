package InterfaceSample;

public class Employee {
    private int id;
    private String name;
    double salary;
    private String department;
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double calculateBonus(){
        return 0;
    }
}
