package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class EditMyProfileController {
	
	private Singleton sgt = Singleton.getInstance();
	
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
	private Pane Popup;
	
	@FXML
	private Text No;
	
	@FXML
	private Text Yes;
	
	@FXML
	private ImageView CloseEditMyProfile;
	
	@FXML
	private Pane PopupBack;

	@FXML
	//처음에 이름 설정 불가능
	public void initialize() {
		nameBar.setEditable(false);
		messageBar.setEditable(false);
	}

	@FXML
	void gotoMyProfile(MouseEvent event) throws IOException {
		nameBar.setEditable(false);
		messageBar.setEditable(false);
		sgt.nextScene2(event, "/application/MyProfile.fxml");
		
	}

	@FXML
	void reMessage(MouseEvent event) throws IOException {
		messageBar.setEditable(true);
	}

	@FXML
	void reName(MouseEvent event) throws IOException {
		nameBar.setEditable(true);
	}
	
	@FXML
	 void CallPopup(MouseEvent event) throws IOException {
        Popup.setVisible(true);
        PopupBack.setVisible(true);
	}
	
	@FXML
	 void ClosePopup(MouseEvent event) throws IOException {
       Popup.setVisible(false);
       PopupBack.setVisible(false);
	}


}
