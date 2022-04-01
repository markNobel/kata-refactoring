package io.github.newlight77.kata.bowlingGame;

import java.util.Arrays;

public class BowlingGame {

    public Integer calculateScore(String line) {
        // parsing line to split into frames
        // calculate score of each frame
        // some of each

        String[] frames = line.split(" ");
        return Arrays.stream(frames)
                .map(frame -> frame.replace("-",""))
                .filter(frame -> !frame.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }

}
