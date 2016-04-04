package lab11;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest {
    public static void main(String[] args) {
        //Dog dog = new Dog("Spike");
        Labrador labrador = new Labrador("Stone", "Black");
        Yorkshire yorkshire = new Yorkshire("Chopper");
        //System.out.println(dog.getName() + " says " + dog.speak());
        System.out.println(labrador.getName() + " says " + labrador.speak());
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
        System.out.println("Average breed weight of Labrador: " + labrador.avgBreedWeight());
        System.out.println("Average breed weight of Yorkshire: " + yorkshire.avgBreedWeight());
    }

}