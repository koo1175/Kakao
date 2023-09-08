package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ChatRoomController {

	private Singleton sgt = Singleton.getInstance(); // 싱글톤


	@FXML
	private TextArea ChatField;

	@FXML
	private TextField RoomName;

	@FXML
	private ImageView Send;

	@FXML
	private TextArea writeChat;

	@FXML
	void gotoMain(MouseEvent event) throws IOException {
		sgt.nextScene2(event, "/application/ChatList.fxml");
	}

	@FXML
	void sendMessage(MouseEvent event) {
		String messageText = writeChat.getText();

		if (!messageText.isEmpty()) {
			// 새로운 텍스트 노드 생성
			Text messageNode = new Text(messageText);

			// 새로운 메시지를 ChatField에 추가
//			ChatField.getChildren().add(messageNode);
			ChatField.appendText(messageText + "\n");

			// 입력 필드 비우기
			writeChat.clear();
		}
	}

}
