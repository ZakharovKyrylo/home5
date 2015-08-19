package org.sourceit.zakharov.home05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

//        ArrayList<Integer> intList = new ArrayList<>();
        Random random = new Random();


        // int to List
        int[] ints = new int[10];
        for (int i = 0; i<ints.length ; i++){
//            ints[i]=i;
            ints[i]=random.nextInt(100);
        }
        Test test = new Test();
        System.out.println(test.intArrayList(ints));
        System.out.println(test.intLinkedList(ints));

    }
}

class  Test{
    public ArrayList<Integer> intArrayList(int[] ob){
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i =0; i<ob.length ; i++){
            intList.add(ob[i]);
        }
        return intList;
    }

    public LinkedList<Integer> intLinkedList(int[] ob){
        LinkedList<Integer> intList = new LinkedList<>();
        for (int i =0; i<ob.length ; i++){
            intList.addLast(ob[i]);
        }
        return intList;
    }
}
