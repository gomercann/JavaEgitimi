package javaegitimi.inheritance;

//kalıtım sayesinde, müşteri ve çalışan sınıflarında ortak kullanabileceğimiz değişkenleri kişi isimli farklı bir sınıf
//kullanarak yazdık. Diğer sınıfların özelliklerini kişi sınıfını genişleterek yazdık. 

public class inhteritance {

	public static void main(String[] args) {
		Calisan x = new Calisan();
		Musteri y = new Musteri();
		
		x.id = 5;
		y.adres="mersin";

	}

}
