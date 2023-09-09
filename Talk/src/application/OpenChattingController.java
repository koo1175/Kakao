package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class OpenChattingController {

	private Singleton sgt = Singleton.getInstance(); // 싱글톤
	
    @FXML
    private ImageView CallChatList; // 채팅 목록 가기

    @FXML
    private ImageView CallFriendList; // 친구 목록 가기
    
    @FXML
    private Pane AddChatPane; // 채팅 추가하기 버튼 눌렀을 때 나오는 메뉴판

    @FXML
    private ImageView AddOpenChat; // 채팅 추가하기 버튼

    @FXML
    private ImageView Alone; // 1 대 1 채팅 추가

    @FXML
    private Pane OpMenuBack; // 메뉴의 background

    @FXML
    private ImageView Options; // 설정 메뉴 버튼

    @FXML
    private VBox OptionsPane; //설정 메뉴판

    @FXML
    private ImageView exit; // 채팅 추가 메뉴 나가기 버튼

    @FXML
    private ImageView together; // 단체 채팅 추가 버튼

    @FXML // 메뉴 열렸을 때 검은 화면 누르면 메뉴 닫기
    void ClosePane(MouseEvent event) {
    	OpMenuBack.setVisible(false);
		AddChatPane.setVisible(false);
		OptionsPane.setVisible(false);
    }

    @FXML // 채팅 추가 메뉴 나가기
    void Exit(MouseEvent event) {
    	OpMenuBack.setVisible(false);
		AddChatPane.setVisible(false);
    }

    @FXML // 채팅 추가 메뉴 열기
    void OpenMenu(MouseEvent event) {
    	OpMenuBack.setVisible(true);
		AddChatPane.setVisible(true);
    }

    @FXML // 설정 메뉴 열기
    void OpenOptions(MouseEvent event) {
    	OpMenuBack.setVisible(true);
    	OptionsPane.setVisible(true);
    }

    @FXML // 채팅 목록 가기
    void gotoChattingList(MouseEvent event) throws IOException {
    	sgt.nextScene(event, "/application/ChattingList.fxml");
    }

    @FXML // 친구 목록 가기
    void gotoFriendList(MouseEvent event) throws IOException {
    	sgt.nextScene(event, "/application/FriendList.fxml");
    }

}
