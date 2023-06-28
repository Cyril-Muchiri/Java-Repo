package com.chief;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {


/*Calendar date=Calendar.getInstance();
date.set(Calendar.YEAR,2023);
date.set(Calendar.FEBRUARY,22);
date.set(Calendar.PM,11);*/

Timer timer=new Timer();
TimerTask timerTask=new TimerTask() {
    int counter=10;
    @Override
    public void run() {
        if (counter>0){
            System.out.println(counter +" seconds remaining!!");
            counter=counter-1;

        }else {
            System.out.println("Your time is up!!");
            timer.cancel();
        }
    }
};timer.scheduleAtFixedRate(timerTask,0,1000);

    }
}
