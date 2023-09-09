package application;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class FriendProfileController {
	
	private Singleton sgt = Singleton.getInstance();

    @FXML
    private ImageView Close; // 프로필 화면 닫기 버튼

    @FXML
    private Pane FriendImage; // 배경 이미지 (보기)

    @FXML
    private ImageView FriendProfileImage; // 프로필 사진 (보기)

    @FXML
    private Pane WithChat; // 1:1 채팅하기

    @FXML // 1 : 1 채팅방 가기
    void gotoChattingRoom(MouseEvent event) {
    	
    }

    @FXML // 친구 배경 이미지 보기
    void gotoFriendImageView(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/FriendImageView.fxml");
    }

    @FXML // 친구 프로필 사진 보기
    void gotoFriendList(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/FriendList.fxml");
    }

    @FXML
    void gotoFriendProfile_ImageView(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/FriendProfile_ImageView.fxml");
    }

}