package daniel_juin;





import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class qwe extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		
		//int x=0, res=0;
		
		
		Group group = new Group();
		Scene scene = new Scene(group, 400, 400);
		
		Label label1 = new Label ();
		
		label1.setTranslateX(50);
		label1.setTranslateY(200);
		
		Label label2 = new Label ();
		
		label2.setTranslateX(125);
		label2.setTranslateY(200);
		
		TextField txt1 = new TextField ();
		txt1.setPrefWidth(100);
		txt1.setPrefHeight(20);
		txt1.setLayoutX(20);
		txt1.setLayoutY(50);
		
		Label label3 = new Label ("+");
		
		label3.setTranslateX(100);
		label3.setTranslateY(200);
		
		Label label4 = new Label ("=");
		
		label4.setTranslateX(200);
		label4.setTranslateY(200);
		
		Label label5 = new Label ("=");
		
		label5.setTranslateX(250);
		label5.setTranslateY(200);
		
		
		
		
		

		
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
			
			 //res= (Integer.parseInt(txt1.getText()));
			
			//String temp = label1.getText(); 
			//int temp1 = Integer.parseInt(temp);
			//System.out.println(temp1);
			//label4.setText(String.format("%.4f",res+x));
			
		});
		
		
    	
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(label1);
		group.getChildren().add(label2);
		group.getChildren().add(label3);
		group.getChildren().add(label4);
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

	public static void main(String[] args) {
		launch(args);
		
		
	}
}
