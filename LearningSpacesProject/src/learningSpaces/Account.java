package learningSpaces;

import java.sql.*;
import java.util.Random;

public class Account
{
   private int id;
   private String type;
   private int owner;
   private String name;
   private String subject;
   private String addionalInfo;
   private String additonalData;
   private Connection conn;
   
   Account(int pId){
	  id = pId;
	  
	  //getInfoFromDB(id);
	  //get all information related from the database by id
   }
   
   public String createSessionToken() {
	    int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    
	    return generatedString;
	}
   
   
   private String login(String pUsername, String pPassword) {
	  boolean loginState;
	  try {
	  conn = DBConnection.getConnection();
	  PreparedStatement lStatement = conn.prepareStatement("SELECT * FROM learningspaces.account WHERE username = '"+pUsername+"' AND password = '"+pPassword+"'");
	  lStatement.executeUpdate();
	  loginState = true;
	  conn.close();
	  } catch (Exception ex)
      {
		loginState = false;
        System.out.println("username or password are incorrect");
      }
	  if(loginState == true) {
		 return createSessionToken();
	  }
	  else return "false";
   }

}
