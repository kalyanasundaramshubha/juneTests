package com.shubha.practice;

class dslModem extends modem {
    public void connect(){
        System.out.println("DSL modem connection in progress\n");

    }
    public void disconnect(){
        System.out.println("Disconnecting dsl Modem\n");
    }
}
