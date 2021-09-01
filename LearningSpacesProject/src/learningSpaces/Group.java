/**
 * 
 */
package learningSpaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * @author jimmy
 *
 */
public class Group 
{
	private int id=0;
	private String type;
	private int owner =0;
	private String name;
	private String subejct;
	private String additionalInfo;
	private String additionalData;
	
// Create(Insert)/Update/Delete	

		public void create(int id, String type, int owner, String name,	String subejct, String additionalInfo, String additionalData)	
		{		
			Connection conn = DBConnection.getConnection();		
			Statement lStatement;		
			String lStatmentString;
			
			try 		
			{	         
				PreparedStatement ps = conn.prepareStatement("insert into booking values(?,?,?,?,?,?,?)");          
				ps.setString(2, "");	         
				ps.setString(4, "");	         
				ps.setString(5, "");	                   
				ps.setString(6, "");	        
				ps.setString(7, "");	          
				ps.setInt(1, 0);	         
				ps.setInt(3, 0);	          
				ps.executeUpdate();		
	            System.out.println("insert successfully");								
			} 
			catch (Exception ex)          
			{
            	System.out.println("Error at the execution + " + "n" + ex.getMessage());         
			}
		}
		public void update(int id, String type, int owner, String name,	String subejct, String additionalInfo, String additionalData)	
		{		
			Connection conn = DBConnection.getConnection();		
			Statement lStatement;		
			String lStatmentString;
			
			try 
			{
		           String updateQuery = "update booking set id=?,type=?,owner=?,  name=?, subject=?, additionalInfo=?, additionalData=? where id='";
		            PreparedStatement ps1 = conn.prepareStatement(updateQuery);
		            ps1.setString(2, "");
		            ps1.setString(4, "");
		            ps1.setString(5, "");
		            ps1.setString(6, "");
		            ps1.setString(7, "");
		            ps1.setInt(1, 0);
		            ps1.setInt(1, 0);
		            ps1.executeUpdate();    
		            System.out.println("updated successfully");	
			}         
			catch (Exception ex)          
			{
            	System.out.println("Error at the execution + " + "n" + ex.getMessage());         
			}
		}
		public void delete(int id, String type, int owner, String name,	String subejct, String additionalInfo, String additionalData)	
		{		
			Connection conn = DBConnection.getConnection();		
			Statement lStatement;		
			String lStatmentString;
			
			try 
			{
		           String updateQuery = "delete booking set id=?,type=?,owner=?,  name=?, subject=?, additionalInfo=?, additionalData=? where id='";
		            PreparedStatement ps1 = conn.prepareStatement(updateQuery);
		            ps1.setString(2, "");
		            ps1.setString(4, "");
		            ps1.setString(5, "");
		            ps1.setString(6, "");
		            ps1.setString(7, "");
		            ps1.setInt(1, 0);
		            ps1.setInt(1, 0);
		            ps1.executeUpdate();    
		            System.out.println("delete successfully");	
			}         
			catch (Exception ex)          
			{
            	System.out.println("Error at the execution + " + "n" + ex.getMessage());         
			}
		}
	//get/set
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

