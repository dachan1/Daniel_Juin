package daniel_juin;





import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class qwe extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		Group group = new Group();
		Scene scene = new Scene(group, 400, 400);
		
		Label label1 = new Label ();
		
		label1.setTranslateX(150);
		label1.setTranslateY(200);
		
		Label label2 = new Label ();
		
		label2.setTranslateX(300);
		label2.setTranslateY(200);
		
		TextField txt1 = new TextField ();
		txt1.setPrefWidth(100);
		txt1.setPrefHeight(20);
		txt1.setLayoutX(20);
		txt1.setLayoutY(50);
		
		
		
		
		

		
		TextField txt2 = new TextField ();
		txt2.setPrefWidth(100);
		txt2.setPrefHeight(20);
		txt2.setLayoutX(150);
		txt2.setLayoutY(50);
		
	
		
		
		txt1.textProperty().addListener((observable, oldValue, newValue)->
		{
			label1.textProperty().bind(txt1.textProperty());
		});
		
		txt2.textProperty().addListener((observable, oldValue, newValue)->
		{
			label2.textProperty().bind(txt2.textProperty());
		});
		
		
		
		
		
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(label1);
	
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

	public static void main(String[] args) {
		launch(args);
		
		
	}
}
