package com.example.demo1.javataskclasses;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;

public class PolylineShape extends Shapes {
    private double[] points;
    private Color color;

    public PolylineShape(double[] points, Color color) {
        this.points = points;
        this.color = color;
    }

    @Override
    public javafx.scene.shape.Shape draw() {
        Polyline polyline = new Polyline(points);
        polyline.setStroke(color);
        polyline.setStrokeWidth(3);
        setJavaFXShape(polyline);
        return polyline;
    }

    @Override
    protected void resize(double deltaX, double deltaY) {
        int lastIndex = points.length - 2;
        points[lastIndex] += deltaX;
        points[lastIndex + 1] += deltaY;
        Polyline polyline = (Polyline) javafxShape;
        polyline.getPoints().clear();
        for (double point : points) {
            polyline.getPoints().add(point);
        }
    }
}
