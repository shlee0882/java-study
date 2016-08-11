package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.vo.MemberVO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestProcess(request, response);
	}
	
	private void requestProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.form data 추출
		String memId = request.getParameter("id");
		String memPw = request.getParameter("pw");
		String memSex = request.getParameter("sex");
		String[] memInterest = request.getParameterValues("interest");
		
		StringBuilder sb=new StringBuilder();
		sb.append(memPw.substring(0, 2));
		for(int i=0; i<memPw.length()-2;i++){
			sb.append("*");	
		}
		
		// 2. form data를 VO 객체에 저장
		MemberVO vo = new MemberVO(memId, sb.toString(), memSex, memInterest);
		if(memSex.equals("hyun")){
			HttpSession session = request.getSession();
			// session 객체에 vo객체를 저장
			session.setAttribute("member1", vo);
			// 해당 페이지로 포워딩
			response.sendRedirect("hyun.jsp");
		}
		else{
		// 3. vo객체를 request scope 에 저장
		request.setAttribute("member1", vo);
		// 4. result.jsp 페이지로 포워딩 
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		// 4.2 forward(req,res) 메서드 호출
		rd.forward(request, response);
		}
	}

}
