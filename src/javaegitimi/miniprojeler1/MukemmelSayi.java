package javaegitimi.miniprojeler1;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		int sayi = 28;
		int toplam=0;
		
		for(int i =1;i<sayi;i++) {
			if(sayi%i==0) toplam=toplam + i;
			
		}
		
		if(toplam==sayi)System.out.println("Mükemmel Sayi");
		else System.out.println("mükkemmel değil");
	}

}
