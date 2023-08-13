package com.spacer.waitgo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class IntroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro); //xml , java 소스 연결

        ImageView intro_gif = (ImageView) findViewById(R.id.intro_gif);
        Glide.with(this).load(R.drawable.intro).into(intro_gif);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent); //인트로 실행 후 바로 MainActivity로 넘어감.
                //finish();
            }
        }, 3000); //1초 후 인트로 실행
    }

/*    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }*/
}