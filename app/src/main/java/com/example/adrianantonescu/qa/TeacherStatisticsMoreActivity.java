package com.example.adrianantonescu.qa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adrianantonescu.qa.network.Colectiv;
import com.example.adrianantonescu.qa.util.CustomAdapter;
import com.example.adrianantonescu.qa.util.constants;

import java.util.List;

public class TeacherStatisticsMoreActivity extends AppCompatActivity {

    private ListView listView;
    private List<Colectiv> list1=null,list2=null,list3=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_statistics_more);
        init();
    }
    private void init(){
        listView=findViewById(R.id.lvSpecializare);
        Intent intent=getIntent();
        if(intent!=null){
            list1= (List<Colectiv>) intent.getSerializableExtra(constants.INFO_EC_KEY);
            list2=(List<Colectiv>)intent.getSerializableExtra(constants.CIBE_KEY);
            list3=(List<Colectiv>)intent.getSerializableExtra(constants.STAT_KEY);
        }
        if(list1!=null)
            Toast.makeText(getApplicationContext(),list1.toString(),Toast.LENGTH_LONG).show();
        if(list2!=null)
            Toast.makeText(getApplicationContext(),list2.toString(),Toast.LENGTH_LONG).show();
        if(list3!=null)
            Toast.makeText(getApplicationContext(),list3.toString(),Toast.LENGTH_LONG).show();
        //CustomAdapter adapter=new CustomAdapter(getApplicationContext(),R.layout.lv_teacher_statistics,)
    }

}
