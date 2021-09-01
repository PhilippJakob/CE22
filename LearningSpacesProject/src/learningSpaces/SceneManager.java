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
	  
      	  EnumSet.allOf(SceneState.class).forEach(sceneName -> {
      		try {
      		 lScenes.put(sceneName,  new Scene((AnchorPane)FXMLLoader.load(getClass().getResource(sceneName.getFileName())),sceneName.getSceneWidth(),sceneName.getSceneHeight()));
      		}
      		catch(Exception e) {
      			e.printStackTrace();
      		}
      	  });
	  
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
