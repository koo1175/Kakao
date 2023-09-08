package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class MyProfileController {

	private Singleton sgt = Singleton.getInstance();

	@FXML
	private ImageView Edit;
	
	@FXML
	private ImageView Close;
	
	@FXML // 배경화면 눌렀을 때
    private Pane BackImage;

	@FXML
	void togoEditProfile(MouseEvent event) throws IOException {
		sgt.nextScene(event, "/application/EditMyProfile.fxml");
	}

	@FXML
	void gotoFriendList(MouseEvent event) throws IOException {
		sgt.nextScene(event, "/application/FriendList.fxml");
	}

    @FXML
    void gotoMyImageView(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/MyImageView.fxml");
    }

}
