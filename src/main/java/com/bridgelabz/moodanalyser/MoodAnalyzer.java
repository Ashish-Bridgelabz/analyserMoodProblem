package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
    private String message;

    //NO argument parameters constructor
    MoodAnalyzer() {
    }

    //Parameters constructor
    MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyzeMood();
    }

    public String analyzeMood() throws MoodAnalysisException {
        try {
            if (message.equals("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Please enter a valid mood", MoodAnalysisException.ExceptionType.ENTERED_NULL);
        }
    }
}
