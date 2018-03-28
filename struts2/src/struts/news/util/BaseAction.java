package struts.news.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class BaseAction {
	//����getResponse
	public HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	//����getRequest
	public HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	
	//����session
	public HttpSession session(){
		return getRequest().getSession();
	}
	
	//����getOut
	public PrintWriter getOut() throws IOException {
		HttpServletResponse res = getResponse();
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		return out;
	}
	
}
