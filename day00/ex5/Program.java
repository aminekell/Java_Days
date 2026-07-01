import java.util.Scanner;

public class Program {
    static public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] store_student = new String[10];
        int stage_1 = 0;
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            if (stage_1 == 10 || one.equals(".")) {
                break;
            }
            char[] no_space = one.toCharArray();
            if (one.length() > 10) {
                System.err.println("Maximum length of a student’s name is 10");
                System.exit(-1);
            }
            for (int j = 0; j < no_space.length; j++) {
                if (no_space[j] == ' ') {
                    System.err.println("no spaces in the name please !!");
                    System.exit(-1);
                }
            }
            store_student[stage_1] = one;
            stage_1++;
        }

        int[] store_int = new int[10];
        String[] store_string = new String[10];

        int stage_2= 0;
        while (scanner.hasNext()) {

            if (stage_2 == 10)
                break;
            if (scanner.hasNextInt()) {
                int h = scanner.nextInt();
                if (h < 1 || h > 6) {
                    System.err.println("Classes can be held on any day of week between 1 pm and 6 pm");
                    System.exit(-1);
                }
                store_int[stage_2] = h;
            }
            String Check = scanner.next();
            if (Check.equals("."))
                break;
            String[] days = { "MO", "TU", "WE", "TH", "FR", "SA", "SU" };
            boolean found = false;
            for (int p = 0; p < days.length; p++) {
                if (Check.equals(days[p])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.err.println(
                        "you need to enter a valid day name (\"MO\", \"TU\", \"WE\", \"TH\", \"FR\", \"SA\", \"SU\")");
                System.exit(-1);
            }
            store_string[stage_2] = Check;
            stage_2++;
        }

        int stage_3 = 0;

        String[] student_ineed = new String[10];

        int[] time = new int[10];

        int[] date = new int[10];

        String[] status = new String[10];

        while (scanner.hasNext()) {
            if (stage_3 == 10)
                break;

            String Check = scanner.next();
            if (Check.equals("."))
                break;

            boolean o = false;
            for (int k = 0; k < store_student.length; k++) {
                if (store_student[k].equals(Check)) {
                    o = true;
                }
            }
            if (!o) {
                System.err.println("student not found !!!");
                System.exit(-1);
            }
            student_ineed[stage_3] = Check;

            if (scanner.hasNextInt()) {
                int h = scanner.nextInt();
                if (h < 1 || h > 6) {
                    System.err.println("fix the date please");
                    System.exit(-1);
                }
                time[stage_3] = h;
            }

            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                if (b < 1 || b > 30) {
                    System.err.println("fix the date please");
                    System.exit(-1);
                }
                date[stage_3] = b;
            }

            Check = scanner.next();
            if (Check.equals("HERE")) {
                status[stage_3] = "HERE";
            } else if (Check.equals("NOT_HERE")) {
                status[stage_3] = "NOT_HERE";
            }
            stage_3++;
        }

        scanner.close();
    }
}
