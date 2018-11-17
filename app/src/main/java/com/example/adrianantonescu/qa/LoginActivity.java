package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity{

    private Button loginButton;
    private TextView tvForgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
    }
    private void initComponents(){
        loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(homePageStudent());
        tvForgot = findViewById(R.id.tv_forgot_password);
        tvForgot.setOnClickListener(startForgot());
    }

    private View.OnClickListener startForgot() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ForgotPasswordActivity.class);
                startActivity(i);
            }
        };
    }


    private View.OnClickListener homePageStudent() {
            return new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),
                            HomeActivity.class);
                    startActivity(intent);
                }

            };
    }


}
