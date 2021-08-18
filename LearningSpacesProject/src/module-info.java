module LearningSpacesProject {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens learningSpaces to javafx.graphics, javafx.fxml;
}
