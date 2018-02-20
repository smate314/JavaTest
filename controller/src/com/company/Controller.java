package com.company;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Button> buttons;

    public Controller(ArrayList<Button> buttons)
    {
        this.buttons=buttons;
    }

    public void addButton(Button b)
    {
        buttons.add(b);
    }

    public void pressAll()
    {
        for(int i=0; i<buttons.size(); i++)
        {
            buttons.get(i).setState(true);
        }
    }

    public void releaseAll()
    {
        for(int i=0; i<buttons.size(); i++)
        {
            buttons.get(i).setState(false);
        }
    }

    public int getNumOfPressedBtns()
    {
        int r=0;
        for(int i=0; i<buttons.size(); i++)
        {
            if(buttons.get(i).getState()) r++;
        }
        return r;
    }
}
