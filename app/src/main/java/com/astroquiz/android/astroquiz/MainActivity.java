package com.astroquiz.android.astroquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * EditView where user enter its name.
     * This data is passed through QuizPage and ResultPage.
     */
    public void quizPlay(View view) {

        String pleaseEnterName = getString(R.string.please_enter_name_);

        EditText nameText = findViewById(R.id.name);
        String playerName = String.valueOf(nameText.getText());

        if (playerName.length() > 0) {

            Intent quizListIntent = new Intent(MainActivity.this,QuizPage.class);
            quizListIntent.putExtra("playerName", String.valueOf(playerName));
            startActivity(quizListIntent);

        }else {
            Toast userName = Toast.makeText(this,pleaseEnterName, Toast.LENGTH_LONG);
            userName.show();
        }
    }
}