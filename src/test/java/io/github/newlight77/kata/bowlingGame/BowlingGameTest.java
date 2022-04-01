package io.github.newlight77.kata.bowlingGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    private BowlingGame bowlingGame = new BowlingGame();

    @Test
    void should_return_21_when_spare_with_first_frame_is_10_and_third_try_is_5_fourth_is_1(){
        // Given
        String miniLine = "6/ 51";
        // When
        Integer score = bowlingGame.calculateScore(miniLine);
        // Then

        Assertions.assertEquals(21, score);
    }

    @Test
    void should_return_22_when_strike_and_third_try_is_5_fourth_is_1(){
        // Given
        String miniLine = "X 51";
        // When
        Integer score = bowlingGame.calculateScore(miniLine);
        // Then

        Assertions.assertEquals(22, score);
    }
}