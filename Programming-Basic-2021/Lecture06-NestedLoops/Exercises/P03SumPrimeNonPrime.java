package P06NestedLoops.Exercises;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")){

            int num = Integer.parseInt(input);
            boolean isPrime = true;
            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < num; i++) {

                if ((num % i) == 0){
                    nonPrimeSum += num;
                    isPrime = false;
                    break;


                }

            }
            if (isPrime){

                primeSum += num;
            }



            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n" +
                "Sum of all non prime numbers is: %d", primeSum, nonPrimeSum);
    }
}
