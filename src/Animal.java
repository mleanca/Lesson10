public interface Animal {

    default void eat() {
        System.out.println("The animal is eating");
    } //default access modifier accessible within same package

    static String sleep (String sleepParameter) {
        return sleepParameter;
    } //belongs to the class, rather than object, can be called without needing creating new object

    public void run();

    public void jump();

    Elephant elephant = new Elephant();
    public static void main(String[] args) {

        elephant.run();
        elephant.jump();
        elephant.eat();
        elephant.eatPlantBased();
        elephant.refuseAnimalBased();
        System.out.println(sleep("The elephant sleeps")); //without creating object
    }
}

//The elephant runs
//The elephant jumps
//The animal is eating
//Elephants are herbivores and only eat plant-based food.
//Herbivores do not eat animal-based food.
//The elephant sleeps
