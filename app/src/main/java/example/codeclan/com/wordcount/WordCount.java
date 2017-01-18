package example.codeclan.com.wordcount;

/**
 * Created by user on 17/01/2017.
 */

public class WordCount {

    private String sentence;

    public WordCount(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String newSentence) {
        this.sentence = newSentence;
    }

    public int getWordCount() {
        int count = 1;
            for (int i=0; i<=sentence.length()-1; i++) {
                if (sentence.charAt(i) == ' ' && sentence.charAt(i+1)!=' ') {
                    count++;
                }
            }
        return count;
    }

}
