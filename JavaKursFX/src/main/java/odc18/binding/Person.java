package odc18.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	private StringProperty propertytxtField = new SimpleStringProperty(this,"nameProperty", "John Snow");

	public StringProperty getPropertytxtField() {
		return propertytxtField;
	}

	public void setPropertytxtField(StringProperty propertytxtField) {
		this.propertytxtField = propertytxtField;
	}
	
	
	
}
