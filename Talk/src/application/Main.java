package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		try {
			// 로그인 화면
			Parent root = FXMLLoader.load(getClass().getResource("/application/FriendList.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}

	public Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}

	public static void main(String[] args) {
		launch();
	}

}
