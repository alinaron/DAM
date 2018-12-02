package com.example.adrianantonescu.qa;


import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adrianantonescu.qa.network.ManagerHttp;
import com.example.adrianantonescu.qa.network.ReadJson;
import com.example.adrianantonescu.qa.network.Specializare;

import org.json.JSONException;

import java.net.MalformedURLException;
import java.net.URL;


public class StatisticsActivity extends AppCompatActivity {

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        btnBack=findViewById(R.id.statistics_btnBack);
        btnBack.setOnClickListener(backHome());
    }

    private View.OnClickListener backHome() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(i);
            }
        };
    }
}
