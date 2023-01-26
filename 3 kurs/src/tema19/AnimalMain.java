package tema19;

public class AnimalMain {
    public static void main(String[] args) {
        Bird myBird = new Bird(); // Initialize object class myBird
        Hours myHours = new Hours(); // Initialize object class myHours

        //myBird.sing();
        Animal[] myAnimals = new Animal[2]; // Initialize Animals array by Animal abstract class
        myAnimals[0] = myBird; // Initialize Animals array' first element = myBird
        myAnimals[1] = myHours; // Initialize Animals array' first element = myHours

        myAnimals[0].sing(); // Sing void for myAnimals Bird Element (first Element)
        myAnimals[1].sing(); // Sing void for myAnimals Hours Element (first Element)

    }
}