package com.example.demo1.javataskclasses;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public abstract class Shapes {
    protected Shape javafxShape;
    public abstract javafx.scene.shape.Shape draw();
    public void Shape() {
        addHoverEffect();
    }
    private void addHoverEffect() {
        if (javafxShape != null) {
            javafxShape.setOnMouseEntered(event -> javafxShape.setFill(Color.BLACK));
            javafxShape.setOnMouseExited(event -> javafxShape.setFill(Color.RED));
        }
    }
    protected void setJavaFXShape(Shape shape) {
        this.javafxShape = shape;
        addHoverEffect();
    }

}
