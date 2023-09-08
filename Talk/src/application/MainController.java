package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {		

	private Singleton sgt = Singleton.getInstance(); // 싱글톤

	@FXML
	private Text goSign;

	@FXML
	private PasswordField passwordField;

	@FXML
	private TextField usernameField;

	@FXML // 첫화면 로그인 버튼
	void gotoMain(MouseEvent event) throws IOException {
		
		if(usernameField.getText().equals("a")&&passwordField.getText().equals("a")) {
			sgt.nextScene2(event, "/application/FriendList.fxml");
		}
		else {
			System.out.println("다시 입력하세요");
		}
		
		
	}

	@FXML // 회원가입 화면
	void gotoSignup(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/Registration.fxml");
	}

}
