package javaegitimi.innerclassvestatic;

public class UrunYonetimi {
	public void Ekle(Urun urun) {
		UrunDogrulama dogru = new UrunDogrulama();
		if(dogru.isValid(urun)) {
		System.out.println("eklendi");}
		else {System.out.println("Eklenemedi");}
	}
}
