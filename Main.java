public class Main {
    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", 3, Breed.GERMAN_SHEPARD);
        Dog spot = new Dog("Spot", 4, Breed.POODLE);
        Dog wolf = new Dog("Wolf", 5, Breed.HUSKY);

        snoopy.bark();
        spot.bark();
        wolf.bark();

        //snoopy set and get (name, age, breed)
        snoopy.setName("Snoopy");
        System.out.println(snoopy.getName() + " is a " + snoopy.getAge() + " year old " + snoopy.getBreed() + ".");
        spot.setName("Spot");
        System.out.println(spot.getName() + " is a " + snoopy.getAge() + " year old " + snoopy.getBreed() + ".");
        wolf.setAge(10);
        System.out.println(wolf.getName() + " is a " + wolf.getAge() + " year old " + wolf.getBreed() + ".");

    }
}
