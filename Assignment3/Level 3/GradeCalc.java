import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Physics: ");
        int p = sc.nextInt();
        System.out.print("Chemistry: ");
        int c = sc.nextInt();
        System.out.print("Maths: ");
        int m = sc.nextInt();

        int total = p + c + m;
        double avg = total / 3.0;

        System.out.println("Average: " + avg);

        if (avg >= 80)
            System.out.println("Grade A");
        else if (avg >= 70)
            System.out.println("Grade B");
        else if (avg >= 60)
            System.out.println("Grade C");
        else if (avg >= 50)
            System.out.println("Grade D");
        else if (avg >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");
    }
}
