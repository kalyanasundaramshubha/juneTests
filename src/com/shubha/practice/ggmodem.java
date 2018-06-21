package com.shubha.practice;

import com.shubha.practice.*;



public class ggmodem {
    public static void main(String[]arguments){
        cableModem cm = new cableModem();
        dslModem dsl=new dslModem();
        commodoremodem cd= new commodoremodem();
        cm.speed =2000;
        cm.displayspeed();
        cm.connect();
        cm.disconnect();
        dsl.speed=3000;
        dsl.displayspeed();
        dsl.connect();
        dsl.disconnect();

    }
}
