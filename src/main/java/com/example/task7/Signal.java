package com.example.task7;

import javafx.scene.control.Label;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

public class Signal  implements IObserver {
    Text txt = new Text();
    Label lbl = new Label(); //старый не работающий способ

    private int counter = 0;
    public Signal(){
    }
    @Override
    public void update() {
        counter++;
        lbl.setText(""+counter);//старый не работающий способ

        txt.setText(""+ counter);

    }
}
