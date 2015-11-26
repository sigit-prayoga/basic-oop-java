package sampleofinterface;

import people.QAEngineer;

public class MainOfInterfaceSample {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		SamsungGalaxy samsung = new SamsungGalaxy();
		
		
		QAEngineer mark = new QAEngineer("Mark", "ID1", 32);
		mark.callCustomer(iphone, "1", samsung);
	}

}
