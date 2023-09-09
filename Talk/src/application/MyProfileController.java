package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class MyProfileController {

	private Singleton sgt = Singleton.getInstance();

	@FXML // 배경화면 눌렀을 때
	private Pane BackImage;

	@FXML
	private ImageView Close;

	@FXML
	private ImageView Edit;

	@FXML
	void togoEditProfile(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/EditMyProfile.fxml");
	}

	@FXML
	void gotoFriendList(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/FriendList.fxml");
	}

	@FXML
	void gotoMyImageView(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/MyImageView.fxml");
	}
	
	@FXML
	void gotoMyImageView1(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/MyImageView.fxml");
	}

}
