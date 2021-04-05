import java.util.Scanner;

public class ScheduleManage {
	
	Schedule Schedule; // class ȣ��
	Scanner input;
	
	ScheduleManage (Scanner input){
		this.input = input;
	}
	
	public void AddSchedule() {
		Schedule = new Schedule();
		
		System.out.print("Enter a Start time(Hour) : "); // ���� ���� �ð� ����
		Schedule.StartTime = input.nextInt();
		System.out.println(Schedule.StartTime);

		System.out.print("Enter a required time(Minutes) : "); // �ҿ�ð� ����
		Schedule.TimeRequired = input.nextInt();
		System.out.println(Schedule.TimeRequired);

		System.out.print("Enter a schedule name: "); // ���� �̸� ����
		Schedule.ScheduleName = input.next();
		System.out.println(Schedule.ScheduleName);
	}
	public void CompleteSchedule() {
		System.out.print("Enter a schedule name which is completed : "); // �Ϸ��� ���� ó��
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
		
		System.out.print("Enter a schedule name which you wanna change : "); // ������ ���� �̸����� ã��
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
		// ���� ������ �����ϴ� ����� �������� �ʾ����Ƿ� 3���� �ϼ����� ����.
		//���Ŀ� �����͸� �����ϴ� ����� �߰��� �� �ڵ带 �߰��� ��.

	}
	public void ViewSchedule() {
		String ScheduleName = input.next();
		if (Schedule.ScheduleName == ScheduleName) {
			Schedule.printinfo();
		}
		// ���� ������ �߰��ϰ� �����ϴ� �ڵ�� �����Ƿ� �켱 ����� �� 
//		for (int i = 0; i < 168; i++) {
//			System.out.println(); // 1������ �߰��� ���� �����ֱ�(�߰��� �������)
	}
}
