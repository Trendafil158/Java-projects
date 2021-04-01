import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class ReproducingDrawing extends Application {
    public void start(Stage primaryStage)
    {
        Group root=new Group();
        int count=0;
        int x=30;
        QuadCurve quadCurve = new QuadCurve();
        quadCurve.setStartX(0.0);
        quadCurve.setStartY(0.0);
        quadCurve.setEndX(x);
        quadCurve.setEndY(600.0);
        quadCurve.setControlX(0.0);
        quadCurve.setControlY(600.0);
        quadCurve.setFill(null);
        quadCurve.setStroke(Color.BROWN);
        root.getChildren().add(quadCurve);

        /*
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(0.0);
            quadCurve.setStartY(0.0);
            quadCurve.setEndX(x);
            quadCurve.setEndY(600.0);
            quadCurve.setControlX(0.0);
            quadCurve.setControlY(600.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+10;
        }

        count=0;
        x=30;
        while (count<20){
            QuadCurve quadCurve1 = new QuadCurve();
            quadCurve1.setStartX(0.0);
            quadCurve1.setStartY(0.0);
            quadCurve1.setEndX(600.0);
            quadCurve1.setEndY(x);
            quadCurve1.setControlX(600.0);
            quadCurve1.setControlY(0.0);
            quadCurve1.setFill(null);
            quadCurve1.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve1);
            count++;
            x=x+30;
        }
        count=0;
        x=30;
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(0.0);
            quadCurve.setStartY(600.0);
            quadCurve.setEndX(x);
            quadCurve.setEndY(0.0);
            quadCurve.setControlX(0.0);
            quadCurve.setControlY(0.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+30;
        }
        count=0;
        x=30;
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(0.0);
            quadCurve.setStartY(600.0);
            quadCurve.setEndX(600.0);
            quadCurve.setEndY(x);
            quadCurve.setControlX(600.0);
            quadCurve.setControlY(600.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+30;
        }
        count=0;
        x=30;
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(600.0);
            quadCurve.setStartY(600.0);
            quadCurve.setEndX(600-x);
            quadCurve.setEndY(0);
            quadCurve.setControlX(600.0);
            quadCurve.setControlY(0.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+30;
        }
        count=0;
        x=30;
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(600.0);
            quadCurve.setStartY(0.0);
            quadCurve.setEndX(0);
            quadCurve.setEndY(600-x);
            quadCurve.setControlX(0.0);
            quadCurve.setControlY(0.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+30;
        }
        count=0;
        x=30;
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(600.0);
            quadCurve.setStartY(0.0);
            quadCurve.setEndX(600-x);
            quadCurve.setEndY(600.0);
            quadCurve.setControlX(600.0);
            quadCurve.setControlY(600.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+30;
        }
        count=0;
        x=30;
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(600.0);
            quadCurve.setStartY(0.0);
            quadCurve.setEndX(600-x);
            quadCurve.setEndY(600.0);
            quadCurve.setControlX(600.0);
            quadCurve.setControlY(600.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+30;
        }
        count=0;
        x=30;
        while (count<20) {
            QuadCurve quadCurve = new QuadCurve();
            quadCurve.setStartX(600.0);
            quadCurve.setStartY(600.0);
            quadCurve.setEndX(0.0);
            quadCurve.setEndY(600.0-x);
            quadCurve.setControlX(0.0);
            quadCurve.setControlY(600.0);
            quadCurve.setFill(null);
            quadCurve.setStroke(Color.BROWN);
            root.getChildren().add(quadCurve);
            count++;
            x=x+30;
        } */

        primaryStage.setTitle("Canvas demo");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
