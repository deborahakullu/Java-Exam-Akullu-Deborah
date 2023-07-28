// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //setting the values of person
        Person person1 = new Person("Deborah",24,500000);
        Person person2 = new Person("Dorcus", 21,300000);
        Person person3 = new Person("Darlene", 23,400000);




        System.out.println("My Name is: " + person1.getName());
        System.out.println("My Age is: " + person1.getAge());
        System.out.println("My salary is: " + person1.getSalary());
        System.out.println();

        System.out.println("My Name is: " + person2.getName());
        System.out.println("My Age is: " + person2.getAge());
        System.out.println("My salary is: " + person2.getSalary());
        System.out.println();

        System.out.println("My Name is: " + person3.getName());
        System.out.println("My Age is: " + person3.getAge());
        System.out.println("My salary is: " + person3.getSalary());


        //Student
        //methods to add and remove courses


        Student student1 = new Student("Jamila", 12);
        Student student2 = new Student("Jude", 15);
        Student student3 = new Student("Jacinta", 13);
        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();
        student3.printStudentDetails();
        System.out.println("Add courses for " + student1.getName());
        student1.addCourse("Python");
        student1.addCourse("Java");
        student1.addCourse("JavaScript");

        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourse("Data Science");
        student2.addCourse("Data Structures");
        student2.addCourse("Hardware studies");
        System.out.println(student2.getName() + "'s courses are: " + student2.getCourses());
        System.out.println("\nRemoving 'Science' course for " + student1.getName());
        student1.removeCourse("Java");
        System.out.println(student1.getName() + "'s courses are: " + student1.getCourses());

        //Restaurant
        //methods to add and remove items
        //methods to calculate average ratings


            Restaurant restaurant = new Restaurant();
           restaurant.addItem("Chapati", 9.11);
            restaurant.addItem("Chicken", 8.99);
            restaurant.addItem("Rice", 7.00);

            System.out.println("Menu:Item & Price");restaurant.displayMenu();

            restaurant.addRating("Chapati", 3);
            restaurant.addRating("Chapati", 2);
            restaurant.addRating("chicken", 4);
            restaurant.addRating("Chicken", 5);
            restaurant.addRating("Rice", 3);

            double averageRating = restaurant.getAverageRating("Chapati");
            System.out.println("\nAverage rating for Burger: " + averageRating);
            averageRating = restaurant.getAverageRating("Chicken");
            System.out.println("Average rating for Pizza: " + averageRating);
            averageRating = restaurant.getAverageRating("Rice");
            System.out.println("Average rating for Rice is: " + averageRating);
            System.out.println("Average rating: " + restaurant.calculateAverageRating());
            System.out.println("\nRemove 'Chicken' from the above menu.");
            restaurant.removeItem("Chicken");
            System.out.println("\nUpdated menu:");
            restaurant.displayMenu();
        }
    }







