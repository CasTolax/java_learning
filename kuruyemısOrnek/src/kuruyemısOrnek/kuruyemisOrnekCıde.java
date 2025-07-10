package kuruyemısOrnek;

public class kuruyemisOrnekCıde {

	public static void main(String[] args) {
	   // fiyatlar
       double leblebi = 3.5;
       double findik = 15.7;
       double badem = 22;
       
      // hesaplama 
       double maliyettutar = (leblebi*12) + (findik*25) + (badem*40);
       double  satistutar = ((leblebi*1.5) + (findik*1.4)*25) + ((badem*1.6)*40);
       double kaartutar = satistutar - maliyettutar;
       
       if (kaartutar > 500) // koşullandırma -eğer- 500 den fazla ise
       {
    	   System.out.println("kirayı ödeyebilirsiniz");
       }
       else //değil ise -eğer 500'den az ise 
       {
    	   System.out.println("kirayı ödemek için yeterli paranız yok");
       }
       
       
	}

}
