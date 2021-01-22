package com.bridglabz.mmodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {
    @Test
    public void giveMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is sad message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is happy message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenANyMood_ShouldReturn_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is an Any message.");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodShouldThrowException() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessageEmpty_shouldThrow_MoodAnalyserException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException moodAnalysisException) {
            Assert.assertEquals("EMPTY_MESSAGE: Message can not be Empty.",
                    moodAnalysisException.getMessage());
        }
    }
}