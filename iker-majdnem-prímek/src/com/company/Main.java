package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //nemmmüködik még ez a program
        int n=10;
        int s=0;
        ArrayList<Integer> prímek = new ArrayList<Integer>();
        prímek.add(2);
        for (int i=3; i<=n/2; i++)
        {
            int j=0;
            while(i%prímek.get(j)!=0&&j<prímek.size()-1) j++;
            if(i%prímek.get(j)==0) prímek.add(i);
        }
        for(int i=1; i<=n; i++)
        {
            int j=0;
            while(i%prímek.get(j)!=0&&j<prímek.size()-1) j++;
            if(i%prímek.get(j)==0)
            {
                int a=i/prímek.get(j);
                int k=0;
                while(a!=prímek.get(k)&&k<prímek.size()-1) k++;
                if(a==prímek.get(k))
                {
                    s++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(s);
    }
}
