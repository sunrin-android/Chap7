package com.example.sunrin.chap7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;
    ImageView image;
    Animation tranAnim, rotaAnim, scalAnim, alphAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        image = findViewById(R.id.image);

        tranAnim = AnimationUtils.loadAnimation(this,R.anim.translate);
        rotaAnim = AnimationUtils.loadAnimation(this,R.anim.rotate);
        rotaAnim = AnimationUtils.loadAnimation(this,R.anim.scale);
        rotaAnim = AnimationUtils.loadAnimation(this,R.anim.alpha);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                tranAnim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Toast.makeText(getApplicationContext(), "애니메이션 효과 끝!", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                image.startAnimation(tranAnim);
                break;
            case R.id.btn2:
                image.startAnimation(rotaAnim);
                break;
        }
    }

}
