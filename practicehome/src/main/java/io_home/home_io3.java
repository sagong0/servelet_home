package io_home;

import java.io.FileReader;
import java.io.IOException;

public class home_io3 {
	public static void main(String[] args) {
		
		
		data3 a = new data3();
		try {
			String url = "D:\\project\\practicehome\\src\\main\\webapp\\2data.txt";
			a.abc(url);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("에러처리 발생");
		}
		finally {
			try {
				String url = "D:\\project\\practicehome\\src\\main\\webapp\\data.txt";
				a.abc(url);
			}catch(Exception e){
				System.out.println("두번째 트라이 캐치 에 러");
				System.exit(0);
			}finally {
				
			}
		}
	}
}

class data3 {
	FileReader fr = null;
	
	public void abc(String url) throws Exception, IOException{
		this.fr = new FileReader(url);
		
		System.out.println(this.fr.read());
		
		this.fr.close();
	}
}