package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity{

    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
    }
    private void initComponents(){
        loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(homePageStudent());
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
