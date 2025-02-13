package com.example.demo1.javataskclasses;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public abstract class Shapes {
    protected Shape javafxShape;
    private boolean resizing = false;
    private double mouseX, mouseY;
    public abstract javafx.scene.shape.Shape draw();
    protected void resize(double deltaX, double deltaY) {}

    private void addResizeHandlers() {
        if (javafxShape != null) {
            javafxShape.setOnMousePressed(this::onMousePressed);
            javafxShape.setOnMouseDragged(this::onMouseDragged);
            javafxShape.setOnMouseReleased(event -> resizing = false);
        }
    }
    private void onMousePressed(MouseEvent event) {
        mouseX = event.getSceneX();
        mouseY = event.getSceneY();
        if (isOnBorder(event)) {
            resizing = true;
        }
    }
    private void onMouseDragged(MouseEvent event) {
        if (resizing) {
            double deltaX = event.getSceneX() - mouseX;
            double deltaY = event.getSceneY() - mouseY;

            resize(deltaX, deltaY);

            mouseX = event.getSceneX();
            mouseY = event.getSceneY();
        }
    }

    private boolean isOnBorder(MouseEvent event) {
        double border = 10;
        double x = event.getX();
        double y = event.getY();

        return (x <= border || x >= javafxShape.getBoundsInLocal().getWidth() - border ||
                y <= border || y >= javafxShape.getBoundsInLocal().getHeight() - border);
    }

    protected void setJavaFXShape(Shape shape) {
        this.javafxShape = shape;
        addResizeHandlers();
    }

}
