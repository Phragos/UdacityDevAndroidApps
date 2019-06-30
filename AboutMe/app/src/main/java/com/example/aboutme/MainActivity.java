package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
//import android.widget.EditText;
//import android.widget.TextView;

import com.example.aboutme.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This is no longer needed when using binding
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // This is without layout binding
        /*findViewById(R.id.done_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNickname(view);
            }
        });*/

        // This is with layout binding
        binding.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNickname(view);
            }
        });
    }

    private void addNickname(View view) {
        // This is needed if no layout binding exists
        /*EditText nicknameEditText = findViewById(R.id.nickname_edit);
        TextView nicknameTextView = findViewById(R.id.nickname_text);

        nicknameTextView.setText(nicknameEditText.getText().toString());
        nicknameEditText.setVisibility(View.GONE);
        view.setVisibility(View.GONE);
        nicknameTextView.setVisibility(View.VISIBLE);*/

        // With layout binding
        binding.nicknameText.setText(binding.nicknameEdit.getText());
        binding.nicknameEdit.setVisibility(View.GONE);
        binding.doneButton.setVisibility(View.GONE);
        binding.nicknameText.setVisibility(View.VISIBLE);

        // This is to make sure the keyboard gets hidden
         InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
         imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
