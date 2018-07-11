import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		System.out.println("Ievadi pirmo frazi: ");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		
		System.out.println("Ievadi otro frazi: ");
		Scanner scanner2 = new Scanner(System.in);
		String str2 = scanner.nextLine();
		
		
		int str1Length = str1.length();
		int str2Length = str2.length();
		
		if (str1Length >= str2Length) {
			System.out.println(str2 + str1 + str2);
		} 
		 else {
			System.out.println(str1 + str2 + str1);
		} 
		
		
	}

}
