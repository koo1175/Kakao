package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AddChatFriendListController {

	private Singleton sgt = Singleton.getInstance(); // 싱글톤
	
    @FXML
    private ImageView Back;

    @FXML
    private Text Done;

    @FXML
    private TextField SearchBar;

    @FXML
    void gotoChattingList(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/ChattingList.fxml");
    }

    @FXML
    void gotoChatRoom(MouseEvent event) throws IOException {
    	//sgt.nextScene2(event, "/application/ChatRoom.fxml");
    }
    
    @FXML
	//처음에 검색 불가능
	public void initialize() {
		SearchBar.setEditable(false);
	} 
	
	@FXML
    void toWrite(MouseEvent event) throws IOException {
		SearchBar.setEditable(true);
    }

}