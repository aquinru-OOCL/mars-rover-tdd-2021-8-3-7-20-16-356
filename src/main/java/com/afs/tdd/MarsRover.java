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
        switch (command) {
            case "M":
                move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
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
        if ("W".equals(roverStatus.getDirection())) {
            locationX = roverStatus.getLocationX() - 1;
            roverStatus = new RoverStatus(locationX, roverStatus.getLocationX(), roverStatus.getDirection());
        }
    }

    private void turnLeft() {
        String newDirection;
        if ("N".equals(roverStatus.getDirection())) {
            newDirection = "W";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }else if ("S".equals(roverStatus.getDirection())) {
            newDirection = "E";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }else if ("E".equals(roverStatus.getDirection())) {
            newDirection = "N";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }else if ("W".equals(roverStatus.getDirection())) {
            newDirection = "S";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }
    }

    private void turnRight() {
        String newDirection;
        if ("N".equals(roverStatus.getDirection())) {
            newDirection = "E";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }else if ("S".equals(roverStatus.getDirection())) {
            newDirection = "W";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }else if ("E".equals(roverStatus.getDirection())) {
            newDirection = "S";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }else if ("W".equals(roverStatus.getDirection())) {
            newDirection = "N";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY(), newDirection);
        }
    }

}
