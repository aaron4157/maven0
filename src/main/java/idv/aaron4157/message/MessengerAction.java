package idv.aaron4157.message;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@Namespace("/") //訪問的上層目錄
@ResultPath(value="/") //規定轉址的上層目錄 通常與namespace一樣
public class MessengerAction extends ActionSupport {
	private String msg1="ini";
	
	public MessengerAction() {
		// TODO Auto-generated constructor stub
	}
	
	//定址/dao1.action
	@Action(value="dao1", results= {
			@Result(name=SUCCESS, location="/rendering.jsp"),
			@Result(name=ERROR, location="/error.jsp")
	})
	public String execute() {
		//1.準備好工廠物件
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.去跟工廠下單一個message物件 解析為MsgDomain類別(規格書)
		IMsg msgs =factory.getBean("message",IMsg.class);
		JdbcTemplate jdbc = factory.getBean("jdbc", JdbcTemplate.class);
		//3.呼叫功能 回傳結果設定Attribute
		if(msgs!=null) {
		//透過setter/getter進入Struts value stack		
			msg1=msgs.header();
			return SUCCESS;
		}else 
			return ERROR;
	}		

	public String getMessage1() {
		return msg1;
	}

	public void setMessage1(String message1) {
		this.msg1 = message1;
	}
	
}
