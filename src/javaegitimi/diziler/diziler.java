package javaegitimi.diziler;

public class diziler {

	public static void main(String[] args) {
		
		//dizi tanımlama
		String[] ogrenciler = new String[3];
		
		//diziye eleman atama
		ogrenciler[0] = "gökhan";
		ogrenciler[1] = "kübra";
		ogrenciler[2] = "asya";
		
		//elaman listeleme
		for(int i = 0; i<ogrenciler.length;i++) {
			System.out.print(ogrenciler[i]);
		}

		///eleman listeleme ikinci yöntem
		for(String ogrenci:ogrenciler) {
			System.out.print(ogrenci);
		}
		
	}

}
