package InterfaceSample;

public class Developer extends Employee{
    private String about;
    public Developer(int id, String name, double salary, String department,String about) {
        super(id, name, salary, department);
    }


    @Override
    public double calculateBonus() {
        return salary*0.1;
    }
}
