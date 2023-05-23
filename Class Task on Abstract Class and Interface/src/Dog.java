public class Dog extends Animal implements Sound{

    @Override
    void speed() {
        System.out.println("Dog is faster than the Cat");
    }

    @Override
    public void animalSound() {
        System.out.println("The dog is Barking");
    }
}
