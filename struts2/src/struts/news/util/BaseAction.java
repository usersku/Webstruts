package struts.news.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class BaseAction {
	//创建getResponse
	public HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	//创建getRequest
	public HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	
	//创建session
	public HttpSession session(){
		return getRequest().getSession();
	}
	
	//创建getOut
	public PrintWriter getOut() throws IOException {
		HttpServletResponse res = getResponse();
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		return out;
	}
	
}
