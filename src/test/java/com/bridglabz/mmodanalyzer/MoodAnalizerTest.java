package com.bridglabz.mmodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {
        @Test
        public void giveMessage_WhenSad_ShouldReturnSad() {
             MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is sad message") ;
             String mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD" , mood);
        }
        public void givenMessage_WhenNotSad_ShouldReturnHappy() {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is happy message") ;
            String mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY" , mood);
        }
        @Test
        public void givenANyMood_ShouldReturn_HAPPY() {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer("This is an Any message.");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        }
}
