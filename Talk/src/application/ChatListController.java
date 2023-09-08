package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ChatListController {
	
	 @FXML
	    private ImageView PlusChat;

	    @FXML
	    private ImageView Reset;

	    @FXML
	    private ImageView Search;

	    @FXML
	    private ImageView Setting;

	    @FXML
	    void gotoPlusChat(MouseEvent event) {
	        try {
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/ChatRoom.fxml"));
	            Parent root = loader.load();
	            ChatRoomController controller = loader.getController();

	            Stage chatStage = new Stage();
	            chatStage.setTitle("Chat Window");
	            chatStage.setScene(new Scene(root));
	            chatStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    @FXML
	    void gotoReset(MouseEvent event) {
	    	
	    	
	    	
	    }

	    @FXML
	    void gotoSearch(MouseEvent event) {

	    }

	    @FXML
	    void gotoSetting(MouseEvent event) {

	    }

}
