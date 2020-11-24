import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	Scene formWindow;
	@Override
	public void start(Stage primaryStage) throws Exception{
		Button beginBT = new Button("Begin here");
		Button formBT = new Button("Form here");
		HBox h1 = new HBox(beginBT);
		HBox h2 = new HBox(formBT);
		VBox vb = new VBox(h1,h2);
		primaryStage.setTitle("qwert");
		primaryStage.setScene(new Scene(vb, 300, 275));
		primaryStage.show();

		Label nameLB = new Label("First name");
		TextField nameTF = new TextField();
		Label surnameLB = new Label("Last name");
		TextField surnameTF = new TextField();
		Label suburbLB = new Label("Suburb");
		TextField suburbTF = new TextField();
		Label phoneNoLB = new Label("Phone No.");
		TextField phoneNoTF = new TextField();

		HBox nameHB = new HBox(nameLB, nameTF);
		HBox surnameHB = new HBox(surnameLB, surnameTF);
		HBox suburbHB = new HBox(suburbLB, suburbTF);
		HBox phoneNoHB = new HBox(phoneNoLB, phoneNoTF);
		VBox vb1 = new VBox(nameHB,surnameHB,suburbHB,phoneNoHB);
		Scene formWindow = new Scene(vb1, 400, 300);

//		beginBT.setOnAction(event -> {
//			primaryStage.setScene();
//		});
		formBT.setOnAction(event -> {
			primaryStage.setScene(formWindow);
			primaryStage.show();
		});
	}


	public static void main(String[] args) { launch(args); }
}
