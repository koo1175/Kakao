package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Item_FriendList_Controller {

	private Singleton sgt = Singleton.getInstance();
	
    @FXML
    private Pane Item_FriendList; // 친구 목록 Item

    @FXML // 친구 목록에 있는 친구를 클릭 -> 친구의 프로필보기
    void gotoFriendProfile_ImageView(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/FriendProfile.fxml");
    }

}