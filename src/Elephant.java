public class Elephant extends Herbivore implements Animal {

    public void jump() {
        System.out.println("The elephant jumps");
    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    @Override
    public void run() {
        System.out.println("The elephant runs");
    }

    @Override
    public void eatPlantBased() {
        System.out.println("Elephants are herbivores and only eat plant-based food.");
    }

}
