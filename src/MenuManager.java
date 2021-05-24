import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.HourFormatException;
import Exception.MinuteFormatException;
import Exception.OneOrTwoException;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) throws MinuteFormatException, HourFormatException, OneOrTwoException {
		
		Scanner input = new Scanner(System.in);
		ScheduleManage ScheduleManage = getObject("ScheduleManage.ser");
		if (ScheduleManage == null) {
			ScheduleManage = new ScheduleManage(input);
		}
		SelectMenu(input, ScheduleManage);
		putObject(ScheduleManage, "ScheduleManage.ser");
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
						logger.log("add schedule");
						break;

					case 2:
						ScheduleManage.CompleteSchedule();
						logger.log("complete schedule");
						break;
				
					case 3:
						ScheduleManage.CheckCompleted();
						logger.log("check complete schedule");
						break;

					case 4:
						ScheduleManage.EditSchedule();
						logger.log("edit or delete schedule");
						break;

					case 5:
						ScheduleManage.ViewSchedule();
						logger.log("view schedule");
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
	
	public static ScheduleManage getObject(String filename) {
		ScheduleManage ScheduleManage = null;
		FileInputStream file;
		try{
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			ScheduleManage = (ScheduleManage) in.readObject();
			
			in.close();
			file.close();
			
		}catch(FileNotFoundException e) {
			return ScheduleManage;
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ScheduleManage;
	}
	
	public static ScheduleManage putObject(ScheduleManage ScheduleManage, String filename) {
		
		try{
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(ScheduleManage);
			
			out.close();
			file.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return ScheduleManage;
	}
}



