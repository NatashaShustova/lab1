import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num < 0 && num%2 == 0) {
		    System.out.println("Отрицательное чётное число");
		} else if (num < 0 && num%2 != 0) {
		    System.out.println("Отрицательное нечётное число");
		} else if (num > 0 && num%2 == 0) {
		    System.out.println("Положительное чётное число");
		} else if (num > 0 && num%2 != 0) {
		    System.out.println("Положительное нечётное число");
		} else {
		    System.out.println("Нулевое число");
		}
	}
}


