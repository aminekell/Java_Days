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
        
        String[] days = { "" ,"MO", "TU", "WE", "TH", "FR", "SA", "SU" };
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
        for(int i = 0; i < stage_2 ; i++)
            {
                System.out.println(store_string[i]);
            }
        for(int i = 1; i < 30 ; i++)
                {
                    if(1 % i == 0)
                        System.out.println(i);
                }
            
        scanner.close();
    }
}


























/* 



public static int[] getDaysInSeptember2020(String targetDay) {
    // 1. Map the 2-letter codes to numeric day values
    // Monday = 1, Tuesday = 2, ..., Sunday = 7
    int targetDayValue = 0;
    if (targetDay.equals("MO")) targetDayValue = 1;
    else if (targetDay.equals("TU")) targetDayValue = 2;
    else if (targetDay.equals("WE")) targetDayValue = 3;
    else if (targetDay.equals("TH")) targetDayValue = 4;
    else if (targetDay.equals("FR")) targetDayValue = 5;
    else if (targetDay.equals("SA")) targetDayValue = 6;
    else if (targetDay.equals("SU")) targetDayValue = 7;
    else return new int[0]; // Return empty array if input is invalid

    // 2. September 1st, 2020 was a Tuesday (Day value = 2)
    int septFirstDayValue = 2; 

    // 3. Find the first matching day of the month
    int firstOccurrence = 1 + (targetDayValue - septFirstDayValue + 7) % 7;

    // 4. Count how many times this day appears in September (30 days total)
    int count = 0;
    for (int day = firstOccurrence; day <= 30; day += 7) {
        count++;
    }

    // 5. Populate the exact dates into the final array
    int[] resultDays = new int[count];
    int index = 0;
    for (int day = firstOccurrence; day <= 30; day += 7) {
        resultDays[index] = day;
        index++;
    }

    return resultDays;
}
}

*/