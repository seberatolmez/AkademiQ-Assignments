import InterfaceSample.Developer;
import InterfaceSample.Manager;
import PolimorfizmSample.CheckingAccount;
import PolimorfizmSample.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Developer dv = new Developer(1,"Berat Ölmez",1000,"Web/Mobile Development","Ninja Software Engineer");
        Manager manager = new Manager(1,"Berat Ölmez",1500,"Product Development",15);

        System.out.println("Developer promotion: "+dv.calculateBonus());
        System.out.println("Manager promotion: "+manager.calculateBonus());

        System.out.println("----------------------------------------------");

        SavingsAccount sv = new SavingsAccount("Berat Ölmez",1000);
        CheckingAccount cv = new CheckingAccount("Berat Ölmez", 10000);

        cv.CalculateInterest();
        sv.CalculateInterest();
    }
}