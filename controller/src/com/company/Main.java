package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList a =new ArrayList<Button>();
        Controller ctrl = new Controller(a);
        Button b1= new Button("A",true);
        Button b2= new Button("B",false);
        Button b3= new Button("X", false);
        Button b4= new Button("Y", true);
        ctrl.addButton(b1);
        ctrl.addButton(b2);
        ctrl.addButton(b3);
        ctrl.addButton(b4);
        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
        ctrl.pressAll();
        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
        ctrl.releaseAll();
        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
    }
}
