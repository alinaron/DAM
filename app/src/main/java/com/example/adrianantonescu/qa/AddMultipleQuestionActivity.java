package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddMultipleQuestionActivity extends AppCompatActivity {

    Intent intent;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_multiple_question);
        initComponents();
        intent = getIntent();
    }

    private void initComponents(){
        btnSave = findViewById(R.id.add_simple_question_button_save);
        btnSave.setOnClickListener(saveEvent());
    }

    private View.OnClickListener saveEvent() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };
    }
}
