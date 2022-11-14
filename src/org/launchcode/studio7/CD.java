package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    public CD(String name, int storageCapacity, int remainingCapacity, int capacityUsed) {
        super(name, storageCapacity, capacityUsed, "cd");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("A cd spins at a variable rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Would you like to play a game?  (Jayde is funny).");
    }

}
