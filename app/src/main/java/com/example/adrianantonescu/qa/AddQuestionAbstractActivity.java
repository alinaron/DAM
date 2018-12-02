package com.example.adrianantonescu.qa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public abstract class AddQuestionAbstractActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected abstract void initComponents();

    protected abstract boolean isValid();

    protected abstract View.OnClickListener saveEvent();


}
