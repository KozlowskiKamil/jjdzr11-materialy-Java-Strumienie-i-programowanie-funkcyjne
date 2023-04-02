package com.infoshareacademy;

public class Main {
    public static void main(String[] args) {

        MyFuncInterface myFuncInterface = (aa, bb) -> System.out.println("aa = " + (aa + bb));

//        myFuncInterface.run(2,3);


        test(myFuncInterface);
    }

    public static void test(MyFuncInterface myFuncInterface) {
        myFuncInterface.run(2, 3);

    }
}
