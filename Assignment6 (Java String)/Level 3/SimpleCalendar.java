import java.util.Scanner;

public class SimpleCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int[] daysInMonth = {31, 28, 31, 30, 31, 30,
                             31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        System.out.println(months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(month, year);
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= daysInMonth[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                return y % 400 == 0;
            }
            return true;
        }
        return false;
    }

    static int getStartDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m)/12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }
}
