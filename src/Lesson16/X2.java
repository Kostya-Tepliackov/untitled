package Lesson16;

import java.io.BufferedReader;
import java.util.ArrayList;

public class X2 {
    public static void main(String[] args)  {
        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("Hey!");
        arraylist.add("This");
        arraylist.add(0, "Is");
        arraylist.add("my");
        arraylist.add("first");
        arraylist.add("list!");

        for (int i = 0; i < arraylist.size(); i++)
            System.out.println(arraylist.get(i));
    }

    }

