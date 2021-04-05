
public class Schedule {
	int StartTime;
	int TimeRequired;
	String ScheduleName; 
	
	public Schedule() {	
	}
	
	public Schedule(int StartTime, int TimeRequired, String ScheduleName) {
		this.StartTime = StartTime;
		this.TimeRequired = TimeRequired;
		this.ScheduleName = ScheduleName;
	}
	
	public void printinfo() {
		System.out.println("starttime : " + StartTime);
		System.out.println("Time required : " + TimeRequired);
		System.out.println("Schdlue Name : " + ScheduleName);
	}

}
