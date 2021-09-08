package learningSpaces;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class RoomController {
	
	private ArrayList<Room>  roomAL = new ArrayList<Room>();
    private ObservableList<Room> roomOL = FXCollections.observableArrayList();
    private Room entry;
	
	
	@FXML
    private TableView<Room> tvRooms;

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
    private TextField tfRoomID;

    @FXML
    private TextField tfSearchID;

    @FXML
    private Button btDelete;

    @FXML
    private Button btSubmit;

    @FXML
    private Button btSearch;
    
    
    
    @FXML
    private void search(ActionEvent event)
    {
    	String id;
    	id = tfRoomID.getText();
    	
    	for(int i=0;i<roomAL.size();i++)
    	{
    		
    		if(roomAL.get(i).getId()==Integer.valueOf(id))
    		{
    			tfRoomID.setText(String.valueOf(roomAL.get(i).getId()));
    			tfRoomNumber.setText(roomAL.get(i).getName());
    			taAdditionalInfo.setText(String.valueOf(roomAL.get(i).getAdditionalInfo()));
    		}
    	}
    	
    }

    @FXML
    private void update(ActionEvent event)
    {    	
    	int i = Integer.valueOf(tfRoomID.getText());
    	if((i <=roomAL.size()))
    	{
    	    roomAL.addAll(Room.readDB());
    	    entry.update(Integer.valueOf(tfRoomID.getText()), tfRoomNumber.getText(), taAdditionalInfo.getText());
    	    tvRooms.getItems().clear();
    	  	roomOL.clear();
    	  	roomOL.addAll(roomAL);
    	  	tvRooms.setItems(roomOL);
    	  	tfRoomID.clear();
    	  	tfRoomNumber.clear();
    	  	taAdditionalInfo.clear();
    	}
    }
    
    @FXML
    private void updateInsert(ActionEvent event)
    {
    	int i = Integer.valueOf(tfRoomID.getText());
    	if((i <=roomAL.size()))
    	{
    		update(event);
    	}
    	else if (!(i <=roomAL.size()))
    	{
    		insert(event);
    	}
    }
    
    @FXML
    private void insert(ActionEvent event)
    {
    	int i = Integer.valueOf(tfRoomID.getText());
    	if(!(i <=roomAL.size()))
    	{
    		roomAL.addAll(Room.readDB());
    		entry.insert(Integer.valueOf(tfRoomID.getText()), tfRoomNumber.getText(), taAdditionalInfo.getText());
    		tvRooms.getItems().clear();
    		roomOL.clear();
    		roomOL.addAll(roomAL);
    		tvRooms.setItems(roomOL);
    		tfRoomID.clear();
    		tfRoomNumber.clear();
    		taAdditionalInfo.clear();
    	}
    }
    
    @FXML
    private void delet(ActionEvent event)
    {
    	roomAL.addAll(Room.readDB());
    	entry.delete(Integer.valueOf(tfRoomID.getText()));
    	tvRooms.getItems().clear();
		roomOL.clear();
		roomOL.addAll(roomAL);
		tvRooms.setItems(roomOL);
		tfRoomID.clear();
		tfRoomNumber.clear();
		taAdditionalInfo.clear();
	}
    	
  
    
    @FXML
    private void initialize()
    {
    	if (DBConnection.connect()== false)
    	{return;}
	
    	
    	tcRoomID.setCellValueFactory(new PropertyValueFactory<Room,Integer>("ID"));
    	tcRoomName.setCellValueFactory(new PropertyValueFactory<Room,String>("RoomNrID"));
    	tcAdditionalInfo.setCellValueFactory(new PropertyValueFactory<Room,String>("RoomNrIDAdditionalInfo"));
		
    	tvRooms.getItems().clear();	
    }
       
   
	
}
