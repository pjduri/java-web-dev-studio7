package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int capacityUsed;
    private String discType;

    public BaseDisc(String name, int storageCapacity, int remainingCapacity, int capacityUsed, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.capacityUsed = capacityUsed;
        this.discType = discType;
    }

    private int checkStorageCapacity(int dataWritten) {
        if (dataWritten < storageCapacity) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String discInfo() {
        String output = String.format("\nDisc name: %s" +
                "\nMaximum Storage Capacity: %d" +
                "\nSpace Used: %d" +
                "\nAvailable Space: %d",
                name, storageCapacity, capacityUsed, spaceLeft());
        return output;
    }

    public String writeData(int dataSize) {
        if (dataSize > spaceLeft()) {
            return "Not enough space on disc!";
        }
        capacityUsed += dataSize;
        return "Disc space remaining: " + spaceLeft();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getCapacityUsed() {
        return capacityUsed;
    }

    public String getDiscType() {
        return discType;
    }

}
