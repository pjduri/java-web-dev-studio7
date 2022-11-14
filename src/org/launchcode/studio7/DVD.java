package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    public DVD(String name, int storageCapacity, int capacityUsed) {
        super(name, storageCapacity, capacityUsed, "dvd");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("A dvd spins at a variable rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("My D&D party is about to fight an Aboleth.");
    }

}
