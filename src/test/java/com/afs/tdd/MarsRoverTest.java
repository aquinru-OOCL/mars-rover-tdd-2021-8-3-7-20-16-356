package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    void should_return_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_M() {
        //Given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 1, "N");

        //When
        marsRover.executeCommand("M");

        //Then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_negative1_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_S_and_M() {
        //Given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, -1, "S");

        //When
        marsRover.executeCommand("M");

        //Then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_1_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_E_and_M() {
        //Given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(1, 0, "E");

        //When
        marsRover.executeCommand("M");

        //Then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void should_return_locationX_negative1_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_W_and_M() {
        //Given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1, 0, "W");

        //When
        marsRover.executeCommand("M");

        //Then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
}
