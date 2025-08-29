/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author GENERAL STORES
 */
class Essai1Exception extends Exception {
	Essai1Exception(String s) { super(s); }
}
class Essai2Exception extends Exception {
	Essai2Exception(String s) { super(s); }
}
class Essai3Exception extends Essai1Exception {
	Essai3Exception(String s) { super(s); }
}
class Sample {
	static void throwEssais(int i) throws Exception {
		try {
                    switch (i) {
                            case 1: throw new Essai1Exception("Essai1Exception de throwEssais");
                            case 2: throw new Essai2Exception("Essai2Exception de throwEssais");
                            case 3: throw new Essai3Exception("Essai3Exception de throwEssais");
			default: throw new Exception("Exception de throwEssais");
                    }
		}
		finally {
			System.out.println("Finally de throwEssais");
		}
	}
	public static void main(String [] args){
		for (int i = 1; i < 4; i++) {
			try { throwEssais(i); }
			catch (Essai3Exception e) { System.out.println("Catch Essais3"); }
			catch (Essai1Exception e) { System.out.println("Catch Essais1"); }
			catch (Exception e) { System.out.println("Catch Exception"); }
			finally { System.out.println("Finally de main"); }
		}
	}
}
