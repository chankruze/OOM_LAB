package in.geekofia;

// import classes from custom package
import in.geekofia.utils.Animal;
import in.geekofia.utils.Dog;
import in.geekofia.utils.Octopus;

public class Pr1617 {
    /**
     * Practical Number: 16, 17
     * Task: Write a java program implementing multiple inheritance.
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Unknown");
        Dog lulu = new Dog("Lulu");
        Octopus octavia = new Octopus("Ocho");

        System.out.println(animal);
        System.out.println(lulu);
        System.out.println(octavia);
    }
}
