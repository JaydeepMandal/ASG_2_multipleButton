package com.example.ee.asg_2_multiplebutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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

    public void myToast(String text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.show();
    }

    public void clickable(View v){
        switch (v.getId()){
            case R.id.true_button:
                myToast("✔  Correct  ✔");
                break;
            case R.id.false_button:
                myToast("❌  Incorrect  ❌");
                break;
            case R.id.ans_button:
                myToast("Answer is True");
                break;
            default:
                break;
        }
    }
}
