package javaegitimi.innerclassvestatic;

public class UrunDogrulama {
	public boolean isValid(Urun urun) {
		if(urun.fiyat>0 && !urun.urunAdi.isEmpty()) {return true;}
		else return false;
		
		
	}
}
