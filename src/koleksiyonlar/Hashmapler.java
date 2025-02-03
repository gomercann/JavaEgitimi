package koleksiyonlar;
import java.util.HashMap;

//hashmapler, birçok dilde dictionary/sözlük olarak geçer.
public class Hashmapler {
	//HashMap oluşturma
	HashMap<String,String> sozluk = new HashMap<String,String>();
	
	public HashMap<String, String> getSozluk() {
		return sozluk;
	}

	public void setSozluk(HashMap<String, String> sozluk) {
		this.sozluk = sozluk;
	}

	Hashmapler(){
		//HashMap eleman ekleme. ilk değer anahtar, ikinci değer ise değerdir. (Key-Value)
		sozluk.put("gökhan", "kral");
		sozluk.put("Kübra", "aşk");
		sozluk.put("Fenerbahçe", "kader");
		sozluk.put("Aşk", "At");
		
		System.out.println(sozluk);
	}
	
	
}
