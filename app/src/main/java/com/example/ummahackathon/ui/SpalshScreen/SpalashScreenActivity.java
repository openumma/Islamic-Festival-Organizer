package com.example.ummahackathon.ui.SpalshScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.ummahackathon.MainActivity;
import com.example.ummahackathon.R;

public class SpalashScreenActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN =3000;
    Animation logoanimation;
    ImageView imageLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_spalash_screen);
        getSupportActionBar().hide();
        logoanimation = AnimationUtils.loadAnimation(this,R.anim.logo_animation);
        imageLogo = findViewById(R.id.iv_logo);

        imageLogo.setAnimation(logoanimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}