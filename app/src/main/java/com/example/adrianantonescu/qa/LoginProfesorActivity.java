package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginProfesorActivity extends AppCompatActivity {

    private Button btnLogin;
    private TextView tvForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_profesor);
        initComponents();
    }
    private void initComponents(){
        btnLogin = findViewById(R.id.btn_login_profesor);
        btnLogin.setOnClickListener(startTeacherHome());
        tvForgot = findViewById(R.id.tv_forgot_password_profesor);
        tvForgot.setOnClickListener(startForgot());
    }
    private View.OnClickListener startTeacherHome(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), TeacherHomeActivity.class);
                startActivity(i);
            }
        };
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

}
