import java.util.ArrayList;
import java.util.Scanner;

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
	
	public void AddSchedule() {
		int number = 0;
		ScheduleInput Schedule; // ScheduleInput으로 변경
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
		
		int index = -1;
		
		for (int i = 0; i < Schedules.size(); i++) {
			ScheduleInput a = Schedules.get(i);
			String a_name = a.getScheduleName();
			
			if (a_name == complete_schedule) { //이유는 모르겠으나 if문에 진입이 되지 않음. 코드가 틀렸다고 보기에는 다른 메소드에선 같은 코드가 이상없이 실행됨.
				System.out.println(i);
				index = i;
				break;
			}
		}
		System.out.println("enter a cleared date.");
		String cleared_date = input.nextLine(); // 일정을 완료한 날짜 입력
		CompleteSchedule a = new CompleteSchedule();
		a = (CompleteSchedule) Schedules.get(index);
		a.setCleared_date(cleared_date);
			
		
		if (index >= 0) {
			
			Schedules.remove(index);
			System.out.println("Completed schedule is moved to completed");	
			CompleteSchedules.get(CompleteSchedules.size());
//			System.out.println(CompleteSchedules.get(CompleteSchedules.size() - 1).getCompleteScheduleName());
		}
		
		else {
			System.out.println(complete_schedule + " doesn't exist.");
		}
		
		
	}
		
		
	public void CheckCompleted() {
		for (int i = 0; i < CompleteSchedules.size() - 1; i++) {
			System.out.print(i);
			System.out.printf("%s %s %d %d %d", CompleteSchedules.get(i).getScheduleName(), CompleteSchedules.get(i).getWeekday(), CompleteSchedules.get(i).getStartTimeH(), CompleteSchedules.get(i).getStartTimeM(), CompleteSchedules.get(i).getTimeRequired());
				}
		}

	
	public void EditSchedule() {
		
		System.out.print("Delete or edit?(delete : 1 or edit : 2) :"); // 삭제 기능 추가
		int ans = input.nextInt(); 
		if (ans == 2) { // 편집 기능
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
			
				System.out.println(ScheduleName + " " + Schedules.get(index).getWeekday() + " " + Schedules.get(index).getStartTimeH() + ":" + Schedules.get(index).getStartTimeM() + " " + Schedules.get(index).getTimeRequired());
			}
			else {
		
				System.out.println("Schedule " + edit_schedule_name + " does not exist.");
		
			}
		}
		else if (ans == 1) { // 삭제 기능
			System.out.print("Enter a schedule name which you wanna delete : "); // 변경할 일정 이름으로 찾기
			String delete_schedule_name = input.next();
			
			int delete_index;
			for (int i = 0; i < Schedules.size(); i++) {
				if (Schedules.get(i).getScheduleName() == delete_schedule_name) {
					delete_index = i;
					Schedules.remove(delete_index);
					break; 
				}
			}
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
