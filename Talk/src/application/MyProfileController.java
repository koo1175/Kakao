package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MyProfileController {
	
	private Singleton sgt = Singleton.getInstance();
	
	@FXML
    private ImageView Edit;

    @FXML
    void togoEditProfile(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "EditMyProfile.fxml");
    }

}
