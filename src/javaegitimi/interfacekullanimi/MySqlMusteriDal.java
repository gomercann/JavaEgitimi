package javaegitimi.interfacekullanimi;

public class MySqlMusteriDal implements IMusteriDal {

	@Override
	public void Ekle() {
		System.out.println("MySql Bağlandı");
	}

}
