package com.afs.tdd;

public class MarsRover{
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

    public void executeCommand(String command) {
        if ("M".equals(command)) {
            move();
        }
    }

    private void move() {
        int locationX, locationY;
        if ("N".equals(roverStatus.getDirection())) {
            locationY = roverStatus.getLocationY() + 1;
            roverStatus = new RoverStatus(roverStatus.getLocationX(), locationY, roverStatus.getDirection());
        }
        if ("S".equals(roverStatus.getDirection())) {
            locationY = roverStatus.getLocationY() - 1;
            roverStatus = new RoverStatus(roverStatus.getLocationX(), locationY, roverStatus.getDirection());
        }
        if ("E".equals(roverStatus.getDirection())) {
            locationX = roverStatus.getLocationX() + 1;
            roverStatus = new RoverStatus(locationX, roverStatus.getLocationX(), roverStatus.getDirection());
        }
    }

}
