package com.example.demo1.javataskclasses;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class LineShape extends Shapes {
    private double startX, startY, endX, endY;
    private final Color color;

    public LineShape(double startX, double startY, double endX, double endY, Color color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
    }

    @Override
    public javafx.scene.shape.Shape draw() {
        Line line = new Line(startX, startY, endX, endY);
        line.setFill(color);
        line.setStroke(color);
        setJavaFXShape(line);
        return line;
    }
    @Override
    protected void resize(double deltaX, double deltaY) {
        endX += deltaX;
        endY += deltaY;
        Line line = (Line) javafxShape;
        line.setEndX(endX);
        line.setEndY(endY);
    }
}
