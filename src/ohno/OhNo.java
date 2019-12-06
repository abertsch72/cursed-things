package ohno;
import javafx.application.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.scene.paint.*;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane; 


public class OhNo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setAlwaysOnTop(true);
		Label whoops = new Label("Hey! Don't do that! :(((");
		BorderPane bp = new BorderPane();
		bp.setCenter(whoops);
		Scene s = new Scene(bp);
		whoops.setTextFill(Color.RED);
		primaryStage.setOnCloseRequest((event)->{primaryStage.setScene(s);event.consume();});
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();

        //set Stage boundaries to visible bounds of the main screen
        primaryStage.setX(primaryScreenBounds.getMinX());
        primaryStage.setY(primaryScreenBounds.getMinY());
        primaryStage.setWidth(primaryScreenBounds.getWidth());
        primaryStage.setHeight(primaryScreenBounds.getHeight());

		primaryStage.show();
	}

}
