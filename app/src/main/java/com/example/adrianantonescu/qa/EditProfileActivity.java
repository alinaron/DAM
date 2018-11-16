package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfileActivity extends AppCompatActivity {

    EditText etNume, etPrenume, etBio;
    Intent intent;
    Button btnSave;
    String nume, prenume, bio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        init();
    }
    private void init()
    {
        etBio=findViewById(R.id.edit_profile_et_bio);
        etPrenume=findViewById(R.id.edit_profile_et_first_name);
        etNume=findViewById(R.id.edit_profile_et_last_name);
        btnSave=findViewById(R.id.edit_profile_btn_save);
        btnSave.setOnClickListener(doSave());
    }
    private View.OnClickListener doSave(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getApplicationContext(),StudentProfileActivity.class);
                nume=etNume.getText().toString();
                prenume=etPrenume.getText().toString();
                bio=etBio.getText().toString();
                if(prenume.isEmpty()&&nume.isEmpty()&&bio.isEmpty()){
                    Toast.makeText(getApplicationContext(),R.string.edit_profile_enter_info_msg,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    intent.putExtra(constants.FIRST_NAME_KEY,prenume);
                    intent.putExtra(constants.LAST_NAME_KEY,nume);
                    intent.putExtra(constants.BIO_KEY,bio);
                    Toast.makeText(getApplicationContext(),getString(R.string.edit_profile_updated_profile_msg),Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }

            }
        };
    }

}
