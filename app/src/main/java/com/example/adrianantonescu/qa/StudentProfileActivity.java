package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StudentProfileActivity extends AppCompatActivity {
    ImageView imgSettings;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        init();
    }
    private void init()
    {
        imgSettings=findViewById(R.id.student_activity_image_view_settings);
        imgSettings.setOnClickListener(openSettings());
        btnBack=findViewById(R.id.student_profile_btn_back);
        btnBack.setOnClickListener(backTo());
    }
    private View.OnClickListener openSettings()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StudentProfileSettingsActivity.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener backTo(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };
    }
}
