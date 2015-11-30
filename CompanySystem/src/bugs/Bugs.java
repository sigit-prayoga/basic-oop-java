package bugs;

public class Bugs {
	private String id_Bugs;
	private int priority;
	
	public Bugs(String id, int priority){
		this.id_Bugs = id;
		this.priority = priority;
	}
	
	public String getId_Bugs() {
		return id_Bugs;
	}
	
	public void setId_Bugs(String id_Bugs) {
		this.id_Bugs = id_Bugs;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int getScore(int priority){
		if(priority == 5){
			return 1;
		}
		if(priority == 4){
			return 2;
		}
		if(priority == 3){
			return 3;
		}
		if(priority == 2){
			return 4;
		}
		else {
			return 5;
		}
	}

}
