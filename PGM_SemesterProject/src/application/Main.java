// ***********************************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: PGM_SemesterProject.java
// Date: 12/7/20153
// Purpose: PGM_SemesterProject - Main: the base of the class for calling the Java FX elements.
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// ***********************************************************************************************

package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application
{
	public void start (Stage stage) throws Exception
	{
		Parent parent = FXMLLoader.load(getClass().getResource("application.FoxDen.fxml"));

		Scene scene = new Scene(parent);

		stage.setTitle("Fox Den");
		stage.setScene(scene);
		stage.show();
	}



	public static void main(String[] args) 
	{

		launch(args);

	}
}
