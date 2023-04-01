package com.infoshareacademy;


public class zad1 {
    public static void main(String[] args) {

        InterfaceFunc interfaceFunc = () -> System.out.println("helo");
        interfaceFunc.add();
        InterfaceFunc interfaceFunc2 = () -> System.out.println("2 hello");
        interfaceFunc2.add();


    }
}
