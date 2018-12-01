package com.example.adrianantonescu.qa;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
    }
}
