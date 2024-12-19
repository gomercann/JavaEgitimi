package javaegitimi.abstractsiniflar;

public abstract class Hesaplama {
	//Hesaplama sınıfından miras alan tüm sınıflarda, hesapla isimli fonksiyonu oluşturmak zorunda kaldı.
	//Eğer mirasçı sınıflarda hesapla fonksiyonu oluşturulmazsa kod hata verir.
	public abstract void hesapla();
	
	public void kaybetti() {
		System.out.println("Ana hesaplamadan kaybettin mesajı verildi");
	}
}
