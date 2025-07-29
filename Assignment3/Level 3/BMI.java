import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Height (cm): ");
        double height = sc.nextDouble();

        height = height / 100; // Convert to meters
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        if (bmi <= 18.4)
            System.out.println("Underweight");
        else if (bmi <= 24.9)
            System.out.println("Normal");
        else if (bmi <= 39.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
