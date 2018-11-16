package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TeacherProfileSettingsActivity extends AppCompatActivity {

    TextView tvChangePicture, tvChangeBio, tvLogout, tvCancel;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile_settings);
        init();
    }
    private void init()
    {
        tvChangePicture=findViewById(R.id.teacher_profile_settings_tv_change_profile_picture);
        tvCancel=findViewById(R.id.teacher_profile_settings_tv_cancel);
        tvChangeBio=findViewById(R.id.teacher_profile_settings_tv_change_bio);
        tvLogout=findViewById(R.id.teacher_profile_settings_tv_logout);
        tvChangeBio.setOnClickListener(changeBio());
        tvLogout.setOnClickListener(logout());
        tvCancel.setOnClickListener(cancel());
        tvChangePicture.setOnClickListener(changePicture());
    }

    private View.OnClickListener changePicture()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }
     private View.OnClickListener cancel(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };
     }

     private View.OnClickListener changeBio(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getApplicationContext(),ChangeBioActivity.class);
                startActivity(intent);
            }
        };
     }

     private View.OnClickListener logout(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getApplicationContext(),StartPageActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),getString(R.string.student_profile_settings_logout_message),Toast.LENGTH_SHORT).show();
            }
        };
     }
}
