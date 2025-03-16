package Repository;

import Entities.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

public class LanguageRepository {

    List<ProgrammingLanguage> languages = new ArrayList<>();

    public void add(ProgrammingLanguage language) {
        languages.add(language);
    }
    public List<ProgrammingLanguage> getLanguages() {
        return languages;
    }

    public void update(int id,String name) {
        for (ProgrammingLanguage language : languages) {
            if (language.getId() == id) {
                language.setName(name);
            }
        }
    }

    public void delete(int id) {
        for (ProgrammingLanguage language : languages) {
            if (language.getId() == id) {
                languages.remove(language);
            }
        }
    }

    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage language : languages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }
}
