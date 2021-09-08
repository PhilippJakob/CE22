package learningSpaces;

import java.sql.*;


public class DBConnection {

	 private static String hostrechner ="dbserver";//"localhost";
	   private static String datenbank="learningspaces";
	   private static String benutzer="dbuser";
	   private static String passwort="benutzer";

	private static Connection connection;
		


public static boolean connect()
{
 // creates the connection and stores it in the static attribute connection .
	try{

	connection = DriverManager.getConnection("jdbc:mysql://" + hostrechner +":3306/"+datenbank+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin", benutzer, passwort);
     return true;

    }catch (Exception ex)
	  {				//Fehlerbehandlung
	    System.out.println("Fehler bei der Datenbankverbindung");
	    return false;
      }
}


//get und set
public static Connection getConnection()
{
	return connection;
}

public void setConnection(Connection pConnection)
{
	connection = pConnection;
}


public static String getHostrechner() {
  return hostrechner;
}

public static void setHostrechner(String pHostrechner) {
  hostrechner = pHostrechner;
}

public static String getDatenbank() {
  return datenbank;
}

public static void setDatenbank(String pDatenbank) {
  datenbank = pDatenbank;
}

public static String getBenutzer() {
  return benutzer;
}

public static void setBenutzer(String pBenutzer) {
  benutzer = pBenutzer;
}

public static String getPasswort() {
  return passwort;
}

public static void setPasswort(String pPasswort) {
  passwort = pPasswort;
}

}
