package switch_case;
import java.util.Scanner;
public class ornekCodeSwitchCase {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen 0-9 aralığında sayı giriniz = ");
		int sayi = input.nextInt();
		
		
		switch(sayi) {
		case 1:
			System.out.println("pazartesi");
		     break;
		case 2:
			System.out.println("salı");
			break;
		case 3:
			System.out.println("çarşamba");
			break;
		case 4:
			System.out.println("perşembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
			
		
		}
	}

}
