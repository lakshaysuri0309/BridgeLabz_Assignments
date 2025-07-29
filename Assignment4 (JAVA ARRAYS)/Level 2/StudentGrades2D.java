import java.util.*;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; 
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = getMarks(sc);

            System.out.print("Chemistry: ");
            marks[i][1] = getMarks(sc);

            System.out.print("Maths: ");
            marks[i][2] = getMarks(sc);

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;

            if (percent[i] >= 90)
                grade[i] = "A";
            else if (percent[i] >= 80)
                grade[i] = "B";
            else if (percent[i] >= 70)
                grade[i] = "C";
            else if (percent[i] >= 60)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        System.out.println("\n Students Result ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " => " +
                "Physics: " + marks[i][0] + ", " +
                "Chemistry: " + marks[i][1] + ", " +
                "Maths: " + marks[i][2] + ", " +
                "Percentage: " + String.format("%.2f", percent[i]) + "%, " +
                "Grade: " + grade[i]);
        }
    }

    static int getMarks(Scanner sc) {
        int m;
        while (true) {
            m = sc.nextInt();
            if (m >= 0 && m <= 100)
                break;
            System.out.print("Invalid marks. Enter again (0 to 100): ");
        }
        return m;
    }
}
