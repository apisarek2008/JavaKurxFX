package odc19.bind.exmpl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private Button btnLogin;

	@FXML
	private CheckBox chkConfirm;

	@FXML
	private Label lblIsNameOK;

	@FXML
	private Label lblIsSurnameOK;

	@FXML
	private Label lblYourAgeIs;

	@FXML
	private TextField txtName;

	@FXML
	private TextField txtSurname;

	@FXML
	private TextField txtYearOfBirth;

	@FXML
	void btnLoginAct(ActionEvent event) {

	}

	private PersonViewModel pvm = new PersonViewModel();

	@FXML
	public void initialize() {

		// txtProperty bindujemy z property typu String
		txtName.textProperty().bindBidirectional(pvm.getTxtNameProperty());
		txtSurname.textProperty().bindBidirectional(pvm.getTxtSurnameProperty());
		// diable property bindujemy z property typu boolean  - włącza i wyłącza pole
		txtSurname.disabledProperty().and(pvm.getTxtSurnameDisableProperty());
		lblIsNameOK.disableProperty().bind(pvm.getLblIsNameOK());
		lblIsSurnameOK.disabledProperty().and(pvm.getLblIsSurnameOK());
		btnLogin.disabledProperty().and(pvm.getBtnLoginProperty());
		

	}
}



























