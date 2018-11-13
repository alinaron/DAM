package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPageActivity extends AppCompatActivity {
    private Button btnStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        initComponents();
    }
    private void initComponents(){
        btnStudent = findViewById(R.id.btn_student);
        btnStudent.setOnClickListener(startLogin());
    }
    private View.OnClickListener startLogin(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        };
    }
}
