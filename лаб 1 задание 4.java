import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num > 0) {
		    num++;
		} else if (num < 0) {
		    num = num - 2;
		} else {
		    num = 10;
		}
		System.out.println(num);
	}
}


