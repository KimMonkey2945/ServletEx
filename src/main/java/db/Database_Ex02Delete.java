package db;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yongvvv.common.MysqlService;
@WebServlet("/db/ex02_delete")
public class Database_Ex02Delete extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query ="DELETE FROM `new_user WHERE `id` = " + id + ";";
		mysqlService.update(query);
		
		mysqlService.disconnect();
		
		response.sendRedirect("db/ex02_1.jsp");
		
		
	}
}