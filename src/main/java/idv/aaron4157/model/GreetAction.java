package idv.aaron4157.model;

/**
 * 這個響應類別要做一個打招呼的動作，回傳稱呼
 * execute 在struts.xml中調用，根據回傳的字串派送頁面
 * @author aaron
 *
 */
public class GreetAction {
	private String name;
	
	public String execute() throws Exception{
		if(this.name.isEmpty()) return "error";
		else return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toLowerCase();
	}
	
}
