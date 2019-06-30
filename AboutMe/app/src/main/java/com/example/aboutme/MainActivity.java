package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.done_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNickname(view);
            }
        });
    }

    private void addNickname(View view) {
        EditText nicknameEditText = findViewById(R.id.nickname_edit);
        TextView nicknameTextView = findViewById(R.id.nickname_text);

        nicknameTextView.setText(nicknameEditText.getText().toString());
        nicknameEditText.setVisibility(View.GONE);
        view.setVisibility(View.GONE);
        nicknameTextView.setVisibility(View.VISIBLE);
    }
}
