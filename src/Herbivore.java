public abstract class Herbivore {

    public abstract void eatPlantBased();
    public void refuseAnimalBased() {
        System.out.println("Herbivores do not eat animal-based food.");
    }

    static Elephant elephant = new Elephant();

}
