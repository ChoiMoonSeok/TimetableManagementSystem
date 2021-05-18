package Schedule;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.HourFormatException;
import Exception.MinuteFormatException;

public class Schedule implements ScheduleInput{// ScheduleInput을 추가
	
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

	public void setStartTimeH(int startTimeH) throws HourFormatException {
		if (!((startTimeH >=0) && (startTimeH <= 24))) {
			throw new HourFormatException();		
		}
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

	public void setStartTimeM(int startTimeM) throws MinuteFormatException {
		if (!(startTimeM <= 60) && (startTimeM >= 0)) {
			throw new MinuteFormatException();		
		}
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
	
	public void SetStartTimeHour(Scanner input) throws HourFormatException {
		int StartTimeH = 0;
		do{
			try {
				System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
				StartTimeH = input.nextInt();
				System.out.println(StartTimeH);
				this.setStartTimeH(StartTimeH);
			}
				catch(HourFormatException e) {
					System.out.println("Please put a number between 0 and 24");
			}	
		}while((StartTimeH > 24) || (StartTimeH < 0));
	}
	
	public void SetStartTimeMinute(Scanner input) throws MinuteFormatException {
		do{
			try {
				System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
				StartTimeM = input.nextInt();
				System.out.println(StartTimeM);
				this.setStartTimeM(StartTimeM);
			}
				catch(MinuteFormatException e) {
					System.out.println("Please put a number between 0 and 60");
			}	
		}while((StartTimeM > 60) || (StartTimeM < 0));
	}

	public void SetRequiredTime(Scanner input) {
		System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
		int TimeRequired = input.nextInt();
		System.out.println(TimeRequired);
		this.setTimeRequired(TimeRequired);
	}

	public void SetScheduleName(Scanner input) {
		System.out.print("Enter a schedule name: "); // 일정 이름 설정
		String ScheduleName = input.next();
		System.out.println(ScheduleName);
		this.setScheduleName(ScheduleName);
	}
	public void ChooseWeekday() {
		System.out.println("Select a Weekday between 1 ~ 7");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.println("enter a nuber to choose");
	}

}