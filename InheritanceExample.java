// Base class
class LivingBeing {
    void breathe() {
        System.out.println("Living beings breathe.");
    }
}

// Animal class inheriting LivingBeing
class Animal extends LivingBeing {
    void eatFood() {
        System.out.println("Animals eat food.");
    }
}

// Bird class inheriting Animal
class Bird extends Animal {
    void fly() {
        System.out.println("Birds can fly.");
    }
}

// Parrot class inheriting Bird
class Parrot extends Bird {
    void speak() {
        System.out.println("Parrot can speak.");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {

        // Creating object of Parrot class
        Parrot p = new Parrot();

        // Calling methods
        p.breathe();
        p.eatFood();
        p.fly();
        p.speak();
    }
}