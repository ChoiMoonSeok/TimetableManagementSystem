package Schedule;

import java.util.Scanner;

import Exception.HourFormatException;
import Exception.MinuteFormatException;

public interface ScheduleInput {
	public ScheduleWeekday getWeekday();
	public void setWeekday(ScheduleWeekday weekday);
	public int getStartTimeH();
	public void setStartTimeH(int startTimeH) throws HourFormatException;
	public int getTimeRequired();
	public void setTimeRequired(int timeRequired);
	public String getScheduleName();
	public void setScheduleName(String scheduleName);
	public int getStartTimeM();
	public void setStartTimeM(int startTimeM) throws MinuteFormatException;
	public void printinfo();
	public void SetStartTimeHour(Scanner input) throws HourFormatException;
	public void SetStartTimeMinute(Scanner input) throws MinuteFormatException;
	public void SetRequiredTime(Scanner input);
	public void SetScheduleName(Scanner input);
	public void ChooseWeekday();
}
