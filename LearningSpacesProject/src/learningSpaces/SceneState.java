package learningSpaces;

public enum SceneState
{
   HOME("LSView.fxml"),
   OTHER("[FILENAMEFORTHISSTATE].fxml");
   
   private String fxmlFileName;
   
   SceneState(String pFxmlFileName){
	  this.fxmlFileName = pFxmlFileName;
   }
   
   String getFileName() {
	  return this.fxmlFileName;
   }
}
