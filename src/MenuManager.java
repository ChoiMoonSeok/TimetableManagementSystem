import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<String> ScheduleName = new ArrayList<String>();//���� �̸� �߰�

		while(num != 5){
			System.out.println("//schedule management\\\\");
			System.out.println("1. Add schedule"); // add schedule
			System.out.println("2. Complete schedule"); // �Ϸ��� ���� 
			System.out.println("3. Edit/Delete schedule"); // ������ ���� ����
			System.out.println("4. View schedule"); // ��� ���� �����ֱ�
			System.out.println("5. Exit"); // ����

			System.out.print("Select a number to use :");

			num = input.nextInt();

			switch(num) {
			case 1:
				AddSchedule();

				break;

			case 2:
				CompleteSchedule();
				
				break;

			case 3:
				EditSchedule();
				break;

			case 4:
				ViewSchedule();
				}

			}
		}
	public static void AddSchedule() {
		int start_time = 0;
		Scanner start_time_input = new Scanner(System.in);
		System.out.print("Enter a Start time(Hour) : "); // ���� ���� �ð� ����
		start_time = start_time_input.nextInt();
		System.out.println(start_time);

		int time_required = 0;
		Scanner require_time_input = new Scanner(System.in);
		System.out.print("Enter a required time(Minutes) : "); // �ҿ�ð� ����
		time_required = require_time_input.nextInt();
		System.out.println(time_required);

		Scanner schedule_name_input = new Scanner(System.in);
		System.out.print("Enter a schedule name: "); // ���� �̸� ����
		String schedule_name = schedule_name_input.nextLine();
		System.out.println(schedule_name);
	}
	public static void CompleteSchedule() {
		System.out.print("Enter a schedule name which is completed : "); // �Ϸ��� ���� ó��
		Scanner complete_schedule_input = new Scanner(System.in);
		String complete_schedule = complete_schedule_input.nextLine(); 
		System.out.println(complete_schedule);

	}
	public static void EditSchedule() {
		System.out.print("Enter a schedule name which you wanna change : "); // ������ ���� �̸����� ã��
		Scanner edit_schedule_name_input = new Scanner(System.in);
		String edit_schedule_name = edit_schedule_name_input.nextLine();
		System.out.println(edit_schedule_name);
		// ���� ������ �����ϴ� ����� �������� �ʾ����Ƿ� 3���� �ϼ����� ����.
		//���Ŀ� �����͸� �����ϴ� ����� �߰��� �� �ڵ带 �߰��� ��.

	}
	public static void ViewSchedule() {
		// ���� ������ �߰��ϰ� �����ϴ� �ڵ�� �����Ƿ� �켱 ����� �� 
//		for (int i = 0; i < 168; i++) {
//			System.out.println(); // 1������ �߰��� ���� �����ֱ�(�߰��� �������)
	}
	}

}
