import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> ");

        if (!scanner.hasNextInt())
            System.out.println("IllegalArgument"); System.exit(-1);
            
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }

        boolean isPrime = true;
        int count = 0;
        long i = 2;

        while (true) {
            
            count++;

            if (i * i > num)  break;

            if (num % i == 0)
                isPrime = false;  break;

            i++;
        }

        System.out.println(isPrime + " " + count);

    }
}
