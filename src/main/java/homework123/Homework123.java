package homework123;

public class Homework123 {
    public static void main(String[] args) {

        // Task 1: Create an array and fill it with 2 numbers
        int[] anArray;
        anArray = new int[2];
        anArray[0] = 1;
        anArray[1] = 2;

        // Task 2: Fill an array of size 1000 with values 1 to 1000
        int[] array2 = new int[1000];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.println("Setting value for index " + i + " where value is " + array2[i]);
        }

        // Task 3: Create and fill array with odd numbers from -20 to 20
        int count = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        int[] oddNumbers = new int[count];
        int index = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
                index++;
            }
        }

        System.out.println("Odd numbers from -20 to 20:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Task 4: Create an array and print elements that can be divided by 5
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("Numbers divisible by 5 from 1 to 50:");
        for (int num : numbers) {
            if (num % 5 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Task 5: Create an array and print values between 24.12 and 467.23
        double[] decimalArray = new double[100];
        for (int i = 0; i < decimalArray.length; i++) {
            decimalArray[i] = i * 5.25;
        }

        System.out.println("Numbers between 24.12 and 467.23:");
        for (double value : decimalArray) {
            if (value > 24.12 && value < 467.23) {
                System.out.print(value + " ");
            }
        }
        System.out.println();

        // Task 6: Create and array and print values that can be divided by 2
        System.out.println("Task 6: Numbers divisible by 2 from 1 to 100:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Task 7: Print first 10 multiples of integer n
        int n = 2;
        System.out.println("Task 7: First 10 multiples of " + n);
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}


