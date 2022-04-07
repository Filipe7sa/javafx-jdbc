module workshop{
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
	opens gui to javafx.graphics, javafx.fxml, javafx.controls;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.controls, javafx.base;
	
}