/**
 * 
 */
package com.study.pattern.decorator;

/**
 * @author 
 * Dress test class
 *
 */
public class KleidTesten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kleid sportKleid= new SportKleid(new EinfachesKleid());
		sportKleid.assemble();
		Kleid verruecktesKleid= new VerruecktesKleid(new LaessigesKleid(new EinfachesKleid()));
		verruecktesKleid.assemble();

	}
	
	/**
	 * Dress interface
	 *
	 */
	

}

interface Kleid{
	void assemble();
}

/**
 * Basic dress
 *
 */
class EinfachesKleid  implements Kleid{

	@Override
	public void assemble() {
		System.out.println("Einfaches Kleid- basic dress");
		
	}
	
}

/**
 * Decorator dress class
 *
 */
class DekorateurinKleid extends EinfachesKleid{
	
	private Kleid kleid;
	
	public DekorateurinKleid(Kleid kleid) {
		this.kleid = kleid;
	}
	
	@Override
	public void assemble() {
		System.out.println("Dekorateurin Kleid- decorator(f) dress assemble room");
		this.kleid.assemble();
		
	}
	
}

/**
 * fancy dress class
 *
 */
class VerruecktesKleid extends DekorateurinKleid{

	public VerruecktesKleid(Kleid kleid) {
		super(kleid);
	}
	
	@Override
	public void assemble() {
		System.out.println("Verruecktes Kleid -fancy dress assemble");
		super.assemble();
		
	}
	
}

/**
 * sports dress class
 *
 */
class SportKleid extends DekorateurinKleid{

	public SportKleid(Kleid kleid) {
		super(kleid);
	}
	
	@Override
	public void assemble() {
		System.out.println("Sportkleid -sports dress assemble");
		super.assemble();
		
	}
	
}

/**
 * casual dress class
 *
 */
class LaessigesKleid extends DekorateurinKleid{

	public LaessigesKleid(Kleid kleid) {
		super(kleid);
	}
	
	@Override
	public void assemble() {
		System.out.println("Laessiges kleid -casual dress assemble");
		super.assemble();
		
	}
	
}
