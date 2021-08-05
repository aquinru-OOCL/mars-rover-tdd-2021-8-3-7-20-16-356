package com.afs.tdd;

public class MarsRover{
    private int locationX;
    private int locationY;
    private String direction;
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
        locationX = roverStatus.getLocationX();
        locationY = roverStatus.getLocationY();
        direction = roverStatus.getDirection();
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

    public void executeCommand(String command) {
    }
}
