package com.example.colormyviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListeners();
    }

    private void setListeners() {

        ArrayList<View> clickableViews = new ArrayList<>();
        clickableViews.add(findViewById(R.id.box_one_text));
        clickableViews.add(findViewById(R.id.box_two_text));
        clickableViews.add(findViewById(R.id.box_three_text));
        clickableViews.add(findViewById(R.id.box_four_text));
        clickableViews.add(findViewById(R.id.box_five_text));
        clickableViews.add(findViewById(R.id.colored_boxes_layout));

        for (View clkView : clickableViews) {
            clkView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    makeColored(view);
                }
            });
        }

    }

    private void makeColored(View view) {

        int currentView = view.getId();

        switch (currentView) {
            case R.id.box_one_text:
                view.setBackgroundColor(Color.MAGENTA);
                break;
            case R.id.box_two_text:
                view.setBackgroundColor(Color.GRAY);
                break;
            case R.id.box_three_text:
                view.setBackgroundResource(android.R.color.holo_green_light);
                break;
            case R.id.box_four_text:
                view.setBackgroundResource(android.R.color.holo_green_dark);
                break;
            case R.id.box_five_text:
                view.setBackgroundResource(android.R.color.holo_orange_light);
                break;
            default:
                view.setBackgroundColor(Color.LTGRAY);
        }

// This part makes the app crash, need to figure out why
//        //TextView testView = (TextView) findViewById(R.id.test_text);
//
//        // Randomly select between Color class colors or Android color resources
//        int colorTypePicker = (int) (Math.round(Math.random()));
//
//
//
//        if (colorTypePicker == 1) {
//            // Boxes using Color class colors for background
//            int[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY, Color.GREEN, Color.LTGRAY, Color.MAGENTA, Color.RED, Color.WHITE, Color.YELLOW};
//            int colorIndex = (int) (Math.random() * colors.length) + 1;
//
//            //String testText =  "Color class: " + Integer.toString(colors[colorIndex]);
//            //testView.setText(testText);
//            view.setBackgroundColor(colors[colorIndex]);
//        } else {
//            // Boxes using Android color resources for background
//            int[] resID = {android.R.color.background_dark, android.R.color.background_light, android.R.color.black, android.R.color.darker_gray, android.R.color.holo_blue_bright,
//                    android.R.color.holo_green_dark, android.R.color.holo_orange_dark, android.R.color.holo_purple, android.R.color.holo_red_light, android.R.color.holo_green_light};
//            int resIndex = (int) (Math.random() * resID.length) + 1;
//
//            //String testText =  "Android color resource: " + Integer.toString(resID[resIndex]);
//            //testView.setText(testText);
//            view.setBackgroundResource(resID[resIndex]);
//
//        }

    }

}
