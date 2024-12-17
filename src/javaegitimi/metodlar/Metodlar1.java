package javaegitimi.metodlar;

public class Metodlar1 {

	public static void main(String[] args) {
		
		mesajVer();
		
		int a = 9;
		
		parametreliFonksiyon(a);
		
		
		
	}
	//fonksiyon oluşturuldu. içerisine yazdırılan değerler ana koddan çağırıldı
	public static void mesajVer() {
		
		System.out.println("Fonksiyon Çağırıldı");
	}

	//içine değer alan fonksiyon oluşturuldu. içerisine yazdırılan değerler ana koddan çağırıldı
	public static void parametreliFonksiyon(int x) {
		
		System.out.println("Fonksiyon Çağırıldı ve "+x+" değeri yazdırıldı.");
	}
	
}

