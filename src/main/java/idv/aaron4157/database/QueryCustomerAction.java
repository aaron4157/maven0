/**
 * 
 */
package idv.aaron4157.database;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.PreparedStatementCallback;  

/**
 * @author aaron
 *
 */
/*
 * @Namespace("/app/v1")
 * 
 * @ResultPath("/app/v1")
 */
public class QueryCustomerAction {

	/**
	 * 實作後為一種DAO， 將string映射到bean 是ORM的核心部分
	 * 這裡不用宣告 JdbcTemplate物件變數
	 * 屬性只有Customer bean
	 */
	public QueryCustomerAction() {
		// TODO Auto-generated constructor stub
	}
	
	private CustomerDomain cust;
	
	/*
	 * @Action("testConnection", Results= {
	 * 
	 * })
	 */
	public String execute() {
		//預設方法
		return "success";
	}

}
