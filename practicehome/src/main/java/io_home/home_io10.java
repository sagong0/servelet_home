package io_home;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class home_io10 {

	public static void main(String[] args) {
		new data10().abc();
	}
}

class data10{
	
	public void abc() {
		String data = "abcde";
		byte[] b = data.getBytes();

		System.out.println(Arrays.toString(b));
		
		OutputStream os = System.out;
		try {
			os.write(b, 0 ,b.length);
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
