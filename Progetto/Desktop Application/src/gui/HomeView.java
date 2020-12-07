package gui;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.fxml.*;
import javafx.scene.web.WebView;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.*;

public class HomeView extends Application{
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage stage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("SkateSpot");
		stage.setScene(scene);
		stage.show();
	}
}
