package idv.aaron4157.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import idv.aaron4157.model.CustomerDomain;
import idv.aaron4157.model.IMsgDomain;

//Controller as POJO
public class Messeger {
	private CustomerDomain customer;
	private String message1;

	public Messeger() {
		// TODO Auto-generated constructor stub
	}

	public String execute() {
		return "success";
	}
	
	public String heading() {
		//使用Spring Factory模組 抽出物件(要出物件-依照他的合約生產)
		//1.準備好工廠物件
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		//去跟工廠定一個message物件 解析為MsgDomain類別
		IMsgDomain msg =factory.getBean("message",IMsgDomain.class);
		//呼叫功能 將結果設定Attribute(透過setter/getter進入Struts ValueStack
		message1 = msg.header();
		
		return "success";
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}
}
