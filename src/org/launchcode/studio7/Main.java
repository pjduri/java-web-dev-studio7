package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("CD Example", 700, "CD-R", 350);
        DVD dvd = new DVD("DVD Example", 4700, "DVD-R", 1450);

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        // practicing watch expression
        cd.setName("Debugging practice");
        cd.setName("Watch term should pick one of these strings");
        cd.setName("But which one will it be?");
        cd.setName("Maybe this one?");
        cd.setName("Definitely this one.");
        cd.setName("Maybe this one?");
        cd.setName("Or this one?");

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8000));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());
    }
}
