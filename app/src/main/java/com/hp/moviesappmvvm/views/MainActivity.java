package com.hp.moviesappmvvm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hp.moviesappmvvm.R;

public class MainActivity extends AppCompatActivity {
//http://www.omdbapi.com/?s=kushi&apikey=4412cc11
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
