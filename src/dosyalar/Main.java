package dosyalar;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		dosyaOlustur();
		sayfaBilgileri();
		dosyaOku();
		dosyaYaz();
		dosyaOku();
		
	}
	
	public static void dosyaOlustur() {
		File file = new File("C:\\Users\\gomeracn\\eclipse-workspace\\JavaEgitimi\\src\\dosyalar\\files\\ogrenci.txt");
		try {
			if (file.createNewFile()){
			System.out.println("Dosya Oluşturuldu");}
			else {System.out.println("Dosya zaten mevcut");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	
	public static void sayfaBilgileri() {
		File file = new File("C:\\Users\\gomeracn\\eclipse-workspace\\JavaEgitimi\\src\\dosyalar\\files\\ogrenci.txt");
		
		if (file.exists()) {
			System.out.println("Dosya Adı:" + file.getName());
			System.out.println("Dosya Yolu : " + file.getAbsolutePath());
			System.out.println("Dosya Yazılabilir mi : " + file.canWrite());
			System.out.println("Dosya Okunabilir mi : " + file.canRead());
			System.out.println("Dosya Boyutu : " + file.length());
			
		}
		
	}
	
	public static void dosyaOku() {
		File file = new File("C:\\Users\\gomeracn\\eclipse-workspace\\JavaEgitimi\\src\\dosyalar\\files\\ogrenci.txt");
		
		try {
			Scanner myReader = new Scanner(file);
			while(myReader.hasNextLine()) {
				String line = myReader.nextLine();
				System.out.println(line);
			}
			myReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void dosyaYaz() {
		try  {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\gomeracn\\eclipse-workspace\\JavaEgitimi\\src\\dosyalar\\files\\ogrenci.txt",true));
			writer.write("Kübraaaaaam");
			System.out.println("Dosyaya Yazıldı");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
