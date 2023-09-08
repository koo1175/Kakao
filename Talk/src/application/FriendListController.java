package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FriendListController {

	private Singleton sgt = Singleton.getInstance();
	
	@FXML
    private ImageView gotoChattinglist;
	
    @FXML
    private ImageView OpenChat;

    @FXML
    void gotoChattingList(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/Chatroom.fxml");
    }
    
    @FXML
    void gotoOpenChat(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "OpenChatting.fxml");
    }
    
}
