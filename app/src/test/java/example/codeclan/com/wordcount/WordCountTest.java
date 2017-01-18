package example.codeclan.com.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */
public class WordCountTest {

    WordCount wordCount;

    @Before
    public void before() {
        wordCount = new WordCount("This is a test sentence!");
    }

    @Test
    public void canGetSentence() {
        assertEquals("This is a test sentence!", wordCount.getSentence());
    }

    @Test
    public void canSetSentence() {
        wordCount.setSentence("Bla Bla Bla");
        assertEquals("Bla Bla Bla", wordCount.getSentence());
    }

    @Test
    public void canGetWordcount() {
        assertEquals(5, wordCount.getWordCount());
    }

}