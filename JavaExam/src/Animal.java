import java.util.ArrayList;


// Question 1 (iv)


//Write a Java program that stores an array list of animals
// and prints all the animals in the collection
public class Animal {

//    method
    public static void main(String[] args) {
//    creating an instance of a class
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("Rhino");
        for (String a : animal
        ) {
            System.out.println(a);
        }
    }
}


