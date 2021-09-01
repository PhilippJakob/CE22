package learningSpaces;

import java.util.EnumSet;
import java.util.HashMap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class SceneManager
{
   
   private SceneState sceneState = SceneState.HOME;
   private Stage primaryStage;
   private HashMap<SceneState, Scene> scenes = createScenes();
   
   SceneManager(Stage pStage){
	  primaryStage = pStage;
	  setSceneState(sceneState);
   }
   
   
   private HashMap<SceneState, Scene> createScenes()
   {
	  HashMap<SceneState, Scene> lScenes = new HashMap<SceneState, Scene>();
	  
	  try {
      	  EnumSet.allOf(SceneState.class).forEach(sceneName -> {
      		 switch (sceneName) {
      			case HOME: lScenes.put(sceneName,  new Scene((AnchorPane)FXMLLoader.load(getClass().getResource("LSView.fxml")),400,400).getStylesheets().add(getClass().getResource("application.css").toExternalForm()));
      			   break;
      			case OTHER: lScenes.put(sceneName,  new Scene((AnchorPane)FXMLLoader.load(getClass().getResource("[FILENAMEFORTHISSTATE].fxml")),400,400).getStylesheets().add(getClass().getResource("application.css").toExternalForm()));
      			   break;
      		 }
      	  });
	  }
	  catch(Exception e) {
			e.printStackTrace();
		}
	  
	  return lScenes;
   }


   SceneState getSceneState(){
	  return sceneState;
   }
   
   void setSceneState(SceneState pNewState) {
	  sceneState = pNewState;
	  primaryStage.setScene(scenes.get(sceneState));
	  primaryStage.show();
   }
}
