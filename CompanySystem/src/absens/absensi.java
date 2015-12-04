package absens;
import java.util.ArrayList;

import people.Employee;

public class absensi {

String [] idEmployee = {"ID01","ID02","ID03","ID05","ID06"};
ArrayList <Employee> listAbsen = new ArrayList<Employee>();

public ArrayList<Employee> getListAbsen() {
	return listAbsen;
}

public void setListAbsen(ArrayList<Employee> listAbsen) {
	this.listAbsen = listAbsen;
}

public void addEmployee(Employee employee){
	listAbsen.add(employee);
}

public boolean checkEmployeeAbsence(Employee employee){
	
	return false;
}


}