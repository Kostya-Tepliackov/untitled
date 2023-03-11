package Lesson17;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class poshtbox {
    public static void main(String[] args){
       List<Postbox> postBoxLinkedList = new LinkedList<>();
        postBoxLinkedList.add(new Postbox(20, 120, 40, 10));
        postBoxLinkedList.add(new Postbox(40, 60, 200, 50));
        postBoxLinkedList.add(new Postbox(70, 80, 80, 2));
        postBoxLinkedList.add(new Postbox(200, 5, 70, 5));
        postBoxLinkedList.add(new Postbox(30, 200, 500, 15));
        postBoxLinkedList.add(new Postbox(50, 68, 20, 18));
        postBoxLinkedList.add(new Postbox(65, 45, 15, 1));
        postBoxLinkedList.add(new Postbox(38, 837, 67, 2));
        postBoxLinkedList.add(new Postbox(150, 5, 99, 7));
        postBoxLinkedList.add(new Postbox(178, 30, 78, 120));


    }
}
