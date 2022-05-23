import java.util.Scanner;
public class DivisionOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to check its divisability:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num % 3 == 0 && num % 5 == 0)
		{
			System.out.println(num + " is divisible by both 3 & 5.");
		}
		else if (num % 3 == 0)
		{
			System.out.println(num + " is divisible by 3 only.");
		}
		else if (num % 5 == 0)
		{
			System.out.println(num + " is divisible by 5 only.");
		}
		else
		{
			System.out.println(num + " is not divisible by 3 & 5.");
		}
	}

}
