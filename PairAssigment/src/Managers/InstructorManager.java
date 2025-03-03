package Managers;

import Entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    List<Instructor> instructors;

    public InstructorManager() {
      instructors = new ArrayList<>();
      instructors.add(new Instructor(1,"Muhammet İnan"));
      instructors.add(new Instructor(2,"Engin Demiroğ"));
    }

    public void add(Instructor instructor) {
      instructors.add(instructor);
    }
    public void delete(Instructor instructor) {
        instructors.remove(instructor);
    }
    public void update(Instructor oldInstructor, Instructor newInstructor) {
        instructors.set(instructors.indexOf(oldInstructor), newInstructor);
    }
    public void getById(Instructor instructor) {
       instructor =  instructors.get(instructors.indexOf(instructor));
        System.out.println(instructor.getName());
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }
}
