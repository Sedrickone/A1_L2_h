package com.onegmail.sedrick.a1_l2_h;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About_Me extends AppCompatActivity {

    String []skills;
    String []skills_it;
    TextView text_skills;
    TextView text_skills_it;
    String temp="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about__me);

        Resources res=getResources();

        skills=res.getStringArray(R.array.array_my_skills);
        skills_it=res.getStringArray(R.array.array_skills_in_IT);

        text_skills=(TextView)findViewById(R.id.text_personal_skills);
        text_skills_it=(TextView)findViewById(R.id.text_skills_in_it);

    }
    @Override
    protected void onStart() {
        super.onStart();
        for (int i = 0; i <skills.length ; i++) {temp=temp+skills[i]+'\n';}
        text_skills.setText(temp);temp="";
        for (int i = 0; i <skills_it.length ; i++) {temp=temp+skills_it[i]+'\n';}
        text_skills_it.setText(temp);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        text_skills.setText("");
        text_skills_it.setText("");
        temp="";
    }
}
