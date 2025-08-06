import java.util.*;

public class BMIProgram {
    static double[][] input = new double[10][2];

    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100;
            double bmi = w / (h * h);
            String status = bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : bmi < 30 ? "Overweight" : "Obese";
            result[i][0] = w + "";
            result[i][1] = data[i][1] + "";
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        for (String[] row : data)
            System.out.println(String.join("\t", row));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            input[i][0] = sc.nextDouble();
            input[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(input);
        display(result);
    }
}
