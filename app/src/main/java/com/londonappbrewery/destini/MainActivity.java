package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mA1Button;
    Button mA2Button;
    TextView mQuestionText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
     mA1Button = (Button) findViewById(R.id.buttonTop);
     mA2Button = (Button) findViewById(R.id.buttonBottom);
     mQuestionText = (TextView) findViewById(R.id.storyTextView);
     mQuestionText.setText(R.string.T1_Story);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
     mA1Button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(getApplicationContext(),"Answer1 pressed",Toast.LENGTH_SHORT).show();
             updateQuestion3();
         }
     });
     mA2Button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(getApplicationContext(), "Answer2 Pressed", Toast.LENGTH_SHORT).show();
             updateQuestion2();
         }
     });

    }
    private void updateQuestion3(){
        mQuestionText.setText(R.string.T3_Story);
        mA1Button.setText(R.string.T3_Ans1);
        mA2Button.setText(R.string.T3_Ans2);
        mA1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionText.setText(R.string.T6_End);
                AlertDialog.Builder alert = new AlertDialog.Builder(getApplicationContext());
                alert.setTitle("GAME OVER");
                alert.setCancelable(false);
                alert.setMessage("END");
                alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alert.show();

            }

        });
        mA2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionText.setText(R.string.T5_End);
                AlertDialog.Builder alert = new AlertDialog.Builder(getApplicationContext());
                alert.setTitle("GAME OVER");
                alert.setCancelable(false);
                alert.setMessage("END");
                alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alert.show();
            }
        });
    }
    private void updateQuestion2(){
        mQuestionText.setText(R.string.T2_Story);
        mA1Button.setText(R.string.T2_Ans1);
        mA2Button.setText(R.string.T2_Ans2);
        mA1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion3();
            }
        });
        mA2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionText.setText(R.string.T4_End);
                AlertDialog.Builder alert = new AlertDialog.Builder(getApplicationContext());
                alert.setTitle("GAME OVER");
                alert.setCancelable(false);
                alert.setMessage("END");
                alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alert.show();
            }
        });
    }

}

