package javaegitimi.miniprojeler1;

public class KalinInceHarfler {

	public static void main(String[] args) {
		char harf = 'Ü';
		
		switch(harf) {
			case  'A':
			case  'I':
			case  'O':
			case  'U':
				System.out.println("Kalın Sesli");
				break;
			
			default : 
				System.out.println("İnce Sesli");
			
		}

	}

}
