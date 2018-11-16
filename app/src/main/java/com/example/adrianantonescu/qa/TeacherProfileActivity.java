package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TeacherProfileActivity extends AppCompatActivity {

    ImageView ivSettings;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);
        initializare();
    }

    private void initializare() {
        ivSettings=findViewById(R.id.teacher_activity_image_view_settings);
        ivSettings.setOnClickListener(openSettings());
        btnBack=findViewById(R.id.teacher_profile_btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private View.OnClickListener openSettings()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TeacherProfileSettingsActivity.class);
                startActivity(intent);
            }
        };
    }
}
