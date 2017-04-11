package com.example.natna.demoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by natna on 4/11/2017.
 */

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
    }

    public void showGreetings(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
