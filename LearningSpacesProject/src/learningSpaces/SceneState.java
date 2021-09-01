package learningSpaces;

public enum SceneState
{
   HOME("LSView.fxml",400,400);
   
   
   //EXAMPLE: OTHER("[FILENAMEFORTHISSTATE].fxml",400,400)
   
   private String fxmlFileName;
   private int sceneWidth, sceneHeight;
   
   SceneState(String pFxmlFileName, int pSceneWidth, int pSceneHeight){
	  this.fxmlFileName = pFxmlFileName;
	  this.sceneWidth = pSceneWidth;
	  this.sceneHeight = pSceneHeight;
   }
   
   String getFileName() {
	  return this.fxmlFileName;
   }
   int getSceneWidth() {
	  return this.sceneWidth;
   }
   int getSceneHeight() {
	  return this.sceneHeight;
   }
}
