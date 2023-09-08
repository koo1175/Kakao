package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class MyImageViewController {
	
	private Singleton sgt = Singleton.getInstance();
	
    @FXML
    private ImageView CloseBackImageView;
    
    @FXML
    private ImageView More;

    @FXML
    private Pane RemoveMenu;

    @FXML
    void gotoMyProfile(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/MyProfile.fxml");
    }
    
    @FXML
    void visivility_removeMenu(MouseEvent event) {
    	// 현재 RemoveMenu의 가시성 상태를 확인합니다.
        boolean isVisible = RemoveMenu.isVisible();

        // 가시성 상태를 반대로 설정합니다.
        RemoveMenu.setVisible(!isVisible);
    	
    }

}
