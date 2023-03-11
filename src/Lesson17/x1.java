package Lesson17;

import java.util.LinkedList;
import java.util.Queue;

public class x1 {
        public static void main(String args[]){
            Queue<String> queue = new LinkedList<>();
            queue.offer("LONDON");
            queue.offer("MANCHESTER");
            queue.offer("LIVERPOOL");
            queue.offer("BRIGHTON");

            System.out.println(queue.peek());
            System.out.println();

            String queueue;
            while ((queueue = queue.poll()) !=null) {
                System.out.print(queueue);
            }

        }
    }


