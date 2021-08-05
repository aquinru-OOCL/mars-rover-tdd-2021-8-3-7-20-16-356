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
        int locationY;
        if ("N".equals(roverStatus.getDirection())) {
            locationY = roverStatus.getLocationY() + 1;
            roverStatus = new RoverStatus(roverStatus.getLocationX(), locationY, roverStatus.getDirection());
        }
    }

}
