package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I AM IN SAD MOOD");
        String result = moodAnalyser.analyserMood("sad");
        Assert.assertEquals(result, "SAD");
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I AM IN HAPPY MOOD");
        String result = moodAnalyser.analyserMood("happy");
        Assert.assertEquals(result, "HAPPY");

    }

}
