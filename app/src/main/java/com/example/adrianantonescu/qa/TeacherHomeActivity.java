package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TeacherHomeActivity extends AppCompatActivity {
    CardView cvProfile;
    CardView cvSignUp;
    CardView cvFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home);
        init();
    }
    private void init()
    {
        cvProfile=findViewById(R.id.teacher_home_profile_cardView);
        cvProfile.setOnClickListener(openProfile());
        cvSignUp=findViewById(R.id.teacher_home_signUp_cardView);
        cvSignUp.setOnClickListener(startSignUp());
        cvFeedback = findViewById(R.id.teacher_home_feedback_cardView);
        cvFeedback.setOnClickListener(startFeedback());
    }

    private View.OnClickListener startFeedback() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),WriteFeedback.class);
                startActivity(i);
            }
        };
    }

    private View.OnClickListener openProfile(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TeacherProfileActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener startSignUp(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SignUp.class);
                startActivity(i);
            }
        };
    }
}
