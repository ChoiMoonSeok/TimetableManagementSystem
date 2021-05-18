package Schedule;
public class CompleteSchedule extends Schedule{ // ScheduleInput을 추가
	
	
	protected String cleared_date; // 일정을 완료한 날짜 변수 추가
//	protected ScheduleWeekday Weekday;
//	protected String CompleteScheduleName;
//	protected int StartTimeH;
//	protected int TimeRequired;
//	protected int StartTimeM;
//	
//	public ScheduleWeekday getWeekday() {
//		return Weekday;
//	}
//
//	public void setWeekday(ScheduleWeekday weekday) {
//		Weekday = weekday;
//	}
//
//	public String getCompleteScheduleName() {
//		return CompleteScheduleName;
//	}
//
//	public void setCompleteScheduleName(String completeScheduleName) {
//		CompleteScheduleName = completeScheduleName;
//	}
//
//	public int getStartTimeH() {
//		return StartTimeH;
//	}
//
//	public void setStartTimeH(int startTimeH) {
//		StartTimeH = startTimeH;
//	}
//
//	public int getTimeRequired() {
//		return TimeRequired;
//	}
//
//	public void setTimeRequired(int timeRequired) {
//		TimeRequired = timeRequired;
//	}
//
//	public int getStartTimeM() {
//		return StartTimeM;
//	}
//
//	public void setStartTimeM(int startTimeM) {
//		StartTimeM = startTimeM;
//	}
	
	public String getCleared_date() {
		return cleared_date;
	}

	public void setCleared_date(String cleared_date) {
		this.cleared_date = cleared_date;
	}

	public CompleteSchedule() {
		
	}
	
	public CompleteSchedule(String CompleteScheduleName, int StartTimeH, int StartTimeM, int TimeRequired, ScheduleWeekday weekday, String cleared_date) {
		this.ScheduleName = CompleteScheduleName;
		this.StartTimeH = StartTimeH;
		this.StartTimeM = StartTimeM;
		this.TimeRequired = TimeRequired;
		this.Weekday = weekday;
		this.cleared_date = cleared_date;
	}
	
	public void printinfo() {
		System.out.println(Weekday);
		System.out.println(ScheduleName);
		System.out.println(StartTimeH + ":" + StartTimeM);
		System.out.println(TimeRequired);
		System.out.println(cleared_date);
	}
//	public String CompleteName() {
//		return this.ScheduleName;
//	}

}
