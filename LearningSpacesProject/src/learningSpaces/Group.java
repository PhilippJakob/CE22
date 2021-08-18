/**
 * 
 */
package learningSpaces;

/**
 * @author jimmy 
 *
 */
public class Group 
{
	private int id = 0;
	private String type;
	private int owner = 0;
	private String name;
	private String subejct;
	private String additionalInfo;
	private String additionalData;
	
	
	//~~~ Getters & Setters ~~~ 
	public int getId() {
		return id;
	}
	public void setId(int pId) 
	{
		id = pId;
	}
	public String getType() {
		return type;
	}
	public void setType(String pType) {
		type = pType;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int pOwner) {
		owner = pOwner;
	}
	public String getName() {
		return name;
	}
	public void setName(String pName) {
		name = pName;
	}
	public String getSubejct() {
		return subejct;
	}
	public void setSubejct(String pSubejct) {
		subejct = pSubejct;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String pAdditionalInfo) {
		additionalInfo = pAdditionalInfo;
	}
	public String getAdditionalData() {
		return additionalData;
	}
	public void setAdditionalData(String pAdditionalData) {
		additionalData = pAdditionalData;
	}
	
}
