package com.londonappbrewery.magiceightball;

import android.app.Activity;
// import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        final int ballArray[] = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Button myButton = findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random nrg = new Random();

                int number = nrg.nextInt(5);  // Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive)

                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }
}
