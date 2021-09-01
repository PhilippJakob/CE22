package learningSpaces;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RoomController {
	
	@FXML
    private TableView<?> tvRooms;

    @FXML
    private TableColumn<?, ?> tcRoomID;

    @FXML
    private TableColumn<?, ?> tcRoomName;

    @FXML
    private TableColumn<?, ?> tcAdditionalInfo;

    @FXML
    private TextArea taAdditionalInfo;

    @FXML
    private TextField tfRoomNumber;

    @FXML
    private TextField tfRommID;
	
}
