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

    private static final String link="https://api.myjson.com/bins/hpdv6";
    private URL url;

    {
        try {
            url = new URL(link);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private Specializare specializare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        @SuppressLint("StaticFieldLeak") ManagerHttp managerHttp=new ManagerHttp(){
            @Override
            protected void onPostExecute(String s) {
               // Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                try {
                    specializare=ReadJson.read(s);
                    Toast.makeText(getApplicationContext(),specializare.toString(),Toast.LENGTH_LONG).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        managerHttp.execute(url);
    }

}
