package io_home;

import java.io.FileReader;

public class home_io1 {

	public static void main(String[] args) {
		abc a = new abc();
		try{
			a.aa();
		}catch(Exception e) {
			System.out.println("error");
		}
	}

}

class abc{
	/**/
	public void aa() throws Exception {
		FileReader fr = new FileReader("D:\\project\\practicehome\\src\\main\\webapp\\data.txt");
		System.out.println(fr.read());
		
		fr.close();
	}
}