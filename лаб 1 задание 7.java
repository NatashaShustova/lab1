import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int code = scanner.nextInt();
		double time, price1, price2, price3, price4, Moscow, Rostov, Krasnodar, Kirov;
		time = 10;
		price1 = 4.15;
		price2 = 1.98;
		price3 = 2.69;
		price4 = 5;
		Moscow = time*price1;
		Rostov = time*price2;
		Krasnodar = time*price3;
		Kirov = time*price4;
		switch(code) {
		    case 905:
		        System.out.println("Москва. Стоимость разговора: " + Moscow);
		        break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: " + Rostov);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: " + Krasnodar);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: " + Kirov);
                break;
            default:
                System.out.println("Неверный код");
		}
	}
}


