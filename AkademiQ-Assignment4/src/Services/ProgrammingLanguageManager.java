package Services;

import Entities.ProgrammingLanguage;
import Entities.Technology;
import Repository.LanguageRepository;
import Repository.TechnologyRepository;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageManager {
    List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();
    LanguageRepository languageRepository = new LanguageRepository();



    public void add(ProgrammingLanguage programmingLanguage) {
        languageRepository.add(programmingLanguage);
    }
    public void  delete(int id) {
        languageRepository.delete(id);
    }
    public void update(String name, int id) {
        languageRepository.update(id, name);
    }
    public ProgrammingLanguage getLanguage(int id) {
        return languageRepository.getById(id);
    }

    public List<ProgrammingLanguage> getLanguages() {
        return languageRepository.getLanguages();

    }

}
