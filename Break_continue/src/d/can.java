package d;

public class can {

	public static void main(String[] args) {
		  
		//break ve continue örnekleri
		
		/*int sayibul;
		
		for(int i = 1; i<=10; i++ ) { // 10'a kadar devam et
			
			if(i==6) { // eğer 6 ise
				
				sayibul=i; //i le sayibul değişkeni eşitlendi
				
				System.out.println("sayı bulundu" + "\n" + sayibul);
				break; // döngüyü kırar
			}*/
		
		//continue
		
		for(int i = 1; i<10; i++) { // 10 a kadar devam et
			if(i==7 || i==8) { // eğer 7 ve 8 var ise
				continue; // 1 kere durdur ve devam et
			}
			System.out.println(i); // i'yi yazdır
			
			
			
		}
	}

}
