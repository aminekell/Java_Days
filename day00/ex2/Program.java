import java.util.Scanner;

class Program {

    public static boolean isPrime(int num) { 
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static int sumofDigits(long num) {
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeeCount = 0;

        while (scanner.hasNextLong()) {
            long target = scanner.nextLong();
            
            if (target == 42) {
                break;
            }

            int digitsSum = sumofDigits(target);
            if (isPrime(digitsSum)) {
                coffeeCount++;
            }
        }
        System.out.println("Count of coffee-request : " + coffeeCount);
        scanner.close();
    }
}