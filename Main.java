import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);

//        Q1:
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//      Q2:
//        System.out.print("Input a string: ");
//        String inputString = in.nextLine();
//
//        String reversedString = reverseString(inputString);
//
//        System.out.println("Reverse string: " + reversedString);
//
//    }
//    public static String reverseString(String str) {
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        return reversed;
//    }

//      Q3:
//        System.out.print("Enter a number to calculate its factorial: ");
//        int number = in.nextInt();
//        long factorial = calculateFactorial(number);
//
//        System.out.println("Factorial of " + number + " is: " + factorial);
//
//
//    }
//    public static long calculateFactorial(int n) {
//        if (n < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//        }
//
//
//    }
//
//    l
//    long factorial = 1;
//        for (int i = 1; i <= n; i++) factorial *= i;
//        }
//
//            factorial *= i;factorial *= i
//
//
//           return factorial;
//    }
//
//    }
//}

//      Q4:
//        System.out.print("Enter the base number: ");
//        int base = in.nextInt();
//        System.out.print("Enter the exponent: ");
//        int ex = in.nextInt();
//
//        long result = calculatePower(base, ex);
//
//        System.out.println(base + " raised to the power of " + ex + " is: " + result);
//
//
//    }
//
//    public static long calculatePower(int base, int exponent) {
//        long result = 1;
//
//        if (exponent < 0) {
//            System.out.println("Exponent must be non-negative.");
//            return -1;
//        }
//
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//
//        return result;
//    }
//}

//    Q5:
//        System.out.print("Enter the number of integers: ");
//        int n = in.nextInt();
//
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        System.out.println("Enter " + n + " integers:");
//
//        for (int i = 0; i < n; i++) {
//            int num = in.nextInt();
//
//            if (num % 2 == 0) {
//                sumEven += num;
//            } else {
//                sumOdd += num;
//            }
//        }
//
//        System.out.println("Sum of even integers: " + sumEven);
//        System.out.println("Sum of odd integers: " + sumOdd);
//    }
//
//       Q6:
//        System.out.print("Enter a positive integer: ");
//        int number = in.nextInt();
//
//        if (isPrime(number)) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
//    }
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//   Q7:
//        for (int week = 1; week <= 4; week++) {
//            System.out.println("Week " + week);
//            // Loop for days
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("Day" + day);
//            }
//            System.out.println();
//        }

//        Q8:
//        System.out.print("Enter a word: ");
//        String word = in.nextLine();
//
//        boolean isPalindrome = isPalindrome(word);
//
//        if (isPalindrome) {
//            System.out.println("'" + word + "' is a palindrome.");
//        } else {
//            System.out.println("'" + word + "' is not a palindrome.");
//        }
//    }
//
//    public static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

    }
}
