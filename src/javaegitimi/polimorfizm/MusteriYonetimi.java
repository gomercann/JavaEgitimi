package javaegitimi.polimorfizm;

public class MusteriYonetimi {

	private BaseLogger logger;
	
	public MusteriYonetimi(BaseLogger logger) {
		this.logger=logger;
	}
	public void Add() {
		System.out.println("Müşteri Eklendi");
		this.logger.Log("Log mesajı");
		
	}
}
