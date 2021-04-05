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
			System.out.println("2. Complete schedule"); // 완료한 일정 
			System.out.println("3. Edit/Delete schedule"); // 수정할 일정 선택
			System.out.println("4. View schedule"); // 모든 일정 보여주기
			System.out.println("5. Exit"); // 종료

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

