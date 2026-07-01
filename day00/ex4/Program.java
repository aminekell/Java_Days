import java.util.Scanner;

public class Program {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] hold_all = new int[65535];

        char[] Convert = input.toCharArray();

        for (int i = 0; i < Convert.length; i++) {
            hold_all[Convert[i]]++;
        }

        int[] top_repet = new int[10];
        char[] top_char_rep = new char[10];
        for (int i = 0; i < 10; i++) {
            int max = 0;
            char mx_char = 0;
            for (char j = 0; j < 65535; j++) {
                if (hold_all[j] > max) {
                    max = hold_all[j];
                    mx_char = j;
                }
            }
            top_repet[i] = max;
            top_char_rep[i] = mx_char;

            hold_all[mx_char] = 0;
        }

        int[] high = new int[10];

        if (top_repet[0] == 0) {
            scanner.close();
            System.exit(-1);
        }
        for (int i = 0; i < 10; i++) {
            high[i] = top_repet[i] * 10 / top_repet[0];
        }

        System.out.println();

        for (int row = 11; row >= 1; row--) {
            for (int col = 0; col < 10; col++) {
                if (top_repet[col] == 0)
                    continue;

                int height = high[col];

                if (height + 1 == row) {
                    System.out.print(top_repet[col] + "   ");
                } else if (height >= row) {
                    System.out.print("#   ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int col = 0; col < 10; col++) {
            System.out.print(top_char_rep[col] + "   ");
        }
        System.out.println();
        scanner.close();
    }
}
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42