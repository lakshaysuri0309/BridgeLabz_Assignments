import java.util.*;

public class ArrayVote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter age of "+ (i+1) + " Student: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				System.out.println("Student " + (i+1) + " : Invalid Age");
			}else if(arr[i]>=18){
				System.out.println("Student " + (i+1) + " with age " + arr[i] + " is eligible to vote");
			}else{
				System.out.println("Student " + (i+1) + " with age " + arr[i] + " is not eligible to vote");	
			}
		}
	}
}