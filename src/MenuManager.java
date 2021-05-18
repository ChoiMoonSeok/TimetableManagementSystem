import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.HourFormatException;
import Exception.MinuteFormatException;
import Exception.OneOrTwoException;

public class MenuManager {

	public static void main(String[] args) throws MinuteFormatException, HourFormatException, OneOrTwoException {
		
		Scanner input = new Scanner(System.in);
		ScheduleManage ScheduleManage = new ScheduleManage(input);

		SelectMenu(input, ScheduleManage);
	}
	
	public static void SelectMenu(Scanner input, ScheduleManage ScheduleManage) throws MinuteFormatException, HourFormatException, OneOrTwoException {
		int num = -1;
		
			while(num != 6){
				try {
				ShowMenu();

				num = input.nextInt();

				switch(num) {
					case 1:
						ScheduleManage.AddSchedule();

						break;

					case 2:
						ScheduleManage.CompleteSchedule();
				
						break;
				
					case 3:
						ScheduleManage.CheckCompleted();
						break;

					case 4:
						ScheduleManage.EditSchedule();
						break;

					case 5:
						ScheduleManage.ViewSchedule();
					default:
						continue;
					}
				}
				catch(InputMismatchException e) {
					System.out.println("Put a number(1~6)");
					if (input.hasNext()) {
						input.next();
					}
					num = -1;
				}
			}
	}
	
	public static void ShowMenu() {
		System.out.println("//schedule management\\\\");
		System.out.println("1. Add schedule"); // add schedule
		System.out.println("2. Complete schedule"); // 완료한 일정
		System.out.println("3. Check complete schedules");
		System.out.println("4. Edit/Delete schedule"); // 수정할 일정 선택
		System.out.println("5. View schedules"); // 모든 일정 보여주기
		System.out.println("6. Exit"); // 종료

		System.out.print("Select a number to use :");
	}
}



