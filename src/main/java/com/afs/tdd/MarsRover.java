package com.afs.tdd;

public class MarsRover{
    private RoverStatus roverStatus;
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;

    }

    public void executeCommand(String command) {
        locationX = roverStatus.getLocationX();
        locationY = roverStatus.getLocationY();
        direction = roverStatus.getDirection();

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
        switch (roverStatus.getDirection()) {
            case "N":
                locationY++;
                roverStatus = new RoverStatus(locationX, locationY, direction);
                break;
            case "S":
                locationY--;
                roverStatus = new RoverStatus(locationX, locationY, direction);
                break;
            case "E":
                locationX++;
                roverStatus = new RoverStatus(locationX, locationY, direction);
                break;
            case "W":
                locationX--;
                roverStatus = new RoverStatus(locationX, locationY, direction);
                break;
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
