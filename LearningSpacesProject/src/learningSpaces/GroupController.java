package learningSpaces;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.*;

public class GroupController {

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfSubject;

    @FXML
    private TextField tfType;
 
    @FXML
    private TextArea taAdditionalInfo;

    @FXML
    private Button btConfirm;

    @FXML
    void confirm(ActionEvent event) {    	
    	if(btConfirm.isPressed())
    	{
    	tfName.getText();
    	tfSubject.getText();
    	tfType.getText();
    	taAdditionalInfo.getText();
    	}

    }

}
