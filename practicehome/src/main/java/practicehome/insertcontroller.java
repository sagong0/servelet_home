package practicehome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class insertcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public insertcontroller() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] user = request.getParameterValues("user");
		ArrayList<String> userArr = new ArrayList<String>();
		
		int w = 0;	
		while(w < user.length) {
			if(user[w] != "") {
				userArr.add(user[w]);
			}
			w++;
		}
		System.out.println(userArr);
	}

}
