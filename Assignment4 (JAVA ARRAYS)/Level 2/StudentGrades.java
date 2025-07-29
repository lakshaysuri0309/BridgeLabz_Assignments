import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Enter Physics marks: ");
            physics[i] = getValidMarks(sc);

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = getValidMarks(sc);

            System.out.print("Enter Maths marks: ");
            maths[i] = getValidMarks(sc);

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 80)
                grade[i] = "B";
            else if (percentage[i] >= 70)
                grade[i] = "C";
            else if (percentage[i] >= 60)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        System.out.println("\n--- Result ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                " => Physics: " + physics[i] +
                ", Chemistry: " + chemistry[i] +
                ", Maths: " + maths[i] +
                ", %: " + String.format("%.2f", percentage[i]) +
                ", Grade: " + grade[i]);
        }
    }

    static int getValidMarks(Scanner sc) {
        int marks;
        while (true) {
            marks = sc.nextInt();
            if (marks >= 0)
                break;
            System.out.print("Enter positive marks: ");
        }
        return marks;
    }
}
