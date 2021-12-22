package db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yongvvv.common.MysqlService;
@WebServlet("/db/ex02_insert")
public class DatabaseEx02 extends HttpServlet {

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		response.getContentType() 생략!!  사용자에게 보여줄 것이 없음
		PrintWriter out = response.getWriter();
		
		
		
		
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String introduce = request.getParameter("introduce");
		String email = request.getParameter("email");
		
		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		String query ="INSERT INTO `new_user`\r\n"
				+ "(`name`, `yyyymmdd`, `introduce`, `email`, `createdAt`, `updatedAt`)\r\n"
				+ "VALUES\r\n"
				+ "('"+name+"', '" + yyyymmdd+"', '"+introduce+"', '"+email+"',now(),now())";
		
		mysqlService.update(query);
		
		mysqlService.disconnect();
		
		
		//다른 페이지로 바로 이동
		// redirect
		response.sendRedirect("/db/ex02_1.jsp");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
