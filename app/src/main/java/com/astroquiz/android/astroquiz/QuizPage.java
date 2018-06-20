package com.astroquiz.android.astroquiz;


import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizPage extends AppCompatActivity {

    // User name
    String playerName;

    // Array to store the images as variable from drawable
    private Integer images[] = {R.drawable.q1, R.drawable.q2, R.drawable.q3, R.drawable.q4, R.drawable.q5,
            R.drawable.q6, R.drawable.q7, R.drawable.q8, R.drawable.q9, R.drawable.q10,
            R.drawable.q11, R.drawable.q12, R.drawable.q13, R.drawable.q14, R.drawable.q15,
            R.drawable.q16, R.drawable.q17, R.drawable.q18, R.drawable.q19, R.drawable.q20,
            R.drawable.q21, R.drawable.q22, R.drawable.q23, R.drawable.q24, R.drawable.q25,
            R.drawable.q26, R.drawable.q27, R.drawable.q28, R.drawable.q29, R.drawable.q30,
    };

    // String array to store the questions
    String[] questions = {"1. How many planets are there in our solar system? •",
            "2. Which planet has the hottest surface? •",
            "3. How many planets have moons? •",
            "4. The asteroid belt lies between? •",
            "5. The largest asteroid discovered in the asteroid belt is? •",
            "6. Who first suggested the ‘passing star hypothesis’ to describe the origin of the solar system? ••",
            "7. How old is our solar system? •",
            "8. The average distance between the earth and the sun is equal to? •",
            "9. Which planet contains Olympus Mons, the largest volcano of the solar system? •",
            "10. Comets are believed to originate from? •",
            "11. What is the brightest star in the night sky? ••",
            "12. What is the brightest planet in the night sky? ••",
            "13. How many constellations are there in the entire northern and southern sky? ••",
            "14. What is the brightest star in the constellation Leo? ••",
            "15. Which are three stars which make up the summer triangle? ••",
            "16. The ‘big dipper’ is part of which constellation? ••",
            "17. In which constellation lies the andromeda galaxy? ••",
            "18. What name is used in observational astronomy to describe galaxies, nebulae and star clusters? ••",
            "19. Lunar eclipse always occurs? ••",
            "20. Which of these is not visible to the naked eye? ••",
            "21. Who never did science communication and astronomy outreach? •••",
            "22. What type of a star is Proxima Centauri and how many stars are bounded together gravitationally in Alpha Centauri system? •••",
            "23. What is the closest star visible to the naked eye? •••",
            "24. What is the correct statement regarding Wolf 359, one of the nearest stars to sun? •••",
            "25. The red dwarf star located 6 light years away, which constellation is home to Bernard's star, t? •••",
            "26. Life on earth is based on? •••",
            "27. Apart from the earth, what is the most likely place to find life in our solar system? •••",
            "28. A planet orbiting a small star cannot harbour intelligent life because? •••",
            "29. Where life could exist around a star, what is this zone called? •••",
            "30. Where Drake equation estimates SETI life? •••"
    };

    // String array to store the answers
    String[][] answers = {{"15", "9", "8", "10"},
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"6", "7", "8", "9"},
            {"Earth and Mars", "Mars and Jupiter", "Jupiter and Saturn", "Mercury and Venus"},
            {"Hebe", "Vesta", "Fortuna", "Ceres"},
            {"René Descartes", "Louis de Buffon", "Issac Newton", "Albert Einstein"},
            {"800 million years", "2 billion years", "5 billion years", "3.8 billion years"},
            {"One light year", "One astronomical unit", "One parsec", "One light minute"},
            {"Mercury", "Earth", "Mars", "Jupiter"},
            {"Galactic medium", "Asteroid belt", "Interstellar medium", "Oort cloud"},
            {"Canopus", "Spica", "Sirius", "Polaris"},
            {"Jupiter", "Mars", "Mercury", "Venus"},
            {"36", "112", "88", "90"},
            {"Regulus", "Deneb", "Algieba", "Sirius",},
            {"Altair, Deneb, and Vega", "Antares, Deneb and Spica", "Regulus, Aldebaran and Rigel", "Rigel, Saiph and Alnilam"},
            {"Orion", "Taurus", "Ursa major", "Aquarius"},
            {"Andromeda", "Sagittarius", "Hercules", "Orion"},
            {"Interstellar objects", "Deep sky objects", "Telescopic objects", "Universe objects"},
            {"On a full moon day", "On the day of a solar eclipse", "In a leap year", "On a new moon day"},
            {"International space station", "Planet mercury", "Mars", "Planet neptune"},
            {"Carl Sagan", "Brian Cox", "Neil deGrasse Tyson", "Albert Einstein"},
            {"White dwarf and 1", "Red dwarf star and 3", "Blue giant and 2", "Neutron star and 3"},
            {"Alpha Centauri", "Proxima Centauri", "Wolf 359", "Barnard's Star"},
            {"It is visible to the naked eye", "It is a brown dwarf", "It is located in the constellation Leo", "None"},
            {"Scorpius", "Taurus", "Orion", "Ophiuchus"},
            {"Carbon", "Oxygen", "Nitrogen", "Hydrogen"},
            {"Europa", "Titan", "Asteroids", "Enceladus"},
            {"The star has a short life span", "Planets will have unstable orbits", "The life zone is too close to the star", "None"},
            {"Habitable zone", "Alien life zone", "Life zone", "Goldilocks zone"},
            {"Parallel universe", "Universe", "Solar system", "Galaxy"},
    };

    // String array to store the list of correct answers
    String[] correctAnswersList = {"answer3", "answer2", "answer1", "answer2", "answer4",
            "answer2", "answer3", "answer2", "answer3", "answer4",
            "answer3", "answer4", "answer3", "answer1", "answer1",
            "answer3", "answer1", "answer2", "answer1", "answer4",
            "answer1", "answer2", "answer1", "answer3", "answer4",
            "answer1", "answer2", "answer3", "answer4", "answer2",
    };

    // Flags to keep track of which answer button was selected
    boolean answer1Clicked = false;
    boolean answer2Clicked = false;
    boolean answer3Clicked = false;
    boolean answer4Clicked = false;

    // Variable to keep track of current question number on screen
    int currentQuestionNumber = 0;
    int totalQuestions = 0;

    // Variables to keep track of score and number of correct and incorrect answers
    int score = 0;
    int totalCorrectAnswers = 0;
    int totalNotAttempted = 0;
    int totalIncorrectAnswers = 0;

    // Quiz complete flag
    boolean quizComplete = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_quiz);

        Bundle activityMain = getIntent().getExtras();

        playerName = activityMain.getString("playerName");

        // Total number of questions
        totalQuestions = questions.length;
        // Show appropriate questions in card
        showQuestions();
    }

    /**
     * AnswerButton function is called when the answer it pressed by the user after
     * answering the question. Next question is displayed on the screen and this
     * continues till last question is answered.
     * Also checks if the current question number is less than total questions
     * increment the current question number if there are questions left in the quiz,
     * show the next question by calling the showQuestions function.
     **/
    public void answerButton(View view) {

        String fullStop = getString(R.string.full_stop);

        checkAnswers();

        TextView scoreTextView = findViewById(R.id.score_text_view);

        if (currentQuestionNumber < totalQuestions) {

            currentQuestionNumber++;
            showQuestions();
            scoreTextView.setText(String.valueOf(score));
        } else {
            quizComplete = true;
        }
        // Show the score summary in toast
        Toast showResult = Toast.makeText(this, "Correct " + correctAnswersList[currentQuestionNumber - 1] + fullStop, Toast.LENGTH_LONG);
        showResult.show();
    }

    /**
     * Function to check the answers and calculate
     * - Number of correct answers
     * - Number of incorrect answers
     * - Number of unanswered questions
     * - Score of correct answers
     */
    public void checkAnswers() {

        // If answer1 is clicked and it is the answer of question increment score and so on...
        if ((answer1Clicked) && (correctAnswersList[currentQuestionNumber].equals("answer1"))) {
            totalCorrectAnswers++;
        } else if ((answer2Clicked) && (correctAnswersList[currentQuestionNumber].equals("answer2"))) {
            totalCorrectAnswers++;
        } else if ((answer3Clicked) && (correctAnswersList[currentQuestionNumber].equals("answer3"))) {
            totalCorrectAnswers++;
        } else if ((answer4Clicked) && (correctAnswersList[currentQuestionNumber].equals("answer4"))) {
            totalCorrectAnswers++;
        }

        // Count unanswered questions
        if (!answer1Clicked && !answer2Clicked && !answer3Clicked && !answer4Clicked) {
            totalNotAttempted++;
        }

        // Calculate the score
        score = totalCorrectAnswers * 10;

        // Set the answer flags to default
        answer1Clicked = false;
        answer2Clicked = false;
        answer3Clicked = false;
        answer4Clicked = false;
    }

    /**
     * showQuestions function is called to show the next question, images and possible answers on the screen,
     * It shows the next question only if the quiz has not been completed yet.
     */
    private void showQuestions() {

        // Show the current question number and total questions in the quiz
        TextView totalQuestionsTextView = findViewById(R.id.total_questions_text_view);

        // Set questions in the question, images and answers selection
        TextView questionsTextView = findViewById(R.id.questions_text_view);
        ImageView questionsImageView = findViewById(R.id.questions_image_view);

        RadioButton answer1RadioButton = findViewById(R.id.answer1_radio);
        RadioButton answer2RadioButton = findViewById(R.id.answer2_radio);
        RadioButton answer3RadioButton = findViewById(R.id.answer3_radio);
        RadioButton answer4RadioButton = findViewById(R.id.answer4_radio);

        // Reset the radio buttons when no answer is selected while new question is shown
        answer1RadioButton.setChecked(false);
        answer2RadioButton.setChecked(false);
        answer3RadioButton.setChecked(false);
        answer4RadioButton.setChecked(false);

        if (currentQuestionNumber < (totalQuestions)) {
            // Show question
            questionsTextView.setText(questions[currentQuestionNumber]);
            questionsImageView.setImageResource(images[currentQuestionNumber]);
            String slash = getString(R.string.slash);
            totalQuestionsTextView.setText(String.valueOf(currentQuestionNumber + 1) + slash + String.valueOf(totalQuestions));
            // Show Answer option
            answer1RadioButton.setText(answers[currentQuestionNumber][0]);
            answer2RadioButton.setText(answers[currentQuestionNumber][1]);
            answer3RadioButton.setText(answers[currentQuestionNumber][2]);
            answer4RadioButton.setText(answers[currentQuestionNumber][3]);

        } else {
            leaveHalf();
        }
    }

    /**
     * If user wants to leave the quiz, by leaveHalf button, then this also summarises the result.
     */
    public void leaveHalf() {

        quizComplete = true;

        // Calculate total incorrect answers
        totalIncorrectAnswers = (totalQuestions - (totalCorrectAnswers + totalNotAttempted));


        // Summary of the quiz
        String userNameForSummery = getString(R.string.user_name_for_summary);
        String totalQuestionsForSummary = getString(R.string.total_questions_for_summary);
        String correctQuestionsForSummary = getString(R.string.incorrect_questions_for_summary);
        String incorrectQuestionsForSummary = getString(R.string.incorrect_questions_for_summary);
        String notAttemptedQuestionsForSummary = getString(R.string.not_attempted_questions_for_summary);
        String scoreForSummary = getString(R.string.score_for_summary);

        String scoreSummary = userNameForSummery + playerName;
        scoreSummary += totalQuestionsForSummary + totalQuestions;
        scoreSummary += correctQuestionsForSummary + totalCorrectAnswers;
        scoreSummary += incorrectQuestionsForSummary + totalIncorrectAnswers;
        scoreSummary += notAttemptedQuestionsForSummary + totalNotAttempted;
        scoreSummary += scoreForSummary + score;

        // Show the score summary in toast
        Toast showResult = Toast.makeText(this, scoreSummary, Toast.LENGTH_LONG);
        showResult.show();

        // Disable the answer it button once the quiz is finished
        Button answerButton = findViewById(R.id.answer_it_button);
        answerButton.setEnabled(false);

        //Intent for ResultPage

        Intent resultIntent = new Intent(QuizPage.this, ResultPage.class);
        resultIntent.putExtra("playerName", String.valueOf(playerName));
        resultIntent.putExtra("totalQuestions", String.valueOf(totalQuestions));
        resultIntent.putExtra("totalCorrectAnswers", String.valueOf(totalCorrectAnswers));
        resultIntent.putExtra("totalIncorrectAnswers", String.valueOf(totalIncorrectAnswers));
        resultIntent.putExtra("totalNotAttempted", String.valueOf(totalNotAttempted));
        resultIntent.putExtra("score", String.valueOf(score));

        startActivity(resultIntent);
    }

    /**
     * If user wants to leave the by Leave button, then this summarises the result.
     */
    public void leaveButton(View view) {
        checkAnswers();
        leaveHalf();
    }

    /**
     * onRadioButtonClicked is called when a radio button is selected,
     * check which radio button was selected as answer,
     * make its flag as true and other answer flag as false
     */

    public void onRadioButtonClicked(View view) {

        switch (view.getId()) {

            case R.id.answer1_radio:
                answer1Clicked = true;

                answer2Clicked = false;
                answer3Clicked = false;
                answer4Clicked = false;
                break;
            case R.id.answer2_radio:
                answer2Clicked = true;

                answer1Clicked = false;
                answer3Clicked = false;
                answer4Clicked = false;
                break;
            case R.id.answer3_radio:
                answer3Clicked = true;

                answer2Clicked = false;
                answer1Clicked = false;
                answer4Clicked = false;
                break;
            case R.id.answer4_radio:
                answer4Clicked = true;

                answer1Clicked = true;
                answer2Clicked = false;
                answer3Clicked = false;
                break;
        }
    }
}
