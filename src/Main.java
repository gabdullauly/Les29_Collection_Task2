/*
In main class create 5 users, 5 employees.  Create array of humans.
Sort array by human name and print all data
 */

import java.util.ArrayList;

public class Main {
    public static void sortByName(ArrayList<Human> humans){
        for (int i=0; i< humans.size()-1; i++){
            for (int j=0; j< humans.size()-i-1; j++) {
                if (humans.get(j).getName().compareTo(humans.get(j + 1).getName()) > 0) {
                    Human x = humans.get(j);
                    humans.set(j, humans.get(j + 1));
                    humans.set(j + 1, x);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new User("Aisana", 4, "Ais", "Ais123"));
        humans.add(new User("Ainazar", 1, "Aino", "Aino123"));
        humans.add(new User("Samal", 27, "Sam", "Sam123"));
        humans.add(new User("Tanya", 60, "Tan", "Tan123"));
        humans.add(new User("Jandos", 32, "Jan", "Jan123"));
        humans.add(new Employee("Mbappe", 24, "K123", "Centre-Back", 5000));
        humans.add(new Employee("Messi", 36, "Mes123", "Right-Winger", 3500));
        humans.add(new Employee("Ronaldo", 37, "CR7", "Goalkeeper", 4500));
        humans.add(new Employee("Neymar", 29, "Jr", "Left-Winger", 4600));
        humans.add(new Employee("Ramos", 36, "R4", "Left-Back", 3200));

        sortByName(humans);

        for (int i=0; i< humans.size(); i++){
            humans.get(i).printData();
        }
    }
}
