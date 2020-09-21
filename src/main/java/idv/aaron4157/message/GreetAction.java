package idv.aaron4157.message;

/**
 * 這個響應類別要做一個打招呼的動作，回傳稱呼
 * execute 在struts.xml中調用，根據回傳的字串派送頁面
 * @author aaron
 *
 */
public class GreetAction {
	private IMsg msgBean; 
	
	private String name;
	private String msg;
	
	public String execute() {
		if(this.name.isEmpty()) return "error";
		else return "success";
	}
	
	public String forward() {
		if(this.msgBean!=null) {
			setMsg(msgBean.header());
		}
		else {
			setMsg("~~not found~~");
			
		}
		return "success";

	}
	
	//透過setter/getter進入Struts valueStack
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toLowerCase();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
