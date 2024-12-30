package javaegitimi.innerclassvestatic;

public class Main {

	public static void main(String[] args) {
		UrunYonetimi yonetici = new UrunYonetimi();
		Urun urun = new Urun();
		urun.fiyat=10;
		urun.id=1;
		urun.urunAdi="at";

		yonetici.Ekle(urun);
	}

}
