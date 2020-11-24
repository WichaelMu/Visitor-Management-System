import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception{
		Button b = new Button("Button");
		primaryStage.setTitle("qwert");
		primaryStage.setScene(new Scene(b, 300, 275));
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
