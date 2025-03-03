import Entities.Instructor;
import Managers.InstructorManager;


import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Pair - 5
        InstructorManager instructorManager = new InstructorManager();
        List<Instructor> instructors = instructorManager.getInstructors();

        System.out.println("------------------------------------");

        instructorManager.add(new Instructor(3,"Berat Ölmez"));// add method
        for (var item : instructors) {
            System.out.println(item.getId()+" "+item.getName());
        }
        System.out.println("------------------------------------");

        instructorManager.delete(instructors.get(2)); // delete method
        for (var item : instructors) {
            System.out.println(item.getId()+" "+item.getName());
        }
        System.out.println("-------------------------------------");

        instructorManager.getById(instructors.get(1)); // getById method

        System.out.println("-------------------------------------");

        Instructor newInstructor = new Instructor(2,"Gürkan Mutlu"); //update method
        Instructor oldInstructor = instructorManager.getInstructors().get(1);
        instructorManager.update(oldInstructor,newInstructor);
        for (var item : instructors) {
            System.out.println(item.getId()+" "+item.getName());
        }
    }
}