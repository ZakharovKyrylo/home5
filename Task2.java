package org.sourceit.zakharov.home05;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();


        // int to List
        int[] ints = new int[10];
        long[] longs = new long[10];
        boolean[] booleans = new boolean[10];
        double[] doubles = new double[10];
        String[] strings = new String[]{"1word", "2word", "3word", "4word", "5word"};
        Auto[] autos = {new Auto("1type", 1992, "red"),
                new Auto("2type", 1998, "red"),
                new Auto("3type", 2004, "red"),
                new Auto("1type", 1998, "blue"),
                new Auto("2type", 2000, "red")};


        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
            longs[i] = random.nextLong();
            doubles[i] = random.nextDouble();
            booleans[i] = random.nextBoolean();
        }

        IntTo test = new IntTo();

        System.out.println("ArrayList - " + test.intArrayList(ints));
        System.out.println("inkedList - " + test.intLinkedList(ints));
        System.out.println("HashSet   - " + test.intHashSet(ints));
        System.out.println("TreeSet   - " + test.intTreeSet(ints));
        System.out.println("Queue     - " + test.intQueue(ints));
        System.out.println("Deque     - " + test.intDeque(ints));
    }
}

class IntTo {
    public ArrayList<Integer> intArrayList(int[] ob) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < ob.length; i++) {
            intList.add(ob[i]);
        }
        return intList;
    }

    public LinkedList<Integer> intLinkedList(int[] ob) {
        LinkedList<Integer> intList = new LinkedList<>();
        for (int i = 0; i < ob.length; i++) {
            intList.addLast(ob[i]);
        }
        return intList;
    }

    public HashSet<Integer> intHashSet(int[] ob) {
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 0; i < ob.length; i++) {
            intSet.add(ob[i]);
        }
        return intSet;
    }

    public TreeSet<Integer> intTreeSet(int[] ob) {
        TreeSet<Integer> intTree = new TreeSet<>();
        for (int i = 0; i < ob.length; i++) {
            intTree.add(ob[i]);
        }
        return intTree;
    }

    public Queue<Integer> intQueue(int[] ob) {
        Queue<Integer> intQ = new PriorityQueue<>();
        for (int i = 0; i < ob.length; i++) {
            intQ.add(ob[i]);
        }
        return intQ;
    }

    public Deque<Integer> intDeque(int[] ob) {
        Deque<Integer> intD = new ArrayDeque<>();
        for (int i = 0; i < ob.length; i++) {
            intD.add(ob[i]);
        }
        return intD;
    }
}
