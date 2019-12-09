package com.tenz.tenzutilmaster;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.tenz.tenzutillib.util.StringUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean empty = StringUtil.isEmpty("");
        Log.e("tenz","empty:-------------"+empty);

    }
}
