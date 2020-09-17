package idv.aaron4157;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Result(name="success", location="/testView.jsp")
public class TestAction extends ActionSupport {
		

	@Action(value="forward")
	//沒有namespace 沒有網址方法
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	
	

	public TestAction() {
		// TODO Auto-generated constructor stub
	}
}
