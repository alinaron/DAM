package com.example.adrianantonescu.qa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.adrianantonescu.qa.util.QuestionFactory;

public abstract class AddQuestionAbstractActivity extends AppCompatActivity {

    protected QuestionFactory questionFactory = QuestionFactory.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected abstract void initComponents();

    protected abstract boolean isValid();

    protected abstract View.OnClickListener saveEvent();


}
