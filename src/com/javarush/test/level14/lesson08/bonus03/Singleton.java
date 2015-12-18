package com.javarush.test.level14.lesson08.bonus03;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {}

    public static Singleton getInstance(){
        return INSTANCE;
    }

    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}
