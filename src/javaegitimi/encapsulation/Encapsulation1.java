package javaegitimi.encapsulation;

public class Encapsulation1 {

	public static void main(String[] args) {
		Urun yeniUrun = new Urun();
		
		yeniUrun.setID(9);
		yeniUrun.setStokSayisi(1);;
		yeniUrun.setUrunAciklamasi("az kilometreli at");
		yeniUrun.setUrunAdi("Gölgeyele");
		yeniUrun.setUrunFiyati(1907);

		UrunYonetimi ekle = new UrunYonetimi();
		ekle.Ekle(yeniUrun);
		
	}

}
