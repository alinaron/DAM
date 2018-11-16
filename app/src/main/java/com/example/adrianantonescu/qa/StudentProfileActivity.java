package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentProfileActivity extends AppCompatActivity {
    ImageView imgSettings;
    Button btnBack;
    TextView tvNumePrenume, tvBio;
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
        tvNumePrenume=findViewById(R.id.student_profile_tv_nume);
        tvBio=findViewById(R.id.student_profile_tv_bio);
        Intent intent=getIntent();
        String prenume,nume,bio;
        prenume=intent.getStringExtra(constants.FIRST_NAME_KEY);
        nume=intent.getStringExtra(constants.LAST_NAME_KEY);
        bio=intent.getStringExtra(constants.BIO_KEY);
        if(prenume!=null&&nume!=null)
            if(!prenume.isEmpty()&&!nume.isEmpty())
                tvNumePrenume.setText(String.format("%s %s", nume, prenume));
        if(bio!=null)
            if(!bio.isEmpty())
                tvBio.setText(bio);
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
                Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        };
    }
}
