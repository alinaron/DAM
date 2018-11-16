package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TeacherProfileActivity extends AppCompatActivity {

    ImageView ivSettings;
    TextView tvBio;
    Button btnBack;
    Intent intent;
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
        tvBio=findViewById(R.id.teacher_profile_tv_bio);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getApplicationContext(),TeacherHomeActivity.class);
                startActivity(intent);
            }
        });
        intent=getIntent();
        String newBio = intent.getStringExtra(constants.BIO_KEY);
        if(newBio!=null)
            tvBio.setText(newBio);
    }
    private View.OnClickListener openSettings()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getApplicationContext(),TeacherProfileSettingsActivity.class);
                startActivity(intent);
            }
        };
    }
}
