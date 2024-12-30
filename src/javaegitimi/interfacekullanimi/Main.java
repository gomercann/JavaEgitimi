package javaegitimi.interfacekullanimi;

public class Main {

	//interfaceler abstract sınıflardan farklı olarak class etiketiyle kullanılmazlar.
	//ayrıca bir class, birden fazla interface'ten referans alabilir.
	//Örneğin Oracle Musteri isimli sınıfta hem IMusteriDal, hem Irepository'i referans aldık.
	
	public static void main(String[] args) {
		IMusteriDal musteriBaglan = new OracleMusteriDal();
		musteriBaglan.Ekle();
		
		MusteriYonetimi musteri = new MusteriYonetimi(new MySqlMusteriDal());
		musteri.ekle();
		
		
		

	}

}
