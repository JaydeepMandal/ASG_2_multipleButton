package com.example.ee.asg_2_multiplebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button trueButton;
    Button falseButton;
    Button ansButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = (Button) findViewById(R.id.true_button);
        falseButton = (Button) findViewById(R.id.false_button);
        ansButton = (Button) findViewById(R.id.ans_button);
    }

    public void clickable(View v){
        String text = "";
        switch (v.getId()){
            case R.id.true_button:
                text = "✔  Correct  ✔";
                break;
            case R.id.false_button:
                text = "❌  Incorrect  ❌";
                break;
            case R.id.ans_button:
                text = "Answer is True";
                break;
            default:
                break;
        }
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
}
