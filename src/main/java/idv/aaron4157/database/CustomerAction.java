/**
 * 
 */
package idv.aaron4157.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.opensymphony.xwork2.ActionSupport;  

/**
 * 實作後為一種DAO， 將string映射到java bean 是ORM的核心部分
 * spring 已部屬 這裡不用宣告 JdbcTemplate物件變數
 * 屬性只有Customer bean
 *  * @author aaron
 *
 */

public class CustomerAction extends ActionSupport{
	//fields
	private CustomerDomain cust=null; //spring已部屬
	//properties
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	//methods
	public String execute() {
		//1.準備好工廠物件 獲取bean
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbc= factory.getBean("jdbc", JdbcTemplate.class);

		if(jdbc != null) {
			this.status = jdbc.toString();
		} else {
			this.status = "JDBC not found";
		}		
		return "success";
	}

	public CustomerAction() {
		// TODO Auto-generated constructor stub
	}
}
