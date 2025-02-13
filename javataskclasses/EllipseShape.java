package com.example.demo1.javataskclasses;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class EllipseShape extends Shapes {
    private double centerX, centerY, radiusX, radiusY;
    private Color color;

    public EllipseShape(double centerX, double centerY, double radiusX, double radiusY, Color color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.color = color;
    }

    @Override
    public javafx.scene.shape.Shape draw() {
        Ellipse ellipse = new Ellipse(centerX, centerY, radiusX, radiusY);
        ellipse.setFill(color);
         setJavaFXShape(ellipse);
        return ellipse;
    }
}
