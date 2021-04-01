import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import static javafx.application.Application.launch;


public class SquareSpiral extends Application {

    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root,400,400);
        double centerX = scene.getWidth()/2;
        double centerY = scene.getHeight()/2;


        //Десни вертикални линии

        double x1_firstVertical = 0;
        double y1_firstVertical = 0;
        double x2_firstVertical = 0;
        double y2_firstVertical = 30;
        int countRightVertical = 0;

        while(countRightVertical < 5)
        {

            Line myLine = new Line(centerX + x1_firstVertical, centerY + y1_firstVertical, centerX - x2_firstVertical, centerY + y2_firstVertical);
            myLine.setStroke(Color.RED);
            root.getChildren().add(myLine);
            x1_firstVertical += 30;
            y1_firstVertical -= 30;
            x2_firstVertical -= 30;
            y2_firstVertical += 30;
            countRightVertical++;
        }

        // Леви вертикални линии

        int countLeftVertical = 0;

        double x1_leftVertical = 0;
        double y1_leftVertical = 0;
        double x2_leftVertical = 0;
        double y2_leftVertical = 0;

        while(countLeftVertical < 5)
        {
            Line leftVerticalLine = new Line(centerX - 30 - x1_leftVertical, centerY - 30 - y1_leftVertical, centerX - 30 - x2_leftVertical, centerY + 30 + y2_leftVertical);
            leftVerticalLine.setStroke(Color.RED);
            root.getChildren().add(leftVerticalLine);

            x1_leftVertical += 30;
            y1_leftVertical += 30;
            x2_leftVertical += 30;
            y2_leftVertical += 30;

            countLeftVertical++;
        }

        // Долни хоризонтални линии

        int countDownHorizontal = 0;

        double x1_downHorizontal = 0;
        double y1_downHorizontal = 0;
        double x2_downHorizontal = 0;
        double y2_downHorizontal = 0;

        while(countDownHorizontal < 5)
        {
            Line downHorizontalLine = new Line(centerX - 30 - x1_downHorizontal, centerY + 30 + y1_downHorizontal, centerX - x2_downHorizontal, centerY + 30 + y2_downHorizontal);
            downHorizontalLine.setStroke(Color.RED);
            root.getChildren().add(downHorizontalLine);

            x1_downHorizontal += 30;
            y1_downHorizontal += 30;
            x2_downHorizontal -= 30;
            y2_downHorizontal += 30;

            countDownHorizontal++;
        }

        //Горни хоризонтални линии

        int countUpHorizontal = 0;

        double x1_upHorizontal = 0;
        double y1_upHorizontal = 0;
        double x2_upHorizontal = 0;
        double y2_upHorizontal = 0;

        while(countUpHorizontal < 5)
        {
            Line upHorizontalLine = new Line(centerX - 30 - x1_upHorizontal, centerY - 30 - y1_upHorizontal, centerX + 30 + x2_upHorizontal, centerY - 30 - y2_upHorizontal);
            upHorizontalLine.setStroke(Color.RED);
            root.getChildren().add(upHorizontalLine);

            x1_upHorizontal += 30;
            y1_upHorizontal += 30;
            x2_upHorizontal += 30;
            y2_upHorizontal += 30;

            countUpHorizontal++;
        }

        primaryStage.setTitle("Square Spiral");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
