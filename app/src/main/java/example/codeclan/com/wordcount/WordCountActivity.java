package example.codeclan.com.wordcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class WordCountActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button calcButton;
    TextView wordCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText)findViewById(R.id.sentence_text);
        calcButton = (Button)findViewById(R.id.calc_button);
        wordCountText = (TextView)findViewById(R.id.word_count_text);

        Log.d(getClass().toString(), "OnCreate called");
    }

    public void onWordCountButtonPressed(View button) {
        Log.d(getClass().toString(), sentenceEditText.getText().toString());

        String gotSentenceFromUser = sentenceEditText.getText().toString();
        WordCount wordCount = new WordCount(gotSentenceFromUser);
        int numOfWords = wordCount.getWordCount();
        String numOfWordsString = String.valueOf(numOfWords);

        wordCountText.setText(numOfWordsString);
    }

}
