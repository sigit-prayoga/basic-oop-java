package invetories;
import interfaces.Calendar;
import interfaces.Handphone;


public class Iphone implements Handphone, Calendar {

	@Override
	public boolean sendMessage(String text, String number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void callSomeone(String number) {
		System.out.print("Call with iPhone to number: "+number);
	}

	@Override
	public boolean createEvent(String date, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showAllDate() {
		// TODO Auto-generated method stub
		
	}

}
