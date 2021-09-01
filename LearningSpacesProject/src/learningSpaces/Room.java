package learningSpaces;

import java.sql.*;
import java.util.ArrayList;

public class Room
{
   private int	  id;
   private String name;
   private String additionalInfo;

   public Room(int pId, String pName)
   {
	  super();
	  id = pId;
	  name = pName;
	  additionalInfo = null;
   }
   
   public Room(int pId, String pName, String pAdditionalInfo)
   {
	  super();
	  id = pId;
	  name = pName;
	  additionalInfo = pAdditionalInfo;
   }
   
   
 //method to connect to database returns all entries in the room table learningspaces db as a ArrayList
   public static ArrayList<Room> readDB(Connection pConnection)
   {      
	 Room lSingleRoomData;
     ArrayList<Room> lRoomData = new ArrayList<Room>();
     Statement lStatement;
     ResultSet lResultSet;

     try {
     lStatement = pConnection.createStatement();
     lResultSet = lStatement.executeQuery("SELECT * FROM room");
     lResultSet.first();  //Points to the first entry in the result set.

     while(! lResultSet.isAfterLast())   //As long as the end of the set is not reached....
        {
    	lSingleRoomData = new Room(lResultSet.getInt(1), lResultSet.getString(2), lResultSet.getString(3));
    	lRoomData.add(lSingleRoomData);
          lResultSet.next();
        }
        } catch (Exception ex)
             {
               System.out.println("Error at the execution + " + "n" + ex.getMessage());
             }
     return lRoomData;
   }

   // get/set
   public int getId()
   {
	  return id;
   }

   public void setId(int id)
   {
	  this.id = id;
   }

   public String getName()
   {
	  return name;
   }

   public void setName(String name)
   {
	  this.name = name;
   }

   public String getAdditionalInfo()
   {
	  return additionalInfo;
   }

   public void setAdditionalInfo(String additionalInfo)
   {
	  this.additionalInfo = additionalInfo;
   }

}
