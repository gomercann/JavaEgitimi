package hatayonetimi;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int toplam = 0;
		
		try {
				reader = new BufferedReader(new FileReader("src\\hatayonetimi\\gokhan.txt"));
				System.out.println("Dosya Başarıyla Okundu");
				
				String line = null;
				while((line = reader.readLine())!=null) {
					toplam = toplam + Integer.valueOf(line);					
				}
				System.out.println("Toplam = "+ toplam);
		}catch (FileNotFoundException e) {e.printStackTrace();
		}finally {reader.close();
				System.out.println("BufferedReader başarıyla kapatıldı");
		}
		

	}

}
