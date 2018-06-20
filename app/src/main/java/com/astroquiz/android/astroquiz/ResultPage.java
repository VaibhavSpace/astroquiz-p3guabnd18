package com.astroquiz.android.astroquiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    String playerName;
    String totalQuestions;
    String score;
    String totalCorrectAnswers;
    String totalNotAttempted;
    String totalIncorrectAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_result);

        // Bundle to receive the values passed from QuestionActivity
        Bundle scoreSummary = getIntent().getExtras();
        playerName = scoreSummary.getString("playerName");
        totalQuestions = scoreSummary.getString("totalQuestions");
        totalCorrectAnswers = scoreSummary.getString("totalCorrectAnswers");
        totalIncorrectAnswers = scoreSummary.getString("totalIncorrectAnswers");
        totalNotAttempted = scoreSummary.getString("totalNotAttempted");
        score = scoreSummary.getString("score");

        // Call Function to Display the Score Summary
        showResult();
    }

    /**
     * Function to Display the Score Summary
     */
    public void showResult() {

        TextView nameTextView = findViewById(R.id.name_text_view);
        TextView totalQuestionsTextView = findViewById(R.id.total_questions_text_view);
        TextView correctTextView = findViewById(R.id.correct_text_view);
        TextView incorrectTextView = findViewById(R.id.incorrect_text_view);
        TextView notAttendedTextView = findViewById(R.id.not_attempted_text_view);
        TextView scoreTextView = findViewById(R.id.your_score);



        // Set the Score Summary for the Quiz Type
        nameTextView.setText(playerName);
        totalQuestionsTextView.setText(totalQuestions);
        correctTextView.setText(totalCorrectAnswers);
        incorrectTextView.setText(totalIncorrectAnswers);
        notAttendedTextView.setText(totalNotAttempted);
        scoreTextView.setText(score);


        // Convert the score to integer
        int quizScore = Integer.valueOf(score);

    }
}