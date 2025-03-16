package Services;

import Entities.Technology;
import Repository.TechnologyRepository;

import java.util.List;

public class TechnologyManager {

    private TechnologyRepository technologyRepository = new TechnologyRepository();

    public void addTechnology(Technology technology) {
        technologyRepository.add(technology);
    }
    public void  deleteTechnology(int id) {
        technologyRepository.delete(id);
    }
    public void updateTechnology(String name, int id) {
        technologyRepository.update(id, name);
    }
    public Technology getTechnology(int technologyId) {
        return technologyRepository.getById(technologyId);
    }

    public List<Technology> getAllTechnologies() {
        return technologyRepository.getTechnologies();

    }

}
