package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JavaFXHttpPost extends Application {

	public static void main(String[] args) {
		 launch(args);

	} 
	 @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("JavaFX HTTP POST Example");

	        // JavaFX UI 요소 생성
	        Button sendButton = new Button("Send POST Request");
	        VBox vbox = new VBox(sendButton);

	        // 버튼 클릭 이벤트 핸들러
	        sendButton.setOnAction(event -> {
	            sendHttpPostRequest();
	        });

	        // Scene 생성
	        Scene scene = new Scene(vbox, 300, 200);
	        primaryStage.setScene(scene);

	        // 애플리케이션 창 표시
	        primaryStage.show();
	    }

	    private void sendHttpPostRequest() {
	        try {
	            // 요청을 보낼 URL 설정
	            URL url = new URL("http://localhost:8080/user/post"); // Node.js 서버의 URL로 변경

	            // HttpURLConnection 객체 생성
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // POST 요청 설정
	            connection.setRequestMethod("POST");
	            connection.setDoOutput(true);

	            // 보낼 데이터 준비
	            int intValue = 42; // 보내려는 int 값
	            String postData = "id=a@a.com&pw=123123&name=youngsil&age=" + intValue; // 원하는 데이터 포맷으로 변경
	            byte[] postDataBytes = postData.getBytes(StandardCharsets.UTF_8);

	            // 데이터를 서버로 전송
	            try (OutputStream os = connection.getOutputStream()) {
	                os.write(postDataBytes);
	                os.flush();
	            }

	            // 응답 코드 확인
	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);

	            // 연결 종료
	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
