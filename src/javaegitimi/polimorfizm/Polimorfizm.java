package javaegitimi.polimorfizm;

public class Polimorfizm {

	public static void main(String[] args) {

		//mirasçılardan bir dizi oluşturarak birden fazla sınıfı aynı anda üretebiliriz.
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new MailLogger(),new DBLogger()};

		for(BaseLogger logger:loggers) {
			logger.Log("Mesaj");
		}
		
		//daha doğru kullanım:
		//yeni bir müşteri sınıfı oluştururken içinde dblogger vererek yönetim sınıfı içinde new kullanmaktan kurtulduk
		//ilerde veritabanı yerine File logger kullanmak istersek yapmamız gereken tek şey, buradaki dbloggeri değiştirmek
		MusteriYonetimi musteri = new MusteriYonetimi(new DBLogger());
		musteri.Add();
		
	}

}
