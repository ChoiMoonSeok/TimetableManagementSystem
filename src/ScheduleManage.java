import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.HourFormatException;
import Exception.MinuteFormatException;
import Exception.OneOrTwoException;
import Schedule.CompleteSchedule;
import Schedule.Schedule;
import Schedule.ScheduleInput;
import Schedule.ScheduleWeekday;

public class ScheduleManage {
	
	ArrayList<ScheduleInput> Schedules = new ArrayList<ScheduleInput>(); // class 호출, 인터페이스로 변경
	ArrayList<CompleteSchedule> CompleteSchedules = new ArrayList<CompleteSchedule>();
	
	Scanner input;
	
	ScheduleManage (Scanner input){
		this.input = input;
	}
	
	public void AddSchedule() throws HourFormatException, MinuteFormatException {
		int number = 0;
		ScheduleInput Schedule = new Schedule(); // ScheduleInput으로 변경
		while (number < 1 || number > 7) {
			try {
				Schedule.ChooseWeekday();
				number = input.nextInt();
		
				switch (number) {
			
				case 1:
		
					Schedule.SetStartTimeHour(input);
					Schedule.SetStartTimeMinute(input);
					Schedule.SetRequiredTime(input);
					Schedule.SetScheduleName(input);
					Schedule.setWeekday(ScheduleWeekday.Monday);
					Schedules.add(Schedule);
					break;
				case 2:
				
					Schedule.SetStartTimeHour(input);
					Schedule.SetStartTimeMinute(input);
					Schedule.SetRequiredTime(input);
					Schedule.SetScheduleName(input);
					Schedule.setWeekday(ScheduleWeekday.Tuesday);
					Schedules.add(Schedule);
			
					break;
				case 3:
				
					Schedule.SetStartTimeHour(input);
					Schedule.SetStartTimeMinute(input);
					Schedule.SetRequiredTime(input);
					Schedule.SetScheduleName(input);
					Schedule.setWeekday(ScheduleWeekday.Wednesday);
					Schedules.add(Schedule);
					break;
				case 4:
					
					Schedule.SetStartTimeHour(input);
					Schedule.SetStartTimeMinute(input);
					Schedule.SetRequiredTime(input);
					Schedule.SetScheduleName(input);
					Schedule.setWeekday(ScheduleWeekday.Thursday);
					Schedules.add(Schedule);
			
					break;
				case 5:
					
					Schedule.SetStartTimeHour(input);
					Schedule.SetStartTimeMinute(input);
					Schedule.SetRequiredTime(input);
					Schedule.SetScheduleName(input);
					Schedule.setWeekday(ScheduleWeekday.Friday);
					Schedules.add(Schedule);
					break;
				case 6:
					
					Schedule.SetStartTimeHour(input);
					Schedule.SetStartTimeMinute(input);
					Schedule.SetRequiredTime(input);
					Schedule.SetScheduleName(input);
					Schedule.setWeekday(ScheduleWeekday.Saturday);
					Schedules.add(Schedule);
					break;
				case 7:
				
					Schedule.SetStartTimeHour(input);
					Schedule.SetStartTimeMinute(input);
					Schedule.SetRequiredTime(input);
					Schedule.SetScheduleName(input);
					Schedule.setWeekday(ScheduleWeekday.Sunday);
					Schedules.add(Schedule);
					break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Put a number(1~7)");
				if (input.hasNext()) {
					input.next();
				}
				number = -1;
			}
			catch(HourFormatException e) {
				System.out.println("Put a number(0~24)");
				if (input.hasNext()) {
					input.next();
				}
				number = -1;
			}
			catch(MinuteFormatException e) {
				System.out.println("Put a number(0~60)");
				if (input.hasNext()) {
					input.next();
				}
				number = -1;
			}
		}
	}
	
	
	
	public void CompleteSchedule() throws HourFormatException, MinuteFormatException{
		System.out.print("Enter a schedule name which is completed : "); // 완료한 일정 처리
		int index = FindSchedule(input);
		System.out.println(index);
		System.out.println("enter a cleared date.");
		String cleared_date = input.nextLine(); // 일정을 완료한 날짜 입력
			
		
		if (index >= 0) {
			
			CompleteSchedule a = new CompleteSchedule();
			a.setStartTimeH(Schedules.get(index).getStartTimeH());
			a.setStartTimeM(Schedules.get(index).getStartTimeM());
			a.setScheduleName(Schedules.get(index).getScheduleName());
			a.setTimeRequired(Schedules.get(index).getTimeRequired());
			a.setCleared_date(cleared_date);
			a.printinfo();
			Schedules.remove(index);
			System.out.println("Completed schedule is moved to completed");	
			CompleteSchedules.get(CompleteSchedules.size());
			
//			System.out.println(CompleteSchedules.get(CompleteSchedules.size() - 1).getCompleteScheduleName());
		}
		
		else {
			System.out.println("Schedule" + " doesn't exist.");
		}
		
		
	}
		
		
	public void CheckCompleted() {
		for (int i = 0; i < CompleteSchedules.size() - 1; i++) {
			System.out.print(i);
			System.out.printf("%s %s %d %d %d", CompleteSchedules.get(i).getScheduleName(), CompleteSchedules.get(i).getWeekday(), CompleteSchedules.get(i).getStartTimeH(), CompleteSchedules.get(i).getStartTimeM(), CompleteSchedules.get(i).getTimeRequired());
				}
		}

	
	public void EditSchedule() throws MinuteFormatException, HourFormatException, OneOrTwoException {
		int ans = 0;
		do {
			try {
					System.out.print("Delete or edit?(delete : 1 or edit : 2) :");
					ans = OneOrTwo(input);
				}
				catch(OneOrTwoException e) {
					System.out.println("Please enter a number 1 or 2");
					ans = 0;
				}
			}while (ans == 0);
		
		if (ans == 2) { // 편집 기능
			System.out.print("Enter a schedule name which you wanna change : "); // 변경할 일정 이름으로 찾기
			int index = FindSchedule(input);
			if (index >= 0) {
				Schedule schedule = new Schedule();
				schedule.SetStartTimeHour(input);
				schedule.SetStartTimeMinute(input);
				schedule.SetRequiredTime(input);
				schedule.SetScheduleName(input);
				System.out.print("Weekday number : ");
				int weekday = input.nextInt();
				switch (weekday) {
					case 1:
						schedule.setWeekday(ScheduleWeekday.Monday);
						break;
			
					case 2: 
						schedule.setWeekday(ScheduleWeekday.Tuesday);
						break;
					case 3:
						schedule.setWeekday(ScheduleWeekday.Wednesday);
						break;
					case 4:
						schedule.setWeekday(ScheduleWeekday.Thursday);
						break;
					case 5:
						schedule.setWeekday(ScheduleWeekday.Friday);
						break;
					case 6:
						schedule.setWeekday(ScheduleWeekday.Saturday);
						break;
					case 7:
						schedule.setWeekday(ScheduleWeekday.Sunday);
						break;
				}
				Schedules.set(index, schedule);
			
				System.out.println(Schedules.get(index).getScheduleName() + " " + Schedules.get(index).getWeekday() + " " + Schedules.get(index).getStartTimeH() + ":" + Schedules.get(index).getStartTimeM() + " " + Schedules.get(index).getTimeRequired());
			}
			else {
		
				System.out.println("Schedule " + "does not exist.");
		
			}
		}
		else if (ans == 1) { // 삭제 기능
			System.out.print("Enter a schedule name which you wanna delete : "); // 변경할 일정 이름으로 찾기
			int index = FindSchedule(input);
			Schedules.remove(index);
		}

	}
	
	public void ViewSchedule() {
		
		System.out.println("Number of Schedules : " + Schedules.size());
		
		for (int i = 0; i < Schedules.size(); i++) {
			Schedules.get(i).printinfo(); // 1번에서 추가한 일정 보여주기(추가된 순서대로)
		}
	}
	
	public int FindSchedule(Scanner input) {
		String name = input.next();
		int index = -90;
		for (int i = 0; i < Schedules.size(); i++) {
			index = 1;
			if (Schedules.get(i).getScheduleName() == name) {	
				index = i;
				break;
			}
		}
		return index - 1;
	}
	public int OneOrTwo(Scanner input) throws OneOrTwoException {
		int ans;
		ans = input.nextInt();
		if (!((ans == 1) || (ans == 2))) {
			throw new OneOrTwoException();
		}
		return ans;
	}
}
