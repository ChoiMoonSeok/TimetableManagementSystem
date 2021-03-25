import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<String> ScheduleName = new ArrayList<String>();//일정 이름 추가

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
		System.out.print("Enter a Start time(Hour) : "); // 일정 시작 시간 설정
		start_time = start_time_input.nextInt();
		System.out.println(start_time);

		int time_required = 0;
		Scanner require_time_input = new Scanner(System.in);
		System.out.print("Enter a required time(Minutes) : "); // 소요시간 설정
		time_required = require_time_input.nextInt();
		System.out.println(time_required);

		Scanner schedule_name_input = new Scanner(System.in);
		System.out.print("Enter a schedule name: "); // 일정 이름 설정
		String schedule_name = schedule_name_input.nextLine();
		System.out.println(schedule_name);
	}
	public static void CompleteSchedule() {
		System.out.print("Enter a schedule name which is completed : "); // 완료한 일정 처리
		Scanner complete_schedule_input = new Scanner(System.in);
		String complete_schedule = complete_schedule_input.nextLine(); 
		System.out.println(complete_schedule);

	}
	public static void EditSchedule() {
		System.out.print("Enter a schedule name which you wanna change : "); // 변경할 일정 이름으로 찾기
		Scanner edit_schedule_name_input = new Scanner(System.in);
		String edit_schedule_name = edit_schedule_name_input.nextLine();
		System.out.println(edit_schedule_name);
		// 아직 일정을 저장하는 기능이 구성되지 않았으므로 3번은 완성하지 못함.
		//차후에 데이터를 저장하는 기능을 추가한 후 코드를 추가할 것.

	}
	public static void ViewSchedule() {
		// 아직 일정을 추가하고 저장하는 코드는 없으므로 우선 비워둘 것 
//		for (int i = 0; i < 168; i++) {
//			System.out.println(); // 1번에서 추가한 일정 보여주기(추가된 순서대로)
	}
	}

}
