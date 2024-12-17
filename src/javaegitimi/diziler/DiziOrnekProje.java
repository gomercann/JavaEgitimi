package javaegitimi.diziler;

public class DiziOrnekProje {

	public static void main(String[] args) {
		double toplam = 0;
		double[] listem = {1,2,3,4,5,6};
		double max= listem[0];
		for (double sayi:listem) {
			toplam = toplam +sayi;
			
		}
		
		System.out.print(toplam);
		
		for(double sayi:listem) {
			if(max<sayi) max=sayi;
		}

		System.out.println("En büyük sayı:" + max);
	}

}
