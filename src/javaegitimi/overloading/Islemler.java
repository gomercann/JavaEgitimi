package javaegitimi.overloading;

public class Islemler {

	//aynı isimdeki iki fonkiyon için farklı sayıda parametre aldırabilme işlemine overloading denir.
	
	//Çarp fonksiyonunun iki parametreli hali
	public int carp(int a, int b) {
		return a*b;
	}
	
	//Çarp fonksiyonunun 3 parametreli hali
	public int carp(int a, int b,int c) {
		return a*b*c;
	}
}
