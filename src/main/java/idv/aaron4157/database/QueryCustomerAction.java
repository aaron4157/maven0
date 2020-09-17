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
 * 1真實路徑：action在src底下
 * 2真實路徑：views在webapp/spring底下 網址路徑是/spring/xxViews.jsp 
 * @author aaron
 *
 */

@Namespace("/spring")  
@ResultPath("/spring") 
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
	
	//spring/querycustomer
	  @Action(value="querycustomer", results= {
			  @Result(name="success", location="CustimerView.jsp")
	  }) 
	public String execute() {
		
		return "success";
	}

}
