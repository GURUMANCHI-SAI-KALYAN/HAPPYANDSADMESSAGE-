package com.bridglabz.mmodanalyzer;
public class MoodAnalyzer
{
    String message;
    MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
