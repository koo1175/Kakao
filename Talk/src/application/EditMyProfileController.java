package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class EditMyProfileController {

	@FXML
	private Text finish;

	@FXML
	private TextField messageBar;

	@FXML
	private TextField nameBar;

	@FXML
	private ImageView reMessage;

	@FXML
	private ImageView reName;
	
	

	@FXML
	//처음에 이름 설정 불가능
	public void initialize() {
		nameBar.setEditable(false);
		messageBar.setEditable(false);
	}

	@FXML
	void gotoProfile(MouseEvent event) {
		nameBar.setEditable(false);
		messageBar.setEditable(false);
		
	}

	@FXML
	void reMessage(MouseEvent event) {

	}

	@FXML
	void reName(MouseEvent event) {
		nameBar.setEditable(true);
	}

}
