package com.example.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimeServer implements Subject{
    private final Timer timer;
    private final TimerTask task;
    private int timeState = 0;

    List<IObserver> observers = new ArrayList<IObserver>();



    private void tick(){
        timeState++;
        notifyAllObserver();

    }
    public TimeServer(){
        this.timer = new Timer();
        task = new TimerTask(){
            public void run(){
                tick();
            }
        };
        timer.schedule(task, 100, 700);//скорость отсчета
    }


    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observers) {
            observer.update();

        }
        System.out.println("Время TimeServer:"+ timeState);
    }

    @Override
    public void attach(IObserver obs) {
        observers.add(obs);

    }

    @Override
    public void detach(IObserver obs) {
        observers.remove(obs);
    }
}
