public class Dog {
    private String name;
    private int age;
    private Breed breed;

    // Constructors
    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Get Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    // Set Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    // Other behaviors
    public void bark() {
        System.out.println(name + " says: ruf ruf!");
    }}
