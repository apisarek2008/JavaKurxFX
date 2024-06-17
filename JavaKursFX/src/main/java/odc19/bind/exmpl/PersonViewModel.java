package odc19.bind.exmpl;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonViewModel {

	private StringProperty txtNameProperty = new SimpleStringProperty();
	private StringProperty txtSurnameProperty = new SimpleStringProperty();
	private BooleanProperty txtSurnameDisableProperty = new SimpleBooleanProperty();
	private BooleanProperty lblIsNameOK = new SimpleBooleanProperty(false);
	private BooleanProperty lblIsSurnameOK = new SimpleBooleanProperty(false);
	private StringProperty txtYearOfBirth = new SimpleStringProperty();
	private BooleanProperty chkConfirm = new SimpleBooleanProperty(false);
	private StringProperty lblYourAgeIs = new SimpleStringProperty();
	private BooleanProperty btnLoginProperty = new SimpleBooleanProperty(false);
	private IntegerProperty actualYearProperty = new SimpleIntegerProperty(LocalDate.now().getYear());

	public PersonViewModel() {
		lblIsNameOK.bind(txtNameProperty.isNotEmpty());
		lblIsSurnameOK.bind(txtSurnameProperty.isNotEmpty());
		txtSurnameDisableProperty.bind(txtNameProperty.isEmpty());
		btnLoginProperty.bind(chkConfirm.not());
		// txtYearOfBirth.bind(new
		// When(txtYearOfBirth.isNotEqualTo(0)).then(actualYearProperty.subtract(actualYearProperty).asString()).otherwise("0"));

	}

	public StringProperty getTxtNameProperty() {
		return txtNameProperty;
	}

	public void setTxtNameProperty(StringProperty txtNameProperty) {
		this.txtNameProperty = txtNameProperty;
	}

	public StringProperty getTxtSurnameProperty() {
		return txtSurnameProperty;
	}

	public void setTxtSurnameProperty(StringProperty txtSurnameProperty) {
		this.txtSurnameProperty = txtSurnameProperty;
	}

	public BooleanProperty getTxtSurnameDisableProperty() {
		return txtSurnameDisableProperty;
	}

	public void setTxtSurnameDisableProperty(BooleanProperty txtSurnameDisableProperty) {
		this.txtSurnameDisableProperty = txtSurnameDisableProperty;
	}

	public StringProperty getTxtYearOfBirth() {
		return txtYearOfBirth;
	}

	public void setTxtYearOfBirth(StringProperty txtYearOfBirth) {
		this.txtYearOfBirth = txtYearOfBirth;
	}

	public BooleanProperty getChkConfirm() {
		return chkConfirm;
	}

	public void setChkConfirm(BooleanProperty chkConfirm) {
		this.chkConfirm = chkConfirm;
	}

	public StringProperty getLblYourAgeIs() {
		return lblYourAgeIs;
	}

	public void setLblYourAgeIs(StringProperty lblYourAgeIs) {
		this.lblYourAgeIs = lblYourAgeIs;
	}

	public BooleanProperty getBtnLoginProperty() {
		return btnLoginProperty;
	}

	public void setBtnLoginProperty(BooleanProperty btnLoginProperty) {
		this.btnLoginProperty = btnLoginProperty;
	}

	public IntegerProperty getActualYearProperty() {
		return actualYearProperty;
	}

	public void setActualYearProperty(IntegerProperty actualYearProperty) {
		this.actualYearProperty = actualYearProperty;
	}

	public BooleanProperty getLblIsNameOK() {
		return lblIsNameOK;
	}

	public void setLblIsNameOK(BooleanProperty lblIsNameOK) {
		this.lblIsNameOK = lblIsNameOK;
	}

	public BooleanProperty getLblIsSurnameOK() {
		return lblIsSurnameOK;
	}

	public void setLblIsSurnameOK(BooleanProperty lblIsSurnameOK) {
		this.lblIsSurnameOK = lblIsSurnameOK;
	}

}
