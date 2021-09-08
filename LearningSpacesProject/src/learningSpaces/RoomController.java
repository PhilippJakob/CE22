package learningSpaces;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Statement;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class RoomController {
	
	private ArrayList<Room>  roomAL = new ArrayList<Room>();
    ObservableList<Room> roomOL = FXCollections.observableArrayList();
    private Room entry;
	
	
	@FXML
    private TableView<?> tvRooms;

    @FXML
    private TableColumn<Room, Integer> tcRoomID;

    @FXML
    private TableColumn<Room, String> tcRoomName;

    @FXML
    private TableColumn<Room, String> tcAdditionalInfo;

    @FXML
    private TextArea taAdditionalInfo;

    @FXML
    private TextField tfRoomNumber;

    @FXML
    private TextField tfRommID;
    
    @FXML
    private Button btSubmit;
    
    
    
    

    @FXML
    private void update(ActionEvent event)
    {    	    
    	    room.setKiteDataAL(Room.readDB());
    	  	tvKiteData.getItems().clear();
    	  	kiteDataOL.clear();
    	  	kiteDataOL.addAll(kiteList.getKiteDataAL());
    	  	tvKiteData.setItems(kiteDataOL);
    	  	tfID.clear();
    	  	tfBrand.clear();
    	  	tfReleaseDate.clear();
    	  	tfAnzahlEintraege.clear();
    }
  
    
    
    @FXML
    private void initialize()
    {
    	if (DBConnection.connect()== false)
    	{return;}
	
    	putIntoOL(Room.readDB());
    	
    	tcRoomID.setCellValueFactory(new PropertyValueFactory<Room,Integer>("ID"));
    	tcRoomName.setCellValueFactory(new PropertyValueFactory<Room,String>("RoomNrID"));
    	tcAdditionalInfo.setCellValueFactory(new PropertyValueFactory<Room,String>("RoomNrIDAdditionalInfo"));
		
    }
    
    void putIntoOL(ArrayList<Room> pAL)
    {
    	roomOL.addAll(pAL);
    }
    
    
    
	
}
