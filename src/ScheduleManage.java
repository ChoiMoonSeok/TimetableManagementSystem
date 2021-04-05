import java.util.Scanner;

public class ScheduleManage {
	
	Schedule Schedule; // class 호출
	Scanner input;
	
	ScheduleManage (Scanner input){
		this.input = input;
	}
	
	public void AddSchedule() {
		Schedule = new Schedule();
		
		System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
		Schedule.StartTime = input.nextInt();
		System.out.println(Schedule.StartTime);

		System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
		Schedule.TimeRequired = input.nextInt();
		System.out.println(Schedule.TimeRequired);

		System.out.print("Enter a schedule name: "); // 일정 이름 설정
		Schedule.ScheduleName = input.next();
		System.out.println(Schedule.ScheduleName);
	}
	public void CompleteSchedule() {
		System.out.print("Enter a schedule name which is completed : "); // 완료한 일정 처리
		String complete_schedule = input.next(); 
		System.out.println(complete_schedule);
		if (Schedule == null) {
			System.out.println("Schedule does not exist.");
			return;
		}
		if (Schedule.ScheduleName != null) {
			CompleteSchedule CompleteSchedule = new CompleteSchedule(complete_schedule);
			Schedule = null;
			System.out.println("Completed schedule is moved to completed");
			System.out.println("Completed : " + CompleteSchedule.CompleteName());
		}

	}
	public void EditSchedule() {
		
		System.out.print("Enter a schedule name which you wanna change : "); // 변경할 일정 이름으로 찾기
		String edit_schedule_name = input.next();
		if (Schedule == null) {
			System.out.println("Schedule does not exist.");
			return;
		}
		System.out.println("start time : ");
		Schedule.StartTime = input.nextInt();
		System.out.println("required time : ");
		Schedule.TimeRequired = input.nextInt();
		System.out.println(edit_schedule_name + " " + Schedule.StartTime + " " + Schedule.TimeRequired);
		// 아직 일정을 저장하는 기능이 구성되지 않았으므로 3번은 완성하지 못함.
		//차후에 데이터를 저장하는 기능을 추가한 후 코드를 추가할 것.

	}
	public void ViewSchedule() {
		String ScheduleName = input.next();
		if (Schedule.ScheduleName == ScheduleName) {
			Schedule.printinfo();
		}
		// 아직 일정을 추가하고 저장하는 코드는 없으므로 우선 비워둘 것 
//		for (int i = 0; i < 168; i++) {
//			System.out.println(); // 1번에서 추가한 일정 보여주기(추가된 순서대로)
	}
}
