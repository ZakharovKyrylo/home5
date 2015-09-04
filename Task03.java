package org.sourceit.zakharov.home05;


import java.lang.reflect.Array;
import java.util.*;

public class Task03 {
    public static void main(String[] args) {

        AllToCollection allToCollection = new AllToCollection();
        Random random = new Random();

        //sozdanie masivov
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


        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
            longs[i] = random.nextLong();
            doubles[i] = random.nextDouble();
            booleans[i] = random.nextBoolean();
        }

        for (int j = 0; j < allToCollection.toAll.length; j++)
            for (int i = 0; i < ints.length; i++) {
                switch (j) {
                    case 0:
                        allToCollection.toAll[j][i] = ints[i];//0
                        break;
                    case 1:
                        allToCollection.toAll[j][i] = longs[i];//1
                        break;
                    case 2:
                        allToCollection.toAll[j][i] = doubles[i];//2
                        break;
                    case 3:
                        allToCollection.toAll[j][i] = booleans[i];//3
                        break;
                    case 4:
                        allToCollection.toAll[j][i] = strings[i];
                        break;
                    case 5:
                        allToCollection.toAll[j][i] = autos[i];
                        break;
                }
            }

// vizov i vivod realizacii classa AllToCollection


        HashMap hashMapIntString = allToCollection.toHashMap(allToCollection.toAll[0], strings);
        HashMap hashMapStringString = allToCollection.toHashMap(strings, strings);
        HashMap hashMapIntLong = allToCollection.toHashMap(allToCollection.toAll[0], allToCollection.toAll[1]);
        HashMap hashMapStringBool = allToCollection.toHashMap(strings, allToCollection.toAll[3]);
        HashMap hashMapStringDouble = allToCollection.toHashMap(strings, allToCollection.toAll[2]);
        HashMap hashMapIntAuto = allToCollection.toHashMap(allToCollection.toAll[0], autos);
        HashMap hashMapStringAuto = allToCollection.toHashMap(strings, autos);

        System.out.println("hashMapIntString " + hashMapIntString);
        System.out.println("hashMapStringString " + hashMapStringString);
        System.out.println("hashMapIntlong " + hashMapIntLong);
        System.out.println("hashMapStringBoolean " + hashMapStringBool);
        System.out.println("hashMapStringDouble " + hashMapStringDouble);
        System.out.println("hashMapIntAuto " + hashMapIntAuto);
        System.out.println("hashMapStringAuto " + hashMapStringAuto + "\n");

        TreeMap treeMapIntString = allToCollection.toTreeMap(allToCollection.toAll[0], strings);
        TreeMap treeMapStringString = allToCollection.toTreeMap(strings, strings);
        TreeMap treeMapIntLong = allToCollection.toTreeMap(allToCollection.toAll[0], allToCollection.toAll[1]);
        TreeMap treeMapStringBool = allToCollection.toTreeMap(strings, allToCollection.toAll[3]);
        TreeMap treeMapStringDouble = allToCollection.toTreeMap(strings, allToCollection.toAll[2]);
        TreeMap treeMapIntAuto = allToCollection.toTreeMap(allToCollection.toAll[0], autos);
        TreeMap treeMapStringAuto = allToCollection.toTreeMap(strings, autos);

        System.out.println("treeMapIntString " + treeMapIntString);
        System.out.println("treeMapStringString " + treeMapStringString);
        System.out.println("treeMapIntlong " + treeMapIntLong);
        System.out.println("treeMapStringBool " + treeMapStringBool);
        System.out.println("treeMapStringDouble " + treeMapStringDouble);
        System.out.println("treeMapIntAuto " + treeMapIntAuto);
        System.out.println("treeMapStringAuto " + treeMapStringAuto + "\n");

        LinkedHashMap linkedHashMapIntString = allToCollection.toLinkedHashMap(allToCollection.toAll[0], strings);
        LinkedHashMap linkedHashMapStringString = allToCollection.toLinkedHashMap(strings, strings);
        LinkedHashMap linkedHashMapIntLong = allToCollection.toLinkedHashMap(allToCollection.toAll[0], allToCollection.toAll[1]);
        LinkedHashMap linkedHashMapStringBool = allToCollection.toLinkedHashMap(strings, allToCollection.toAll[3]);
        LinkedHashMap linkedHashMapStringDouble = allToCollection.toLinkedHashMap(strings, allToCollection.toAll[2]);
        LinkedHashMap linkedHashMapIntAuto = allToCollection.toLinkedHashMap(allToCollection.toAll[0], autos);
        LinkedHashMap linkedHashMapStringAuto = allToCollection.toLinkedHashMap(strings, autos);

        System.out.println("linkedHashMapIntString " + linkedHashMapIntString);
        System.out.println("linkedHashMapStringString " + linkedHashMapStringString);
        System.out.println("linkedHashMapIntlong " + linkedHashMapIntLong);
        System.out.println("linkedHashMapStringBool " + linkedHashMapStringBool);
        System.out.println("linkedHashMapStringDouble " + linkedHashMapStringDouble);
        System.out.println("linkedHashMapIntAuto " + linkedHashMapIntAuto);
        System.out.println("linkedHashMapStringAuto " + linkedHashMapStringAuto + "\n");


// Map to All
        MapToIntString hashMapToIntString = new MapToIntString(hashMapIntString);
        MapToIntString treeMapToIntString = new MapToIntString(treeMapIntString);
        MapToIntString linkedHashMapToIntString = new MapToIntString(linkedHashMapIntString);

        int[] ints1 = hashMapToIntString.getMassInt();
        int[] ints2 = treeMapToIntString.getMassInt();
        int[] ints3 = linkedHashMapToIntString.getMassInt();

        String[] string1 = hashMapToIntString.getMassString();
        String[] string2 = treeMapToIntString.getMassString();
        String[] string3 = linkedHashMapToIntString.getMassString();


        for (int i=0;i< ints1.length;i++)
        System.out.println(ints1[i] + "\t" + string1[i] + "\t" +ints2[i] + "\t" + string2[i] + "\t" +ints3[i] + "\t" + string3[i]);




        MapToStringString hashMapToStringString = new MapToStringString(hashMapStringString);
        MapToStringString treeMapToStringString = new MapToStringString(treeMapStringString);
        MapToStringString linkedHashMapToStringString = new MapToStringString(linkedHashMapStringString);


        String[] string10 = hashMapToStringString.getMassString();
        String[] string20 = treeMapToStringString.getMassString();
        String[] string30 = linkedHashMapToStringString.getMassString();

        String[] string11 = hashMapToStringString.getMassString1();
        String[] string21 = treeMapToStringString.getMassString1();
        String[] string31 = linkedHashMapToStringString.getMassString1();


        for (int i=0;i< ints1.length;i++)
            System.out.println(string10[i] + "\t" + string11[i] + "\t" +string20[i] + "\t" + string21[i] + "\t" +string30[i] + "\t" + string31[i]);



        MapToIntLong hashMapToIntLong = new MapToIntLong(hashMapIntLong);
        MapToIntLong treeMapToIntLong = new MapToIntLong(treeMapIntLong);
        MapToIntLong linkedHashMapToIntLong = new MapToIntLong(linkedHashMapIntLong);


        int[] int12 = hashMapToIntLong.getMass1();
        int[] int22 = treeMapToIntLong.getMass1();
        int[] int32 = linkedHashMapToIntLong.getMass1();

        long[] long12 = hashMapToIntLong.getMass2();
        long[] long22 = treeMapToIntLong.getMass2();
        long[] long32 = linkedHashMapToIntLong.getMass2();


        for (int i=0;i< ints1.length;i++)
            System.out.println(int12[i] + "\t\t" + long12[i] + "\t\t\t" +int22[i] + "\t\t\t" + long22[i] + "\t\t\t" +int32[i] + "\t\t\t" + long32[i]);


        MapToStringBool hashMapToStringBool = new MapToStringBool(hashMapStringBool);
        MapToStringBool treeMapToStringBool = new MapToStringBool(treeMapStringBool);
        MapToStringBool linkedHashMapToStringBool = new MapToStringBool(linkedHashMapStringBool);


        String[] String14 = hashMapToStringBool.getMass1();
        String[] String24 = treeMapToStringBool.getMass1();
        String[] String34 = linkedHashMapToStringBool.getMass1();

        boolean[] boll14 = hashMapToStringBool.getMass2();
        boolean[] boll24 = treeMapToStringBool.getMass2();
        boolean[] boll34 = linkedHashMapToStringBool.getMass2();


        for (int i=0;i< ints1.length;i++)
            System.out.println(String14[i] + "\t" + boll14[i] + "\t" +String24[i] + "\t" + boll24[i] + "\t" +String34[i] + "\t" + boll34[i]);



        MapToStringDouble hashMapToStringDouble = new MapToStringDouble(hashMapStringDouble);
        MapToStringDouble treeMapToStringDouble = new MapToStringDouble(treeMapStringDouble);
        MapToStringDouble linkedHashMapToStringDouble = new MapToStringDouble(linkedHashMapStringDouble);


        String[] String15 = hashMapToStringDouble.getMass1();
        String[] String25 = treeMapToStringDouble.getMass1();
        String[] String35 = linkedHashMapToStringDouble.getMass1();

        double[] double15 = hashMapToStringDouble.getMass2();
        double[] double25 = treeMapToStringDouble.getMass2();
        double[] double35 = linkedHashMapToStringDouble.getMass2();


        for (int i=0;i< ints1.length;i++)
            System.out.println(String15[i] + "\t\t" + double15[i] + "\t\t" +String25[i] + "\t\t" + double25[i] + "\t\t" +String35[i] + "\t\t" + double35[i]);




        MapToIntAuto hashMapToIntAuto = new MapToIntAuto(hashMapIntAuto);
        MapToIntAuto treeMapToIntAuto = new MapToIntAuto(treeMapIntAuto);
        MapToIntAuto linkedHashMapToIntAuto = new MapToIntAuto(linkedHashMapIntAuto);


        int[] int16 = hashMapToIntAuto.getMass1();
        int[] int26 = treeMapToIntAuto.getMass1();
        int[] int36 = linkedHashMapToIntAuto.getMass1();

        Auto[] auto16 = hashMapToIntAuto.getMass2();
        Auto[] auto26 = treeMapToIntAuto.getMass2();
        Auto[] auto36 = linkedHashMapToIntAuto.getMass2();


        for (int i=0;i< ints1.length;i++)
            System.out.println(int16[i] + "\t\t" + auto16[i] + "\t\t" +int26[i] + "\t\t" + auto26[i] + "\t\t" +int36[i] + "\t\t" + auto36[i]);



        MapToStringAuto hashMapToStringAuto = new MapToStringAuto(hashMapStringAuto);
        MapToStringAuto treeMapToStringAuto = new MapToStringAuto(treeMapStringAuto);
        MapToStringAuto linkedHashMapToStringAuto = new MapToStringAuto(linkedHashMapStringAuto);


        String[] string17 = hashMapToStringAuto.getMass1();
        String[] string27 = treeMapToStringAuto.getMass1();
        String[] string37 = linkedHashMapToStringAuto.getMass1();

        Auto[] auto17 = hashMapToStringAuto.getMass2();
        Auto[] auto27 = treeMapToStringAuto.getMass2();
        Auto[] auto37 = linkedHashMapToStringAuto.getMass2();


        for (int i=0;i< ints1.length;i++)
            System.out.println(string17[i] + "\t\t" + auto17[i] + "\t\t" +string27[i] + "\t\t" + auto27[i] + "\t\t" +string37[i] + "\t\t" + auto37[i]);

    }
}


class MapToIntString{
    int[] mass1;
    String[] mass2;

    public MapToIntString(Map map){
        int[] mass = new int[map.size()/2];
        String[] mass1 = new String[map.size()/2];

        for (int i =0; i < map.size();i++){
            if(i<map.size()/2) mass[i] = (int) map.get(i+1);
            else mass1[i-10] =(String) map.get(i + 1);
        }
        this.mass1 = mass;
        this.mass2 = mass1;
    }

    public int[] getMassInt(){
        return mass1;
    }

    public String[] getMassString(){
        return mass2;
    }
}



class MapToStringString{
    String[] massString;
    String[] massString1;

    public MapToStringString(Map map){
        String[] mass = new String[map.size()/2];
        String[] mass1 = new String[map.size()/2];

        for (int i =0; i < map.size();i++){
            if(i<map.size()/2) mass[i] = (String) map.get(i+1);
            else mass1[i-10] =(String) map.get(i + 1);
        }
        this.massString = mass;
        this.massString1 = mass1;
    }

    public String[] getMassString(){
        return massString;
    }

    public String[] getMassString1(){
        return massString1;
    }
}



class MapToIntLong{
    int[] mass1;
    long[] mass2;

    public MapToIntLong(Map map){
        int[] mass = new int[map.size()/2];
        long[] mass1 = new long[map.size()/2];

        for (int i =0; i < map.size();i++){
            if(i<map.size()/2) mass[i] = (int) map.get(i+1);
            else mass1[i-10] =(long) map.get(i + 1);
        }
        this.mass1 = mass;
        this.mass2 = mass1;
    }

    public int[] getMass1(){
        return mass1;
    }

    public long[] getMass2(){
        return mass2;
    }
}


class MapToStringBool{
    String[] mass1;
    boolean[] mass2;

    public MapToStringBool(Map map){
        String[] mass = new String[map.size()/2];
        boolean[] mass1 = new boolean[map.size()/2];

        for (int i =0; i < map.size();i++){
            if(i<map.size()/2) mass[i] = (String) map.get(i+1);
            else mass1[i-10] =(Boolean) map.get(i + 1);
        }
        this.mass1 = mass;
        this.mass2 = mass1;
    }

    public String[] getMass1(){
        return mass1;
    }

    public boolean[] getMass2(){
        return mass2;
    }
}


class MapToStringDouble{
    String[] mass1;
    double[] mass2;

    public MapToStringDouble(Map map){
        String[] mass = new String[map.size()/2];
        double[] mass1 = new double[map.size()/2];

        for (int i =0; i < map.size();i++){
            if(i<map.size()/2) mass[i] = (String) map.get(i+1);
            else mass1[i-10] =(double) map.get(i + 1);
        }
        this.mass1 = mass;
        this.mass2 = mass1;
    }

    public String[] getMass1(){
        return mass1;
    }

    public double[] getMass2(){
        return mass2;
    }
}

class MapToIntAuto{
    int[] mass1;
    Auto[] mass2;

    public MapToIntAuto(Map map){
        int[] mass = new int[map.size()/2];
        Auto[] mass1 = new Auto[map.size()/2];

        for (int i =0; i < map.size();i++){
            if(i<map.size()/2) mass[i] = (int) map.get(i+1);
            else mass1[i-10] =(Auto) map.get(i + 1);
        }
        this.mass1 = mass;
        this.mass2 = mass1;
    }

    public int[] getMass1(){
        return mass1;
    }

    public Auto[] getMass2(){
        return mass2;
    }
}

class MapToStringAuto{
    String[] mass1;
    Auto[] mass2;

    public MapToStringAuto(Map map){
        String[] mass = new String[map.size()/2];
        Auto[] mass1 = new Auto[map.size()/2];

        for (int i =0; i < map.size();i++){
            if(i<map.size()/2) mass[i] = (String) map.get(i+1);
            else mass1[i-10] =(Auto) map.get(i + 1);
        }
        this.mass1 = mass;
        this.mass2 = mass1;
    }

    public String[] getMass1(){
        return mass1;
    }

    public Auto[] getMass2(){
        return mass2;
    }
}






class AllToCollection {
    public Object[][] toAll = new Object[6][10];

    public <T extends Integer, K> HashMap<Integer, K> toHashMap(K[] ob1, K[] ob2) {
        HashMap<Integer, K> map = new HashMap<>();
        for (int i = 0; i < (ob1.length + ob2.length); i++) {
            Integer integer = new Integer(i + 1);
            if (i < ob1.length) map.put(integer, ob1[i]);
            else map.put(integer, ob2[i - 10]);
        }
        return map;

    }

    public <T extends Integer,K>TreeMap<Integer,K> toTreeMap(K[] ob1, K[] ob2){
        TreeMap<Integer, K> map = new TreeMap<>();
        for (int i = 0; i < (ob1.length + ob2.length); i++) {
            Integer integer = new Integer(i + 1);
            if (i < ob1.length) map.put(integer, ob1[i]);
            else map.put(integer, ob2[i - 10]);
        }
        return map;
    }

    public <T extends Integer,K>LinkedHashMap<Integer,K> toLinkedHashMap(K[] ob1, K[] ob2){
        LinkedHashMap<Integer, K> map = new LinkedHashMap<>();
        for (int i = 0; i < (ob1.length + ob2.length); i++) {
            Integer integer = new Integer(i + 1);
            if (i < ob1.length) map.put(integer, ob1[i]);
            else map.put(integer, ob2[i - 10]);
        }
        return map;
    }
}