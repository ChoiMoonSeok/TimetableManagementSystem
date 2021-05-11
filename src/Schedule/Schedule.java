package Schedule;

public class Schedule implements ScheduleInput{// ScheduleInput¿ª √ﬂ∞°
	
	protected ScheduleWeekday Weekday;
	protected int StartTimeH;
	protected int TimeRequired;
	protected String ScheduleName; 
	protected int StartTimeM;

	public ScheduleWeekday getWeekday() {
		return Weekday;
	}

	public void setWeekday(ScheduleWeekday weekday) {
		Weekday = weekday;
	}

	public int getStartTimeH() {
		return StartTimeH;
	}

	public void setStartTimeH(int startTimeH) {
		StartTimeH = startTimeH;
	}

	public int getTimeRequired() {
		return TimeRequired;
	}

	public void setTimeRequired(int timeRequired) {
		TimeRequired = timeRequired;
	}

	public String getScheduleName() {
		return ScheduleName;
	}

	public void setScheduleName(String scheduleName) {
		ScheduleName = scheduleName;
	}

	public int getStartTimeM() {
		return StartTimeM;
	}

	public void setStartTimeM(int startTimeM) {
		StartTimeM = startTimeM;
	}

	
	public Schedule() {	
	}
	
	public Schedule(int StartTimeH, int StartTimeM, int TimeRequired, String ScheduleName) {
		this.StartTimeH = StartTimeH;
		this.StartTimeM = StartTimeM;
		this.TimeRequired = TimeRequired;
		this.ScheduleName = ScheduleName;
	}
	
	public void printinfo() {
		System.out.println("Weekday : " + Weekday);
		System.out.println("starttime : " + StartTimeH + ":" + StartTimeM);
		System.out.println("Time required : " + TimeRequired);
		System.out.println("Schedule Name : " + ScheduleName);
	}

}