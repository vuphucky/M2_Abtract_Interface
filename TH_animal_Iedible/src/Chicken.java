public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chicken: cucucucu";
    }

    @Override
    public String howToEat() {
        return "Chicken can be fried";
    }
}
