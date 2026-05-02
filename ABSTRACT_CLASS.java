import java.io.*;

abstract class Creature {

    abstract void No_Of_legs();
}
class Elephant extends Creature {

    
    void No_Of_legs()
    {

    
        System.out.println("It has four legs");
    }
}

class Human extends Creature {

    
    public void No_Of_legs()
    {

    
        System.out.println("It has two legs");
    }
}

public class ABSTRACT_CLASS {


    public static void main(String[] args)
    {

    
        Human ob = new Human();

        ob.No_Of_legs();

    
        Elephant ob1 = new Elephant();

    
        ob1.No_Of_legs();
    
    }
}