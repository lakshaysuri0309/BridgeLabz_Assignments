import java.util.Scanner;

public class SignAndCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive and Even");
                else
                    System.out.println(num + " is Positive and Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
		
        if (arr[0] == arr[4])
            System.out.println("First and Last are Equal");
        else if (arr[0] > arr[4])
            System.out.println("First is Greater than Last");
        else
            System.out.println("First is Less than Last");
    }
}
