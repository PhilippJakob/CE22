package learningSpaces;

public class Account
{
   private int id;
   private String type;
   private int owner;
   private String name;
   private String subject;
   private String addionalInfo;
   private String additonalData;
   
   Account(int pId, String pType, int pOwner, String pName){
	  id = pId;
	  type = pType;
	  owner = pOwner;
	  name = pName;
	  
	  enterIntoDB(id,type,owner,name);
   }

   private void enterIntoDB(int pId, String pType, int pOwner, String pName)
   {
	  // TODO Auto-generated method stub
	  
   }

}
