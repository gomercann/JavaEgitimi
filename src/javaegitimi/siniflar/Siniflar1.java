package javaegitimi.siniflar;

public class Siniflar1 {

	public static void main(String[] args) {
		
		//diğer sınıftan bir nesne yaratma
		IlkSinif sinif = new IlkSinif();
		
		//Yaratılan nesne aracılığıyla sınıftan fonksiyon çağırma.
		sinif.Ekle();

		DemoSinifi sinif2 = new DemoSinifi();
		System.out.println(sinif2.carp(5, 9));
	}

}

