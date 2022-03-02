/*
In main class create objects of Dog and Cat. Add them to Array of Animal and launch all methods
 */

package Task2;

import java.util.ArrayList;

public class Main1 {
    public static void main (String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Puzik", 2));
        animals.add(new Cat("Chijik", 3));
        animals.add(new Dog("Alabai", "Koshkar", 4));
        animals.add(new Dog("Haski", "Leo", 6));
        animals.add(new Dog("Afcharka", "Sharik", 7));

        for (int i=0; i< animals.size(); i++){
            animals.get(i).speak();
            System.out.println(animals.get(i).getData()+" ");
            System.out.println();
        }
    }
}
