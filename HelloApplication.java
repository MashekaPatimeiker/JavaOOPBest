package com.example.demo1;

import com.example.demo1.javataskclasses.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        root.setStyle("-fx-background-color: #499349;");
        Shapes line = new LineShape(50, 50, 200, 50, Color.RED);
        Shapes ellipse = new EllipseShape(300, 100, 80, 50, Color.RED);
        Shapes triangle = new TriangleShape(150, 250, 200, 350, 100, 350, Color.RED);
        Shapes rectangle = new RectangleShape(400, 50, 120, 80, Color.RED);
        Shapes polyline = new PolylineShape(new double[]{250, 250, 300, 300, 350, 250}, Color.RED);

        root.getChildren().addAll(line.draw(), ellipse.draw(), triangle.draw(), rectangle.draw(), polyline.draw());

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Figures");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
