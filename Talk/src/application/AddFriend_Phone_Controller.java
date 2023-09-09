package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class AddFriend_Phone_Controller {
	
	private Singleton sgt = Singleton.getInstance(); // 싱글톤

    @FXML
    private ImageView GoBack;

    @FXML
    private TextField InputName;

    @FXML
    private TextField InputPhoneNumber;

    @FXML
    private Button SaveByPhone;
    
    @FXML
    private Text Cancle;
    
    @FXML
    private Text Ok;
    
    @FXML
    private Pane PopupSign;

    @FXML
    private Pane PopupBack2;


    @FXML
    void gotoFriendList(MouseEvent event) throws IOException {
    	sgt.nextScene2(event, "/application/FriendList.fxml");
    }
    
    @FXML
    void CallPopup(MouseEvent event) throws IOException {
    	PopupSign.setVisible(true);
        PopupBack2.setVisible(true);
    }
    
    @FXML
    void Close_Popup(MouseEvent event) {
    	PopupSign.setVisible(false);
        PopupBack2.setVisible(false);
    }

}
