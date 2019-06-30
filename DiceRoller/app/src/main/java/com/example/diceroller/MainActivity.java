package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView diceImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.roll_button);
        // rollButton.setText("Let's roll");
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // A toast is a small "pop-up" text showing up on the screen (like the phone's "quick charge connected")
                //Toast.makeText(getApplicationContext(), "Button clicked", Toast.LENGTH_SHORT).show();
                // Call the method rollDice
                rollDice();
            }
        });
        // Getting the image view holding the result
        diceImageView = findViewById(R.id.result_image);
    }

    // Generate a random number between 1 and 6 inclusive and return the appropriate image
    private void rollDice() {
        // Random number [1,6]
        int rollResult = (int) ((Math.random() * 6) + 1);
        // Getting the image ID
        int resultImageID;
        switch (rollResult) {
            case 1:
                resultImageID = R.drawable.dice_1;
                break;
            case 2:
                resultImageID = R.drawable.dice_2;
                break;
            case 3:
                resultImageID = R.drawable.dice_3;
                break;
            case 4:
                resultImageID = R.drawable.dice_4;
                break;
            case 5:
                resultImageID = R.drawable.dice_5;
                break;
            default:
                resultImageID = R.drawable.dice_6;
        }
        // Setting the new image view source
        diceImageView.setImageResource(resultImageID);
    }
}
