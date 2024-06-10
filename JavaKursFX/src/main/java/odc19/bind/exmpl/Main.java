package odc19.bind.exmpl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage Win) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc19/bindingExample.fxml"));
		VBox vbox = loader.load();
		Scene scene = new Scene(vbox, 441, 267);
		Win.setScene(scene);
		Win.setTitle("Bindowanie - example");
		Win.show();

	}

}
