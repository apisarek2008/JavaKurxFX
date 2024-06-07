package odc17.properties;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {

	@FXML
	private Pane mainPane;

	@FXML
	private TextField txtFieldID;

	@FXML
	private Label lblLabelID;

	@FXML
	Button btnWriteID;

	@FXML
	public void writeAct() {
		
	}
	
	private Person person = new Person();
	
	@FXML
	public void initialize() {
		txtFieldID.textProperty().bindBidirectional(person.getPropertytxtField());
		lblLabelID.textProperty().bind(person.getPropertytxtField());
	}
}
