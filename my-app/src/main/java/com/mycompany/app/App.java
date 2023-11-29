package com.mycompany.app;

import main.java.com.mycompany.app.Duck;
import main.java.com.mycompany.app.MallordDuck;
import main.java.com.mycompany.app.Turkey;
import main.java.com.mycompany.app.WildTurkey;

public class App
{
    public static void main( String[] args )
    {
        Duck mallord = new MallordDuck();
        Turkey wildTurkey = new WildTurkey();

        mallord.quack();
        wildTurkey.gobble();
    }
}
