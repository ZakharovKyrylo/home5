package org.sourceit.zakharov.home05;

import java.util.*;

public class Task2_2 {
    public static void main(String[] args) {

        AllToArray toArray = new AllToArray();
        Random random = new Random();
        ArrayToAll toAll = new ArrayToAll();


        //  sozdanie
        int[] ints = new int[10];
        long[] longs = new long[10];
        boolean[] booleans = new boolean[10];
        double[] doubles = new double[10];
        String[] strings = new String[]{"1word", "2word", "3word", "4word", "5word", "4word", "2word", "3word", "1word", "6word"};
        Auto[] autos = {new Auto("1type", 1992, "red"),
                new Auto("2type", 1998, "red"),
                new Auto("3type", 2004, "red"),
                new Auto("1type", 1998, "blue"),
                new Auto("2type", 2000, "red"),
                new Auto("1type", 1992, "red"),
                new Auto("2type", 1998, "red"),
                new Auto("3type", 2004, "red"),
                new Auto("1type", 1998, "blue"),
                new Auto("2type", 2000, "red")};

        // inicializacia
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
            longs[i] = random.nextLong();
            doubles[i] = random.nextDouble();
            booleans[i] = random.nextBoolean();
        }

// perevod iz massivov v kollekciy
        for (int j = 0; j < toArray.toAll.length; j++)
            for (int i = 0; i < ints.length; i++) {
                switch (j) {
                    case 0:
                        toArray.toAll[j][i] = ints[i];
                        break;
                    case 1:
                        toArray.toAll[j][i] = longs[i];
                        break;
                    case 2:
                        toArray.toAll[j][i] = doubles[i];
                        break;
                    case 3:
                        toArray.toAll[j][i] = booleans[i];
                        break;
                    case 4:
                        toArray.toAll[j][i] = strings[i];
                        break;
                    case 5:
                        toArray.toAll[j][i] = autos[i];
                        break;
                }
            }

        ArrayList[] list = new ArrayList[6];
        LinkedList[] list1 = new LinkedList[6];
        HashSet[] list2 = new HashSet[6];
        TreeSet[] list3 = new TreeSet[6];
        Queue[] list4 = new Queue[6];
        Deque[] list5 = new Deque[6];


        for (int i = 0; i < toArray.toAll.length; i++) {
            list[i] = toArray.toArrayList(toArray.toAll[i]);
            list1[i] = toArray.toLinkedList(toArray.toAll[i]);
            list2[i] = toArray.toHashSet(toArray.toAll[i]);
            list3[i] = toArray.toTreeSet(toArray.toAll[i]);
            list4[i] = toArray.toQueue(toArray.toAll[i]);
            list5[i] = toArray.toDeque(toArray.toAll[i]);
        }

// vivod rezultata
        for (int j = 0; j < toArray.toAll.length; j++) {
            System.out.println("ArrayList" + list[j] + "\nLinkedList" + list1[j] + "\nHashSet" + list2[j] +
                    "\nTreeSet" + list3[j] + "\nQueue" + list4[j] + "\nDeque" + list5[j] + "\n");
        }

//perevod iz kollekcii v massiv
        int[][] arrayToInt = new int[6][10];
        long[][] arrayToLong = new long[6][10];
        double[][] arrayToDouble = new double[6][10];
        boolean[][] arrayToBoolean = new boolean[6][10];
        String[][] arrayToString = new String[6][10];
        Auto[][] arrauToAuto = new Auto[6][10];


        arrayToInt[0] = toAll.toInt(list[0]);
        arrayToInt[1] = toAll.toInt(list1[0]);
        arrayToInt[2] = toAll.toInt(list2[0]);
        arrayToInt[3] = toAll.toInt(list3[0]);
        arrayToInt[4] = toAll.toInt(list4[0]);
        arrayToInt[5] = toAll.toInt(list5[0]);


        arrayToLong[0] = toAll.toLong(list[1]);
        arrayToLong[1] = toAll.toLong(list1[1]);
        arrayToLong[2] = toAll.toLong(list2[1]);
        arrayToLong[3] = toAll.toLong(list3[1]);
        arrayToLong[4] = toAll.toLong(list4[1]);
        arrayToLong[5] = toAll.toLong(list5[1]);


        arrayToDouble[0] = toAll.toDouble(list[2]);
        arrayToDouble[1] = toAll.toDouble(list1[2]);
        arrayToDouble[2] = toAll.toDouble(list2[2]);
        arrayToDouble[3] = toAll.toDouble(list3[2]);
        arrayToDouble[4] = toAll.toDouble(list4[2]);
        arrayToDouble[5] = toAll.toDouble(list5[2]);


        arrayToBoolean[0] = toAll.toBool(list[3]);
        arrayToBoolean[1] = toAll.toBool(list1[3]);
        arrayToBoolean[2] = toAll.toBool(list2[3]);
        arrayToBoolean[3] = toAll.toBool(list3[3]);
        arrayToBoolean[4] = toAll.toBool(list4[3]);
        arrayToBoolean[5] = toAll.toBool(list5[3]);


        arrayToString[0] = toAll.collectionToString(list[4]);
        arrayToString[1] = toAll.collectionToString(list1[4]);
        arrayToString[2] = toAll.collectionToString(list2[4]);
        arrayToString[3] = toAll.collectionToString(list3[4]);
        arrayToString[4] = toAll.collectionToString(list4[4]);
        arrayToString[5] = toAll.collectionToString(list5[4]);


        arrauToAuto[0] = toAll.toAuto(list[5]);
        arrauToAuto[1] = toAll.toAuto(list1[5]);
        arrauToAuto[2] = toAll.toAuto(list2[5]);
        arrauToAuto[3] = toAll.toAuto(list3[5]);
        arrauToAuto[4] = toAll.toAuto(list4[5]);
        arrauToAuto[5] = toAll.toAuto(list5[5]);


// vivod rezultata
        System.out.println("\narrayToInt");
        for (int i = 0; i < list[0].size(); i++) {
            System.out.println(arrayToInt[0][i] + "\t" + arrayToInt[1][i] + "\t" + arrayToInt[2][i] + "\t"
                    + arrayToInt[3][i] + "\t" + arrayToInt[4][i] + "\t" + arrayToInt[5][i]);
        }


        System.out.println("\narrayToLong");
        for (int i = 0; i < list[0].size(); i++) {
            System.out.println(arrayToLong[0][i] + "\t" + arrayToLong[1][i] + "\t" + arrayToLong[2][i] + "\t"
                    + arrayToLong[3][i] + "\t" + arrayToLong[4][i] + "\t" + arrayToLong[5][i]);
        }


        System.out.println("\narrayToDouble");
        for (int i = 0; i < list[0].size(); i++) {
            System.out.println(arrayToDouble[0][i] + "\t" + arrayToDouble[1][i] + "\t" + arrayToDouble[2][i] + "\t"
                    + arrayToDouble[3][i] + "\t" + arrayToDouble[4][i] + "\t" + arrayToDouble[5][i]);////
        }


        System.out.println("\narrayToBoolean");
        for (int i = 0; i < list[0].size(); i++) {
            System.out.println(arrayToBoolean[0][i] + "\t" + arrayToBoolean[1][i] + "\t" + arrayToBoolean[2][i] + "\t"
                    + arrayToBoolean[3][i] + "\t" + arrayToBoolean[4][i] + "\t" + arrayToBoolean[5][i]);////
        }

        System.out.println("\narrayToString");
        for (int i = 0; i < list[0].size(); i++) {
            System.out.println(arrayToString[0][i] + "\t" + arrayToString[1][i] + "\t" + arrayToString[2][i] + "\t"
                    + arrayToString[3][i] + "\t" + arrayToString[4][i] + "\t" + arrayToString[5][i]);////
        }

        System.out.println("\narrayToString");
        for (int i = 0; i < list[0].size(); i++) {
            System.out.println(arrayToString[0][i] + "\t" + arrayToString[1][i] + "\t" + arrayToString[2][i] + "\t"
                    + arrayToString[3][i] + "\t" + arrayToString[4][i] + "\t" + arrayToString[5][i]);////
        }

        System.out.println("\narrayToString");
        for (int i = 0; i < list[0].size(); i++) {
            System.out.println(arrauToAuto[0][i] + "\t" + arrauToAuto[1][i] + "\t" + arrauToAuto[2][i] + "\t"
                    + arrauToAuto[3][i] + "\t" + arrauToAuto[4][i] + "\t" + arrauToAuto[5][i]);////
        }


    }
}


//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
//                        collection to  all                        //
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////


class ArrayToAll {
    public static int[] toInt(Collection coll) {
        int[] mass = new int[10];
        Iterator iterator = coll.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            mass[i] = (int) iterator.next();
            i++;
        }
        return mass;
    }

    public static long[] toLong(Collection coll) {
        long[] mass = new long[10];
        Iterator iterator = coll.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            mass[i] = (long) iterator.next();
            i++;
        }
        return mass;
    }

    public static double[] toDouble(Collection coll) {
        double[] mass = new double[10];
        Iterator iterator = coll.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            mass[i] = (double) iterator.next();
            i++;
        }
        return mass;
    }

    public static boolean[] toBool(Collection coll) {
        boolean[] mass = new boolean[10];
        Iterator iterator = coll.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            mass[i] = (boolean) iterator.next();
            i++;
        }
        return mass;
    }


    public static String[] collectionToString(Collection coll){
        String[] mass = new String[10];
        Iterator iterator = coll.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            mass[i] = (String) iterator.next();
            i++;
        }
        return mass;
    }


    public static Auto[] toAuto(Collection coll){
        Auto[] mass = new Auto[10];
        Iterator iterator = coll.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            mass[i] = (Auto) iterator.next();
            i++;
        }
        return mass;
    }
}


//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
//                      all to collection                           //
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////

class AllToArray {

    public Object[][] toAll = new Object[6][10];


    public static <T> ArrayList<T> toArrayList(T[] ob) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < ob.length; i++) {
            arrayList.add(ob[i]);
        }
        return arrayList;
    }

    public static <T> LinkedList<T> toLinkedList(T[] ob) {
        LinkedList<T> intList = new LinkedList<>();
        for (int i = 0; i < ob.length; i++) {
            intList.addLast(ob[i]);
        }
        return intList;
    }

    public static <T> HashSet<T> toHashSet(T[] ob) {
        HashSet<T> intSet = new HashSet<>();
        for (int i = 0; i < ob.length; i++) {
            intSet.add(ob[i]);
        }
        return intSet;
    }

    public static <T> TreeSet<T> toTreeSet(T[] ob) {
        TreeSet<T> intTree = new TreeSet<>();
        for (int i = 0; i < ob.length; i++) {
            intTree.add(ob[i]);
        }
        return intTree;
    }

    public static <T> Queue<T> toQueue(T[] ob) {
        Queue<T> intQ = new PriorityQueue<>();
        for (int i = 0; i < ob.length; i++) {
            intQ.add(ob[i]);
        }
        return intQ;
    }

    public static <T> Deque<T> toDeque(T[] ob) {
        Deque<T> intD = new ArrayDeque<>();
        for (int i = 0; i < ob.length; i++) {
            intD.add(ob[i]);
        }
        return intD;
    }
}



