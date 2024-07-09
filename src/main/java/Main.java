import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "Racecar";
        System.out.println(isPalindrome(input));
        System.out.println(isPalindrome(""));
        System.out.println(reverseString("Hello"));

        System.out.println(generateNPrimeNumbers(5));

    }

    public static String reverseString(String input) {
        if (input != null && !input.isEmpty()) {
            return new StringBuilder(input).reverse().toString();
        }
        return null;
    }

    public static boolean isPalindrome(String input) {
        if (input != null && !input.isEmpty()) {
            String reversed = reverseString(input);
            return input.equalsIgnoreCase(reversed);
        }
        return false;

//        int left = 0;
//        int right = input.length() - 1;
//
//        while (left < right) {
//            if (input.charAt(left) != input.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//
//        return true;
    }

    public static List<Integer> generateNPrimeNumbers(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }

        return primes;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
