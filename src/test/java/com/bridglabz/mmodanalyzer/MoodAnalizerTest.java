package com.bridglabz.mmodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {
        @Test
        public void giveMessage_WhenSad_ShouldReturnSad() {
             MoodAnalyzer moodAnalyzer = new MoodAnalyzer() ;
             String mood = moodAnalyzer.analyseMood("This is sad message");
            Assert.assertEquals("SAD" , mood);
        }
        public void givenMessage_WhenNotSad_ShouldReturnHappy() {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer() ;
            String mood = moodAnalyzer.analyseMood("This is happy message");
            Assert.assertEquals("HAPPY" , mood);
        }
}
