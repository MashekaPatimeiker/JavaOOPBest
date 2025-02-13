package com.example.demo1;

import com.example.demo1.javataskclasses.*;
import com.example.demo1.javataskclasses.Shapes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Shapes line = new LineShape(100, 100, 200, 50, Color.RED);
        Shapes ellipse = new EllipseShape(300, 150, 80, 50, Color.RED);
        root.getChildren().addAll(line.draw(), ellipse.draw());
        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Простейшие фигуры");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
