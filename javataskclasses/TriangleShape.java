package com.example.demo1.javataskclasses;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class TriangleShape extends Shapes {
    private double x1, y1, x2, y2, x3, y3;
    private Color color;

    public TriangleShape(double x1, double y1, double x2, double y2, double x3, double y3, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.color = color;
    }

    @Override
    public javafx.scene.shape.Shape draw() {
        Polygon triangle = new Polygon(x1, y1, x2, y2, x3, y3);
        triangle.setFill(color);
        setJavaFXShape(triangle);
        return triangle;
    }

    @Override
    protected void resize(double deltaX, double deltaY) {
        x3 += deltaX;
        y3 += deltaY;

        Polygon triangle = (Polygon) javafxShape;
        triangle.getPoints().setAll(x1, y1, x2, y2, x3, y3);
    }
}
