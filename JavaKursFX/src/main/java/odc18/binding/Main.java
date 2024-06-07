package odc18.binding;

import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
		

	}

	private static void binding() {
		DoubleProperty a = new SimpleDoubleProperty(3.0);
		IntegerProperty b = new SimpleIntegerProperty(4);
		System.out.println("Działania liczbowe...");
		NumberBinding resultAdd = a.add(b);
		System.out.println("Wynik dodawanie " + resultAdd.intValue());
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc18/binding.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Properties");
		primaryStage.show();
		binding();
	}

}
