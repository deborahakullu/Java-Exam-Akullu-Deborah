

// Question 1 (i)

//Write a java program to display the sum of even numbers less than 8
public class Question1 {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {2, 4, 6};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the even numbers less than 8 is: " + sum);


         }


    }

