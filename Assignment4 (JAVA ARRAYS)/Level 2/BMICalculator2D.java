import java.util.*;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double h, w;
            System.out.println("\nPerson " + (i + 1) + ":");

            do {
                System.out.print("Enter height (m): ");
                h = sc.nextDouble();
            } while (h <= 0);

            do {
                System.out.print("Enter weight (kg): ");
                w = sc.nextDouble();
            } while (w <= 0);

            double bmi = w / (h * h);
            data[i][0] = h;
            data[i][1] = w;
            data[i][2] = bmi;

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + data[i][0] + " m, Weight = " + data[i][1] +
                    " kg, BMI = " + String.format("%.2f", data[i][2]) + ", Status = " + status[i]);
        }
    }
}
