package Lesson16;

import java.util.ArrayList;

public class x3 {
    public static void main(String[] args){
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Hey!");
        arraylist.add("This");
        arraylist.add("is");
        arraylist.add("my");
        arraylist.add("first");
        arraylist.add("list!");
        arraylist.add(0, "list");
        arraylist.remove(6);

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
    }
}
