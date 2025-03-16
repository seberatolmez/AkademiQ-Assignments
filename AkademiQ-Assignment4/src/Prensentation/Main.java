package Prensentation;

import Entities.ProgrammingLanguage;
import Entities.Technology;
import Services.ProgrammingLanguageManager;
import Services.TechnologyManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ProgrammingLanguageManager pManager = new ProgrammingLanguageManager();
        TechnologyManager tManager = new TechnologyManager();

        while(true) {

            System.out.println("Enter 1 to add programming language\n" +
                    "      2 to list of languages\n" +
                    "      3 to add Technology\n" +
                    "      4 to list of technologies\n" +
                    "      5 to Exit\n");


            System.out.print("choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Language name: ");
                    String languageName = scan.next();
                    pManager.add(new ProgrammingLanguage(pManager.getLanguages().size()+1, languageName));
                    System.out.println("Programming language added");
                    break;

                case 2:
                    for (ProgrammingLanguage language : pManager.getLanguages()) {
                        System.out.println(language.getId()+" "+language.getName());
                    }
                    break;
                case 3:
                    System.out.print("Technology name: ");
                    String technologyName = scan.next();
                    System.out.print("language id: ");
                    int languageId = scan.nextInt();
                    ProgrammingLanguage lang = pManager.getLanguage(languageId);
                    if (lang != null) {
                        Technology tech = new Technology(tManager.getAllTechnologies().size()+1,technologyName,lang);
                        tManager.addTechnology(tech);
                        System.out.println("Technology added");
                    }else {
                        System.out.println("No technology found!");
                    }
                    break;
                case 4:
                    for (Technology tech : tManager.getAllTechnologies()){
                        System.out.println(tech.getId()+" "+tech.getName());
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
