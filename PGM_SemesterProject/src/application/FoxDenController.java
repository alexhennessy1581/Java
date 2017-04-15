// ********************************************************************************************
// Author: Alex Hennessy
// Section: CSCI 136-01
// File: PGM_SemesterProject.java
// Date: 12/7/20153
// Purpose: PGM_SemesterProject - FoxDenController: controller for the Java FX - FoxDen.fxml
// Code Integrity:
// I certify that this program is my own source code.
// I received help from: Austin Mahler
// in the design, construction, and debugging of this source code.
// ********************************************************************************************

package application;

import java.awt.TextArea;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FoxDenController 
{

	@FXML
	private TabPane TabPanel;

	@FXML
	private ImageView logomain;

	@FXML
	private TextField phonefill;

	@FXML
	private TextArea address;

	@FXML
	private Button submit;

	@FXML
	private Tab WelcomeTab;

	@FXML
	private Tab LibraryTab;

	@FXML
	private TextField addressfill;

	@FXML
	private ImageView lightlogo;

	@FXML
	private TextField zipcodefill;

	@FXML
	private TextArea librarylist;

	@FXML
	private ImageView greenbox1;

	@FXML
	private ImageView white4;

	@FXML
	private ImageView darklogo;

	@FXML
	private TextArea zipcode;

	@FXML
	private ImageView white3;

	@FXML
	private ImageView white2;

	@FXML
	private ImageView whte1;

	@FXML
	private ImageView greenbox2;

	@FXML
	private TextField namefill;

	@FXML
	private Tab FoxPupTab;

	@FXML
	private TextArea phone;

	@FXML
	private TextArea intro;

	@FXML
	private TextArea name;

	public class WelcomePupController 
	{

		@FXML
		private Button exit;

		@FXML
		private TextArea message;

		@FXML
		private Pane welcomepup;

		@FXML
		private ImageView blacklogo;

		void exit()
		{
			Stage stage0 = (Stage) exit.getScene().getWindow();
		}

		void goToNewWindow() throws Exception
		{
			Stage stage0 = (Stage) submit.getScene().getWindow();
			stage0.close();

			try
			{
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WelcomePup.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage1 = new Stage();
				stage1.setTitle("Welcome New Pup");
				stage1.setScene(new Scene(root1));
				stage1.show();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
