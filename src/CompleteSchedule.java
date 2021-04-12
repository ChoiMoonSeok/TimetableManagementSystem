import Schedule.Schedule;
import Schedule.ScheduleWeekday;

public class CompleteSchedule extends Schedule{
	
	protected ScheduleWeekday Weekday;
	protected String CompleteScheduleName;
	protected int StartTimeH;
	protected int TimeRequired;
	protected int StartTimeM;
	
	public ScheduleWeekday getWeekday() {
		return Weekday;
	}

	public void setWeekday(ScheduleWeekday weekday) {
		Weekday = weekday;
	}

	public String getCompleteScheduleName() {
		return CompleteScheduleName;
	}

	public void setCompleteScheduleName(String completeScheduleName) {
		CompleteScheduleName = completeScheduleName;
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

	public int getStartTimeM() {
		return StartTimeM;
	}

	public void setStartTimeM(int startTimeM) {
		StartTimeM = startTimeM;
	}
	
	public CompleteSchedule() {
		
	}
	
	public CompleteSchedule(String CompleteScheduleName, int StartTimeH, int StartTimeM, int TimeRequired) {
		this.CompleteScheduleName = CompleteScheduleName;
		this.StartTimeH = StartTimeH;
		this.StartTimeM = StartTimeM;
		this.TimeRequired = TimeRequired;
	}
	
	public void printinfo() {
		System.out.println(Weekday);
		System.out.println(CompleteScheduleName);
		System.out.println(StartTimeH + ":" + StartTimeM);
		System.out.println(TimeRequired);
	}
	public String CompleteName() {
		return this.CompleteScheduleName;
	}

}
