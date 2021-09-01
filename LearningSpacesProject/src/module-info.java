module LearningSpacesProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens learningSpaces to javafx.graphics, javafx.fxml;
}
