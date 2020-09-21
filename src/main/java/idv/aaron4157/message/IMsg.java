/**
 * MsgDomains 的規範
 */
package idv.aaron4157.message;

/**
 * @author aaron
 * 
 */
public interface IMsg {
	public String header();
	public default void info() {
		System.out.println("~~~message prepared~~~");
	};
}
