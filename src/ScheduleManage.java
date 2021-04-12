import java.util.ArrayList;
import java.util.Scanner;
import Schedule.Schedule;
import Schedule.ScheduleWeekday;

public class ScheduleManage {
	
	ArrayList<Schedule> Schedules = new ArrayList<Schedule>(); // class 호출
	ArrayList<CompleteSchedule> CompleteSchedules = new ArrayList<CompleteSchedule>();
	
	Scanner input;
	
	ScheduleManage (Scanner input){
		this.input = input;
	}
	
	public void AddSchedule() {
		int number = 0;
		Schedule Schedule;
		while (number < 1 || number > 7) {
		System.out.println("Select a Weekday between 1 ~ 7");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.println("enter a nuber to choose");
		number = input.nextInt();
		}
		
		if (number == 1) {
			System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
			int StartTimeH = input.nextInt();
			System.out.println(StartTimeH);
			
			System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
			int StartTimeM = input.nextInt();
			System.out.println(StartTimeM);

			System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
			int TimeRequired = input.nextInt();
			System.out.println(TimeRequired);

			System.out.print("Enter a schedule name: "); // 일정 이름 설정
			String ScheduleName = input.next();
			System.out.println(ScheduleName);
			
			Schedule = new Schedule(StartTimeH, StartTimeM, TimeRequired, ScheduleName);
			Schedule.setWeekday(ScheduleWeekday.Monday);
			Schedules.add(Schedule);
		}
		else if (number == 2) {
			System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
			int StartTimeH = input.nextInt();
			System.out.println(StartTimeH);
			
			System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
			int StartTimeM = input.nextInt();
			System.out.println(StartTimeM);

			System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
			int TimeRequired = input.nextInt();
			System.out.println(TimeRequired);

			System.out.print("Enter a schedule name: "); // 일정 이름 설정
			String ScheduleName = input.next();
			System.out.println(ScheduleName);
			
			Schedule = new Schedule(StartTimeH, StartTimeM, TimeRequired, ScheduleName);
			Schedule.setWeekday(ScheduleWeekday.Tuesday);
			Schedules.add(Schedule);
			
		}
		else if (number == 3) {
			System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
			int StartTimeH = input.nextInt();
			System.out.println(StartTimeH);
			
			System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
			int StartTimeM = input.nextInt();
			System.out.println(StartTimeM);

			System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
			int TimeRequired = input.nextInt();
			System.out.println(TimeRequired);

			System.out.print("Enter a schedule name: "); // 일정 이름 설정
			String ScheduleName = input.next();
			System.out.println(ScheduleName);
			
			Schedule = new Schedule(StartTimeH, StartTimeM, TimeRequired, ScheduleName);
			Schedule.setWeekday(ScheduleWeekday.Wednesday);
			Schedules.add(Schedule);
			
		}
		else if (number == 4) {
			System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
			int StartTimeH = input.nextInt();
			System.out.println(StartTimeH);
			
			System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
			int StartTimeM = input.nextInt();
			System.out.println(StartTimeM);

			System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
			int TimeRequired = input.nextInt();
			System.out.println(TimeRequired);

			System.out.print("Enter a schedule name: "); // 일정 이름 설정
			String ScheduleName = input.next();
			System.out.println(ScheduleName);
			
			Schedule = new Schedule(StartTimeH, StartTimeM, TimeRequired, ScheduleName);
			Schedule.setWeekday(ScheduleWeekday.Thursday);
			Schedules.add(Schedule);
			
		}
		else if (number == 5) {
			System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
			int StartTimeH = input.nextInt();
			System.out.println(StartTimeH);
			
			System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
			int StartTimeM = input.nextInt();
			System.out.println(StartTimeM);

			System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
			int TimeRequired = input.nextInt();
			System.out.println(TimeRequired);

			System.out.print("Enter a schedule name: "); // 일정 이름 설정
			String ScheduleName = input.next();
			System.out.println(ScheduleName);
			
			Schedule = new Schedule(StartTimeH, StartTimeM, TimeRequired, ScheduleName);
			Schedule.setWeekday(ScheduleWeekday.Friday);
			Schedules.add(Schedule);
		}
		else if (number == 6) {
			System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
			int StartTimeH = input.nextInt();
			System.out.println(StartTimeH);
			
			System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
			int StartTimeM = input.nextInt();
			System.out.println(StartTimeM);

			System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
			int TimeRequired = input.nextInt();
			System.out.println(TimeRequired);

			System.out.print("Enter a schedule name: "); // 일정 이름 설정
			String ScheduleName = input.next();
			System.out.println(ScheduleName);
			
			Schedule = new Schedule(StartTimeH, StartTimeM, TimeRequired, ScheduleName);
			Schedule.setWeekday(ScheduleWeekday.Saturday);
			Schedules.add(Schedule);
		}
		else if (number == 7) {
			System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
			int StartTimeH = input.nextInt();
			System.out.println(StartTimeH);
			
			System.out.print("Enter a Start time(Minute) : "); // 일정 시작 시간 설정
			int StartTimeM = input.nextInt();
			System.out.println(StartTimeM);

			System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
			int TimeRequired = input.nextInt();
			System.out.println(TimeRequired);

			System.out.print("Enter a schedule name: "); // 일정 이름 설정
			String ScheduleName = input.next();
			System.out.println(ScheduleName);
			
			Schedule = new Schedule(StartTimeH, StartTimeM, TimeRequired, ScheduleName);
			Schedule.setWeekday(ScheduleWeekday.Sunday);
			Schedules.add(Schedule);
		}
		
		
	}
	
	
	public void CompleteSchedule() {
		System.out.print("Enter a schedule name which is completed : "); // 완료한 일정 처리
		String complete_schedule = input.next(); 
		
		int index = 0;
		
		for (int i = 0; i < Schedules.size(); i++) {
			CompleteSchedule completeschedule = new CompleteSchedule();
			
			if (Schedules.get(i).getScheduleName() == complete_schedule) {
				String a = Schedules.get(i).getScheduleName();
				int b = Schedules.get(i).getStartTimeH();
				int d = Schedules.get(i).getStartTimeM();
				int c = Schedules.get(i).getTimeRequired();
				completeschedule.setCompleteScheduleName(a);
				completeschedule.setStartTimeH(b);
				completeschedule.setStartTimeM(d);
				completeschedule.setTimeRequired(c);
				completeschedule.setWeekday(Schedules.get(i).getWeekday());
				completeschedule.printinfo();
				CompleteSchedules.add(completeschedule);
				index = i;
				break;
				}
			
			}
		
		if (index >= 0) {
			
			Schedules.remove(index);
			System.out.println("Completed schedule is moved to completed");	
		}
		
		else {
			System.out.println(complete_schedule + " doesn't exist.");
		}
		
		System.out.println(CompleteSchedules.get(CompleteSchedules.size()).getCompleteScheduleName());
	}
		
		
	public void CheckCompleted() {
		System.out.print(1);
		for (int i = 0; i < CompleteSchedules.size() - 1; i++) {
			System.out.print(i);
			System.out.println(CompleteSchedules.get(i).getScheduleName() + " " + CompleteSchedules.get(i).getWeekday() + " " + CompleteSchedules.get(i).getStartTimeH() + ":" + CompleteSchedules.get(i).getStartTimeM() + " " + CompleteSchedules.get(i).getTimeRequired());
				}
		}

	
	public void EditSchedule() {
		
		System.out.print("Enter a schedule name which you wanna change : "); // 변경할 일정 이름으로 찾기
		String edit_schedule_name = input.next();
		int index = 0;
		for (int i = 0; i < Schedules.size(); i++) {
			
			if (Schedules.get(i).getScheduleName() == edit_schedule_name) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			Schedule schedule = new Schedule();
			System.out.print("Schedule Name : ");
			String ScheduleName = input.next();
			schedule.setScheduleName(ScheduleName); 
			System.out.print("start time(Hour) : ");
			int StartTimeH = input.nextInt();
			schedule.setStartTimeH(StartTimeH);
			System.out.print("start time(Minute) : ");
			int StartTimeM = input.nextInt();
			schedule.setStartTimeM(StartTimeM);
			System.out.print("required time : ");
			int TimeRequired = input.nextInt();
			schedule.setTimeRequired(TimeRequired);
			System.out.print("Weekday number : ");
			int weekday = input.nextInt();
			if (weekday == 1) {
				schedule.setWeekday(ScheduleWeekday.Monday);
			}
			else if (weekday == 2) {
				schedule.setWeekday(ScheduleWeekday.Tuesday);
			}
			else if (weekday == 3) {
				schedule.setWeekday(ScheduleWeekday.Wednesday);
			}
			else if (weekday == 4) {
				schedule.setWeekday(ScheduleWeekday.Thursday);
			}
			else if (weekday == 5) {
				schedule.setWeekday(ScheduleWeekday.Friday);
			}
			else if (weekday == 6) {
				schedule.setWeekday(ScheduleWeekday.Saturday);
			}
			else if (weekday == 7) {
				schedule.setWeekday(ScheduleWeekday.Sunday);
			}
			Schedules.set(index, schedule);
			
			System.out.println(edit_schedule_name + " " + Schedules.get(index).getWeekday() + " " + Schedules.get(index).getStartTimeH() + ":" + Schedules.get(index).getStartTimeM() + " " + Schedules.get(index).getTimeRequired());
		}
		else {
		
			System.out.println("Schedule " + edit_schedule_name + " does not exist.");
		
		}

	}
	
	public void ViewSchedule() {
//		String ScheduleName = input.next();
//		if (Schedule.ScheduleName == ScheduleName) {
//			Schedule.printinfo();
//		}
		// 아직 일정을 추가하고 저장하는 코드는 없으므로 우선 비워둘 것 
		
		System.out.println("Number of Schedules : " + Schedules.size());
		
		for (int i = 0; i < Schedules.size(); i++) {
			Schedules.get(i).printinfo(); // 1번에서 추가한 일정 보여주기(추가된 순서대로)
		}
	}
}
