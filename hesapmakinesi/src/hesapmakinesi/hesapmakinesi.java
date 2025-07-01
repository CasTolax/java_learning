package hesapmakinesi;
import java.util.Scanner; // kullanıcıdan veri alınmasını sağlar

public class hesapmakinesi {

	public static void main(String[] args) {

		System.out.println("--  basit hesap makinesi -- ");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.toplama 2.çıkarma 3.çarpma 4.bölme");
		int hesap = input.nextInt();
		
		if (hesap == 1) {
			System.out.println("1.sayıyı giriniz:");
			System.out.println("2.sayıyı giriniz:");
			
			int sayi1 = input.nextInt();
			int sayi2 = input.nextInt();
			
			System.out.println("sonuc:" + sayi1 + sayi2);
		}
		if (hesap == 2) {
			System.out.println("1.sayıyı giriniz:");
			System.out.println("2.sayıyı giriniz:");
			
			int sayi1 = input.nextInt();
			int sayi2 = input.nextInt();
			
			System.out.println("sonuc:" + (sayi1 - sayi2));
		}
		if (hesap == 3) {
			System.out.println("1.sayıyı giriniz:");
			System.out.println("2.sayıyı giriniz:");
			
			int sayi1 = input.nextInt();
			int sayi2 = input.nextInt();
			
			System.out.println("sonuc:" + (sayi1 * sayi2));
		}
		if (hesap == 4) {
			System.out.println("bölme işlemin de sıfır bölünemez!");
			
			System.out.println("1.sayıyı giriniz:");
			System.out.println("2.sayıyı giriniz:");
			
			int sayi1 = input.nextInt();
			int sayi2 = input.nextInt();
			
			System.out.println("sonuc:" + (sayi1 / sayi2));
		}
		
		

	}

}
