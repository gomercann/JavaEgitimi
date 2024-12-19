package javaegitimi.overloading;

public class Overloading {

	public static void main(String[] args) {
		Islemler islem = new Islemler();
		
		System.out.println("iki parametreli çarpım:"+islem.carp(5, 8));
		System.out.println("üç parametreli çarpım: "+islem.carp(7, 8, 9));

	}

}
