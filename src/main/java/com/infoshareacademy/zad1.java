package com.infoshareacademy;


public class zad1 {
    public static void main(String[] args) {

        InterfaceFunc func1 = () -> System.out.println("helo");
        func1.add();
        InterfaceFunc func2 = () -> System.out.println("Nowa lambda");
        func2.add();


    }
}
