package com.afs.tdd;

public class MarsRover{
    private final RoverStatus roverStatus;
    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";

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
        switch (command) {
            case MOVE:
                move();
                break;
            case LEFT:
                turnLeft();
                break;
            case RIGHT:
                turnRight();
                break;
        }
    }

    private void move() {
        switch (roverStatus.getDirection()) {
            case NORTH:
                roverStatus.incrementY();
                break;
            case SOUTH:
                roverStatus.decrementY();
                break;
            case EAST:
                roverStatus.incrementX();
                break;
            case WEST:
                roverStatus.decrementX();
                break;
        }
    }

    private void turnLeft() {
        switch (roverStatus.getDirection()) {
            case NORTH:
                roverStatus.setDirection(WEST);
                break;
            case SOUTH:
                roverStatus.setDirection(EAST);
                break;
            case EAST:
                roverStatus.setDirection(NORTH);
                break;
            case WEST:
                roverStatus.setDirection(SOUTH);
                break;
        }
    }

    private void turnRight() {
        switch (roverStatus.getDirection()) {
            case NORTH:
                roverStatus.setDirection(EAST);
                break;
            case SOUTH:
                roverStatus.setDirection(WEST);
                break;
            case EAST:
                roverStatus.setDirection(SOUTH);
                break;
            case WEST:
                roverStatus.setDirection(NORTH);
                break;
        }
    }

}
