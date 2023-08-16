package io_home;

import java.io.OutputStream;
import java.util.Arrays;

public class home_io9 {

	public static void main(String[] args) {
		try {
//			InputStream is = System.in;
//			int code = is.read();
//			System.out.println(code);
			
			String a = "123456789";
			byte[] b = a.getBytes();
			System.out.println(Arrays.toString(b));
			
			OutputStream os = System.out;
			os.write(b);
			os.flush();
			os.close();
			
		}catch(Exception e) {
			System.out.println("err");
		}
	}

}
