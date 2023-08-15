package practicehome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public logincontroller() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter prw = response.getWriter();
		
		String userid = request.getParameter("userid").intern();
		String userpw = request.getParameter("userpw").intern();
		
		String list[] = {"hong","kim","park","apink"};
		String passwd[] = {"a1234","b1234","c1234","apink"};
		/*
		 * 응용문제1.
		 * 해당 2개의 배열을 이용하여 다음과 같은 결과 값으로 출력되도록 하시오.
		 * 
		 * 응용문제 2.
		 * 아이디 및 패스워드가 동일 할 경우 : "로그인 되셨습니다." 메세지 출력
		 * 단, 아이디가 없을 경우 : "가입되지 않은 사용자 입니다." 메세지 출력
		 * 패스워드가 틀릴 경우 : "해당 패스워드를 확인하세요" 메세지 출력
		 * */
		String message = "";
		int count = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(userid == list[i]) {		// 아이디 맞는경우
				count = 1;
				if(userpw == passwd[i]) {
					message = "<script>alert('로그인 되셨습니다.');</script>";
					break;
				}else {
					message = "<script>alert('해당 패스워드를 확인하세요.');history.go(-1);</script>";
					break;
				}
			}
		}
		if(count == 0) {
			message = "<script>alert('가입되지 않은 사용자입니다.');history.go(-1);</script>";
		}
		
		prw.write(message);
	}
}
