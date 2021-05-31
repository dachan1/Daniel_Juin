package daniel_juin;



import java.awt.Label;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class qwe extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		Group group = new Group();
		Scene scene = new Scene(group, 400, 400);
		TextField txt1 = new TextField ();
		txt1.setPrefWidth(100);
		txt1.setPrefHeight(20);
		txt1.setLayoutX(20);
		txt1.setLayoutY(50);
		
		Label lbl1= new Label();
		lbl.With(20);
		lbl1.setPrefHeight(20);
		txt1.setLayoutX(20);
		txt1.setLayoutY(50);
		

		
		TextField txt2 = new TextField ();
		txt2.setPrefWidth(100);
		txt2.setPrefHeight(20);
		txt2.setLayoutX(150);
		txt2.setLayoutY(50);
		
	
		
		TextField txt3 = new TextField ();
		
		txt3.setPrefWidth(100);
		txt3.setPrefHeight(20);
		txt3.setLayoutX(270);
		txt3.setLayoutY(50);
		
		txt1.textProperty().addListener((observable, oldValue, newValue)->
		{
			int c= Integer.parseInt(newValue);
		});
		
		txt2.textProperty().addListener((observable, oldValue, newValue)->
		{
			int d= Integer.parseInt(newValue);
		});
		
		
		txt3.textProperty().addListener((observable, oldValue, newValue)->
		{
			
		});
		
		
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(txt3);
		
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		
		
	}
}
