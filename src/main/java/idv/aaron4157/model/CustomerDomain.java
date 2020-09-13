/**
 * 
 */
package idv.aaron4157.model;

/**
 * @author aaron
 *
 */
public class CustomerDomain implements java.io.Serializable {

	/**
	 * 這是資料容器，是一種Java bean
	 */
	private int customer_id;
	private String first_name;
	private String last_name;
	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;
	private String zip_code;
	
	public CustomerDomain() {
		// TODO Auto-generated constructor stub
	}

}
