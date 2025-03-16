package Repository;

import Entities.Technology;

import java.util.ArrayList;
import java.util.List;

public class TechnologyRepository {

    List<Technology> technologies = new ArrayList<>();

    public void add(Technology technology) {
        technologies.add(technology);
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void update(int id, String name) {
       for (Technology technology : technologies) {
           if (technology.getId() == id) {
               technology.setName(name);
           }
       }
    }
    public void delete(int id) {
        technologies.removeIf(technology -> technology.getId() == id);
    }
    public Technology getById(int id) {
        for (Technology technology : technologies) {
            if (technology.getId() == id) {
                return technology;
            }
        }
        return null;
    }
}
