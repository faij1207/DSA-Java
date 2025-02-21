public class MultipleInheritance {
    public static void main(String[] args) {
        Omnivore o = new Omnivore();
        o.eatGrass(); // Omnivore eats grass
        o.eatMeat(); // Omnivore eats meat
    }
}

//interface
interface Herbivore {
    void eatGrass();
}

//interface
interface Carnivore {
    void eatMeat();
}

//class implements multiple interfaces
class Omnivore implements Herbivore, Carnivore {
    public void eatGrass() {
        System.out.println("Omnivore eats grass");
    }
    public void eatMeat() {
        System.out.println("Omnivore eats meat");
    }
}
// In Java, a class can implement multiple interfaces. This is known as multiple inheritance.
