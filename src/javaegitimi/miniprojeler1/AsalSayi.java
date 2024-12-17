package javaegitimi.miniprojeler1;

//girilen bir sayının asal olup olmadığını anlamaya yarayan proje
public class AsalSayi {

	public static void main(String[] args) {
		int sayi = 7;
		boolean asalmi = true;
		
		
		for(int i=2;i<sayi;i++) {
			
			if(sayi%i==0) { 
				asalmi=false;
				break;}
		}
		
		if(asalmi==true)System.out.println("sayı asal");
		else System.out.println("asal değil");
		
		

	}

}
