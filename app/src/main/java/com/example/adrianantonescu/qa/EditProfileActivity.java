package com.example.adrianantonescu.qa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditProfileActivity extends AppCompatActivity {

    private EditText etBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        init();
    }
    private void init()
    {
        etBio=findViewById(R.id.edit_profile_et_bio);
    }

}
