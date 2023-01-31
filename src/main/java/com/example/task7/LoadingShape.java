package com.example.task7;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

public class LoadingShape implements IObserver{

    public LoadingShape(){
    }
    Rectangle sqr = new Rectangle();
    Text txt = new Text();

    private int counterX = 0;

    @Override
    public void update() {
        sqr.setX(counterX);
        sqr.setY(counterX);
        counterX++;
        txt.setText(" "+ counterX+"%");

        sqr.setStroke(Color.GREEN);
        sqr.setFill(Color.GREEN);
        sqr.setStrokeWidth(2);
        sqr.setWidth(counterX);
        sqr.setHeight(30);

    }
}
