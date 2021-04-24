package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class Practical19 extends Application
{
@Override
public void start(Stage primaryStage)
{
double width = 450;
double height = 450;
Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 
10, Color.BLUE);
c.setStroke(Color.WHITE);
StackPane pane = new StackPane(c);
primaryStage.setScene(new Scene(pane, width, height));
pane.setOnMousePressed(e -> c.setFill(Color.RED));
pane.setOnMouseReleased(e -> c.setFill(Color.BLUE));
primaryStage.setTitle("190130107118-Param_4B2-Practical-19");
primaryStage.show();
}
public static void main(String[] args) {
Application.launch(args);
}
}