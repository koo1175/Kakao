package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class FriendListController {

	private Singleton sgt = Singleton.getInstance();

	@FXML // 상단 메뉴 클릭시 투명한 검은 배경 위 채팅 추가하기 메뉴
	private Pane AddChatMenu;

	@FXML // 채팅 추가 메뉴 닫기 버튼
	private ImageView CloseMenu;

	@FXML // 상단 메뉴 클릭시 투명한 검은 배경
	private Pane MenuPane;

	@FXML // 상단의 채팅 추가하기 버튼
	private ImageView NewChat;

	@FXML // 상단 설정 버튼
	private ImageView Option;

	@FXML // 설정 버튼 누르면 나오는 메뉴버튼
	private VBox OptionMenu;

	@FXML // 내 프로필 수정 텍스트
	private Text EditMyProfile;

	@FXML // 프로필 수정 페이지 닫기
	private ImageView CloseEditMyProfile;

	@FXML
	private ImageView OpenChat;

	@FXML
	private ImageView gotoChattinglist;

	@FXML
	private Pane profile;

	@FXML // 친구이미지 visible(false)처리
	private Pane Friend;

	@FXML // 친구 뜨는자리
	private VBox List;
	@FXML
	private ImageView AddFriend;

	@FXML
	void gotoChattingList(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/Chatroom.fxml");
	}

	@FXML
	void gotoOpenChat(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/OpenChatting.fxml");
	}

	@FXML
	void gotoProfile(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/MyProfile.fxml");
	}

//	@FXML // 채팅 추가하기 버튼 클릭
//	private void toggleVisibility(MouseEvent event) throws IOException {
//		// 버튼을 클릭할 때 Pane을 보이게 설정
//		MenuPane.setVisible(!MenuPane.isVisible());
//		AddChatMenu.setVisible(true);
//	}

	@FXML // 채팅 추가하기 메뉴 닫기 버튼 클릭
	private void toggleVisibility_false(MouseEvent event) throws IOException {
		// 버튼을 클릭할 때 Pane을 안보이게 설정
		MenuPane.setVisible(false);
		AddChatMenu.setVisible(false);
	}

	@FXML // 옵션 버튼 클릭시
	void toggleVisibility_Option(MouseEvent event) throws IOException {
		// 버튼을 클릭할 때 Pane을 보이게 설정
		MenuPane.setVisible(true);
		OptionMenu.setVisible(true);
	}

	@FXML // 검은화면의 여백을 클릭시 닫힘
	void toggleVisibility_MenuPane(MouseEvent event) throws IOException {
		// 버튼을 클릭할 때 Pane을 안보이게 설정
		MenuPane.setVisible(false);
		AddChatMenu.setVisible(false);
		OptionMenu.setVisible(false);
	}

	@FXML
	void gotoEditMyProfile(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/EditMyProfile.fxml");
	}

	@FXML // 채팅 추가하기 버튼 클릭 -> 일단 친구 목록 바로 보이게 FriendPane 생성
	void AddFriend(MouseEvent event) {
		Pane newFriend = new Pane();
		newFriend.setStyle(Friend.getStyle()); // Friend Pane의 스타일 복사
		newFriend.setPrefSize(Friend.getPrefWidth(), Friend.getPrefHeight()); // Friend Pane의 크기 복사

		// 여기에 친구 정보를 표시하는 내용을 newFriend Pane에 추가합니다.
		Text friendName = new Text("새로운 친구"); // 친구 이름을 나타내는 예제 텍스트
		newFriend.getChildren().add(friendName);

		// newFriend을 VBox(List)에 추가합니다.
		List.getChildren().add(newFriend);
	}
}
