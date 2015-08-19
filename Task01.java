package org.sourceit.zakharov.home05;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Auto[] auto = {new Auto("1type", 1992, "red"),
                        new Auto("2type", 1998, "red"),
                        new Auto("3type", 2004, "red"),
                        new Auto("1type", 1998, "blue"),
                        new Auto("2type", 2000, "red")};

        for (int i = 0; i < auto.length; i++) {
            System.out.println(auto[i].toString());
        }

        while (true) {
            System.out.println("enter two number for comparison, or 0 fr escape");
            int s1 = scanner.nextInt();
            if (s1 ==0) break;
            int s2 = scanner.nextInt();

            if (s1 > auto.length || s2 > auto.length || s1 < 0 || s2 < 0) {
                System.out.println("incorrectly value");
                continue;
            }

            System.out.println("equals - " + auto[s1].equals(auto[s2]));
            System.out.println("compareTo - " + auto[s1].compareTo(auto[s2]));
            System.out.println("hach code - " + auto[s1].hashCode());
            System.out.println("hach code - " + auto[s2].hashCode());
        }


    }
}

class Auto implements Comparable{
    private String type;
    private int year;
    private String color;

    Auto(String type, int year, String color) {
        this.setType(type);
        this.setYear(year);
        this.setColor(color);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return getType() + " " + getYear() + " year, color - " + getColor();
    }




// изменить вычеслтиетль
    @Override
    public int hashCode() {
        int hashType=0 ,hashColor=0;

        for (int i = 0; i < getType().length() && i < getColor().length(); i++){
            hashType  = 31 * hashType  + getType().charAt(i);
            hashColor = 31 * hashColor + getColor().charAt(i);
        }

        return getYear()+hashColor+hashType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Auto other = (Auto) obj;
        if (getColor().compareTo(other.getColor())!=0)
            return false;
        if (getYear() != other.getYear())
            return false;
        if (getType().compareTo(other.getType()) != 0)
            return false;
        return true;
    }

    @Override
    public int compareTo(Object obj) {

        Auto other = (Auto) obj;
        if (this == obj)
            return 0;

        if (getColor().compareTo(other.getColor()) > 0 )
            return 5;

        if (getYear() > other.getYear())
            return 7;

        if (getType().compareTo(other.getType()) > 0 )
            return 9;
        else return -9;
    }

}

