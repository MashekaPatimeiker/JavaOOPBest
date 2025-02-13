package com.example.demo1.javataskclasses;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleShape extends Shapes {
    private double x, y, width, height;
    private Color color;

    public RectangleShape(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public javafx.scene.shape.Shape draw() {
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setFill(color);
        setJavaFXShape(rectangle);
        return rectangle;
    }

    @Override
    protected void resize(double deltaX, double deltaY) {
        width += deltaX;
        height += deltaY;

        Rectangle rectangle = (Rectangle) javafxShape;
        rectangle.setWidth(width);
        rectangle.setHeight(height);
    }
}
