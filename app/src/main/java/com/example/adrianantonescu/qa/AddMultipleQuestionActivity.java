package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.adrianantonescu.qa.util.Question;
import com.example.adrianantonescu.qa.util.QuestionFactory;

public class AddMultipleQuestionActivity extends AddQuestionAbstractActivity {

    Intent intent;
    Button btnSave;
    EditText tidQuestionText;
    Spinner spnSubject;
    TextInputEditText tidQuestionVarA;
    TextInputEditText tidQuestionVarB;
    TextInputEditText tidQuestionVarC;
    TextInputEditText tidQuestionVarD;
    RadioButton rbVarA;
    RadioButton rbVarB;
    RadioButton rbVarC;
    RadioButton rbVarD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_multiple_question);
        initComponents();
        intent = getIntent();
    }


    protected void initComponents() {
        btnSave = findViewById(R.id.add_multiple_question_button_save);
        btnSave.setOnClickListener(saveEvent());
        tidQuestionText = findViewById(R.id.add_multiple_question_te_question);
        tidQuestionVarA = findViewById(R.id.add_multiple_question_tid_a);
        tidQuestionVarB = findViewById(R.id.add_multiple_question_tid_b);
        tidQuestionVarC = findViewById(R.id.add_multiple_question_tid_c);
        tidQuestionVarD = findViewById(R.id.add_multiple_question_tid_d);
        rbVarA = findViewById(R.id.add_multiple_question_rb_a);
        rbVarB = findViewById(R.id.add_multiple_question_rb_b);
        rbVarC = findViewById(R.id.add_multiple_question_rb_c);
        rbVarD = findViewById(R.id.add_multiple_question_rb_d);
    }

    @Override
    protected boolean isValid() {
        if (tidQuestionText.getText() == null ||
                tidQuestionText.getText().toString().trim().isEmpty() ||
                tidQuestionText.getText().toString() == null) {
            tidQuestionText.setError(getString(R.string.add_simple_question_error1));
            return false;
        }
        if (tidQuestionVarA.getText() == null ||
                tidQuestionVarA.getText().toString().trim().isEmpty() ||
                tidQuestionVarA.getText().toString() == null) {
            tidQuestionVarA.setError(getString(R.string.add_simple_question_error2));
            return false;
        }
        if (tidQuestionVarB.getText() == null ||
                tidQuestionVarB.getText().toString().trim().isEmpty() ||
                tidQuestionVarB.getText().toString() == null) {
            tidQuestionVarB.setError(getString(R.string.add_simple_question_error2));
            return false;
        }
        if (tidQuestionVarC.getText() == null ||
                tidQuestionVarC.getText().toString().trim().isEmpty() ||
                tidQuestionVarC.getText().toString() == null) {
            tidQuestionVarC.setError(getString(R.string.add_simple_question_error2));
            return false;
        }
        if (tidQuestionVarD.getText() == null ||
                tidQuestionVarD.getText().toString().trim().isEmpty() ||
                tidQuestionVarD.getText().toString() == null) {
            tidQuestionVarD.setError(getString(R.string.add_simple_question_error2));
            return false;
        }
        if (!rbVarA.isChecked() && !rbVarB.isChecked() && !rbVarC.isChecked() && !rbVarD.isChecked()) {
            rbVarA.setError(getString(R.string.add_simple_question_error3));
            return false;
        }
        return true;
    }

    protected View.OnClickListener saveEvent() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Question q;
                if (isValid()) {
                    String subject = "BPC";
                    String questionText = tidQuestionText.getText().toString().trim();
                    String varA = tidQuestionVarA.getText().toString().trim();
                    String varB = tidQuestionVarB.getText().toString().trim();
                    String varC = tidQuestionVarC.getText().toString().trim();
                    String varD = tidQuestionVarD.getText().toString().trim();
                    boolean varCorectaA = false;
                    boolean varCorectaB = false;
                    boolean varCorectaC = false;
                    boolean varCorectaD = false;
                    if (rbVarA.isChecked())
                        varCorectaA = true;
                    if (rbVarB.isChecked())
                        varCorectaB = true;
                    if (rbVarC.isChecked())
                        varCorectaC = true;
                    if (rbVarD.isChecked())
                        varCorectaD = true;
                    q = questionFactory.createQuestion("multiple",
                            subject, questionText, varA, varB, varC, varD, "a");
                    //unsafe but sry
                    AddQuestionActivity.questions.add(q);
                    finish();
                }
            }
        };
    }
}
