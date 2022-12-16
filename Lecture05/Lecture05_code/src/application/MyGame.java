package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyGame extends Application {

	@Override
	public void start(Stage primaryStage) {
		// 1) scene graph ของทั้งหมดในฉาก
		Button btn = new Button("Hello World");
		FlowPane root = new FlowPane(); //พื้นหลัง
		root.getChildren().add(btn); //ใส่ปุ่มบนพื้นหลัง
		TextField tf = new TextField();
		root.getChildren().add(tf);
		
		btn.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				// TODO Auto-generated method stub
				System.out.println("Clicked!!");
			}
		});
		
		tf.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println(tf.getText());
			}
		});
		// 2) สร้างฉาก
		Scene scene = new Scene(root,300,250); //สร้างฉากหลัง 300*250
		
		// 3) จัดการ stage
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
