package com.example.classtimereminder;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
//                Intent mainIntent = new Intent(this,MainActivity.class);
//                startActivity(mainIntent);
                nextActivity();
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    public void onClickContinue(View v)
    {
        nextActivity();
    }
    public void nextActivity()
    {
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
