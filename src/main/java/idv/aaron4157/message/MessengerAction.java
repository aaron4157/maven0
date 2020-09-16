package idv.aaron4157.message;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import idv.aaron4157.database.CustomerDomain;

@Namespace("/") //規定動作定址的上層目錄
@ResultPath(value="/") //規定轉址的上層目錄 通常與namespace一樣
public class MessengerAction {
	private String msg1="initial";
	
	public MessengerAction() {
		// TODO Auto-generated constructor stub
	}
	
	//網址: /msg1
	@Action(value="msg1", results= {
			@Result(name="success", location="testView.jsp"),
			@Result(name="fail", location="error.jsp")
	})
	public String execute() {
		//1.準備好工廠物件
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.去跟工廠下單一個message物件 解析為MsgDomain類別(規格書)
		IMsgDomain msgs =factory.getBean("message",IMsgDomain.class);
		//3.呼叫功能 回傳結果設定Attribute
		if(msgs!=null) {
		//透過setter/getter進入Struts valueStack		
			msg1 = msgs.header();
			return "success";
		}else 
			return "fail";
	}
	
	public String doDefault() {
		
		return "done";
	}

	public String getMessage1() {
		return msg1;
	}

	public void setMessage1(String message1) {
		this.msg1 = message1;
	}
	
}
