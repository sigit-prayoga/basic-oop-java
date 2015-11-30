package trainingInheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakhlukHidup animal = new MakhlukHidup();
		animal.berkembangbiak();
		animal.bernapas();
		animal.makan();
		System.out.println();
		
		Sapi a = new Sapi();
		a.berkembangbiak();
		a.bernapas();
		a.makan();
		a.tumbuh();
		System.out.println();
		
		BurungElang b = new BurungElang();
		b.berkembangbiak();
		b.bernapas();
		b.makan();
		System.out.println();
		
		Pinguin d = new Pinguin();
		d.berkembangbiak();
		d.bernafas();
		d.makan();
		System.out.println();
		
		Ular c = new Ular();
		c.bernapas();
		c.makan();
		c.berkembangbiak();
		System.out.println();
		
		MakhlukHidup paus = new Paus();
		paus.bernapas();
		paus.makan();
		paus.berkembangbiak();
		System.out.println();
		
		Paus paus1 = new Paus();
		paus1.bernapas();
		paus1.makan();
		paus1.berkembangbiak();
		paus1.jenis();
		System.out.println();
	}


}
