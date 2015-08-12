package org.sourceit.zakharov.home05;

public class Task01 {

    public static void main(String[] args) {
        Auto[] auto = {new Auto("1type", 1992, "red"),
                        new Auto("2type", 1998, "red"),
                        new Auto("3type", 2004, "red"),
                        new Auto("1type", 1998, "blue"),
                        new Auto("2type", 2000, "red")};



        System.out.println(auto[1].equals(auto[1]));
        System.out.println(auto[1].compareTo(auto[4]));



    }
}

class Auto {
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





    @Override
    public int hashCode() {
        return getYear();
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
        if (getColor() != other.getColor())
            return false;
        if (getYear() != other.getYear())
            return false;
        if (getType() != other.getType())
            return false;
        return true;
    }

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