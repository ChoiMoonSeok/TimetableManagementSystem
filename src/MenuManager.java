import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ScheduleManage ScheduleManage = new ScheduleManage(input);
		
		int num = 0;
		
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
				ScheduleManage.AddSchedule();

				break;

			case 2:
				ScheduleManage.CompleteSchedule();
				
				break;

			case 3:
				ScheduleManage.EditSchedule();
				break;

			case 4:
				ScheduleManage.ViewSchedule();
				}
			}
		}
}

