package io_home;

import java.io.FileWriter;
import java.util.Scanner;

public class home_io5 {

	public static void main(String[] args) {
		try {
			FileWriter fw = null;
			Scanner sc = null;
			
			fw = new FileWriter("D:\\project\\practicehome\\src\\main\\webapp\\data.txt", true);
			sc = new Scanner(System.in);
			
			
			for(int i = 0; i < 5; i++) {
				System.out.println("데이터에 추가할 이름을 입력해주세요.!");
				String name = sc.nextLine().intern();
				
				fw.write(name + "\n");
				
				if(name == "exit") {
					System.out.println("종료되었습니다.");
					break;
				}
			}
			
			sc.close();
			fw.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
