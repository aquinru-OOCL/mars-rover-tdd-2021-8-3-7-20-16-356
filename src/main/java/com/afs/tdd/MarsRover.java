package com.afs.tdd;

public class MarsRover{
    private RoverStatus roverStatus;
    private int locationX;
    private int locationY;
    private String direction;
    private String newDirection;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;

    }

    public void executeCommands(String commands) {
        for (String command: commands.split("")) {
            this.executeCommand(command);
        }
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
        switch (direction) {
            case "N":
                newDirection = "W";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
            case "S":
                newDirection = "E";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
            case "E":
                newDirection = "N";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
            case "W":
                newDirection = "S";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                newDirection = "E";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
            case "S":
                newDirection = "W";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
            case "E":
                newDirection = "S";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
            case "W":
                newDirection = "N";
                roverStatus = new RoverStatus(locationX, locationY, newDirection);
                break;
        }
    }

}
