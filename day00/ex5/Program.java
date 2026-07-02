import java.util.Scanner;

public class Program {
    public static int[] getDaysInSeptember2020(String targetDay) {
        if (targetDay.equals("TU"))
            return new int[] { 1, 8, 15, 22, 29 };
        if (targetDay.equals("WE"))
            return new int[] { 2, 9, 16, 23, 30 };
        if (targetDay.equals("TH"))
            return new int[] { 3, 10, 17, 24 };
        if (targetDay.equals("FR"))
            return new int[] { 4, 11, 18, 25 };
        if (targetDay.equals("SA"))
            return new int[] { 5, 12, 19, 26 };
        if (targetDay.equals("SU"))
            return new int[] { 6, 13, 20, 27 };
        if (targetDay.equals("MO"))
            return new int[] { 7, 14, 21, 28 };
        return new int[0];
    }

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

        String[] days = { "", "MO", "TU", "WE", "TH", "FR", "SA", "SU" };
        int stage_2 = 0;
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
            // System.out.println("check the problem --------------------->");
            // System.out.println(store_student.length);

            for (int k = 0; k < stage_1; k++) {
                if (store_student[k].equals(Check)) {
                    o = true;
                }
            }
            // System.out.println("second place to check the problem");
            if (!o) {
                System.err.println("student not found !!!");
                System.exit(-1);
            }
            student_ineed[stage_3] = Check;

            if (scanner.hasNextInt()) {
                int h = scanner.nextInt();
                if (h < 1 || h > 6) {
                    System.err.println("fix the date please between 1 and 6");
                    System.exit(-1);
                }
                time[stage_3] = h;
            }

            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                if (b < 1 || b > 30) {
                    System.err.println("need to be between 1 and 30");
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
        System.out.println("--------------------------------------");
        int[] result = new int[100];
        int[] hour = new int[100];
        String[] Weekday = new String[100];
        int index = 0;

        for (int i = 0; i < store_string.length; i++) {
            if (store_string[i] == null) {
                break;
            }

            int[] daya = getDaysInSeptember2020(store_string[i]);

            for (int j = 0; j < daya.length; j++) {
                result[index] = daya[j];
                hour[index] = store_int[i];
                Weekday[index] = store_string[i];
                index++;
            }
        }
        int[] sort = new int[index];
        int[] sort_hour = new int[index];
        String[] sort_Weekday = new String[index];

        for (int j = 0; j < index; j++) {
            int min = 100;
            int pos = -1;

            for (int i = 0; i < index; i++) {
                if (result[i] < min) {
                    min = result[i];
                    pos = i;
                }
            }

            sort[j] = min;
            sort_hour[j] = hour[pos];
            sort_Weekday[j] = Weekday[pos];
            result[pos] = 100;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(sort[i] + " " + sort_hour[i] + " " + sort_Weekday[i]);
        }

        scanner.close();
    }
}