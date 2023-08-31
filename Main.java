public class Main {
    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", 3, Breed.GERMAN_SHEPARD);
        Dog spot = new Dog("Spot", 4, Breed.POODLE);
        Dog wolf = new Dog("Wolf", 5, Breed.HUSKY);

        snoopy.bark();
        spot.bark();
        wolf.bark();
    }
}