package eu.hansolo.colors;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Demo extends Application {

    @Override public void init() {

    }

    @Override public void start(final Stage stage) {
        StackPane pane = new StackPane(new Label("Test"));
        pane.setPadding(new Insets(10));

        Scene scene = new Scene(pane);

        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();

    }
}
