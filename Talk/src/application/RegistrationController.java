package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegistrationController {

	private Singleton sgt = Singleton.getInstance(); // 싱글톤

	@FXML
	private Button Nickcheck;

	@FXML
	private TextField checkPwd;

	@FXML
	private Button gotoMain;

	@FXML
	private Button idCheck;

	@FXML
	private TextField IdInput;

	@FXML
	private TextField inputNIck;

	@FXML
	private TextField inputPwd;

	@FXML
	void gotoMain(MouseEvent event) throws IOException {

		sgt.nextScene2(event, "/application/Login.fxml");

	}

	@FXML
	void checkID(MouseEvent event) {

		System.out.println(IdInput.getText());
	}

}
