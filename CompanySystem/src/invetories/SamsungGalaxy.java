package invetories;
import interfaces.Calendar;
import interfaces.Handphone;


public class SamsungGalaxy implements Handphone, Calendar {
	private String name;
	private String type;
	private long price;
	
	
	@Override
	public boolean sendMessage(String text, String number) {
		//send text message with the number
		return false;
	}
	
	@Override
	public void callSomeone(String number) {
		//call someone with other function
		System.out.print("Call with SamsungGalaxy to number: "+number);
	}

	@Override
	public boolean createEvent(String date, String name) {
		return false;
	}

	@Override
	public void showAllDate() {
		
	}
}
