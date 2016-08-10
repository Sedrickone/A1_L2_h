package com.onegmail.sedrick.a1_l2_h;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Launch_Activity extends AppCompatActivity {

    Animation anim;
    TextView launcher_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim= AnimationUtils.loadAnimation(this,R.anim.anim_text);
        launcher_text=(TextView)findViewById(R.id.text_1);

        launcher_text.startAnimation(anim);
        launcher_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Launch_Activity.this,About_Me.class);
                startActivity(intent);
            }
        });

    }
}
