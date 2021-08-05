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
}
