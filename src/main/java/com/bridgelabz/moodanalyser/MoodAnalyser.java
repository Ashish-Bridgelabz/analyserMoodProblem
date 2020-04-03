package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    public String message;

    //PARAMETER CONSTRACTOR
    MoodAnalyser(String message) {
        this.message = message;
    }
    //METHOD
    String analyserMood(String message) {
        if (message.contains("sad")) {
            message = "SAD";
        } else if (message.contains("happy")) {
            message = "HAPPY";
        }
        return message;
    }
}



