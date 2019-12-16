import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main( String[] args ) {
        launch();
    }

    public void start( Stage stage ) throws Exception {
        String javaVersion = System.getProperty("java.version");
        String javaFxVersion = System.getProperty("javafx.version");

        Label label = new Label(javaVersion+" "+javaFxVersion);
        Scene scene = new Scene(new StackPane(label), 720, 540);
        stage.setTitle("JavaFx Application");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();    }
}
