package com.udacity.androidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class JokePresenterActivity extends AppCompatActivity implements JokePresenterFragment.JokeRequestHandler {

    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_presenter);

        setTitle("Joke");

        joke = getIntent().getStringExtra("JOKE");
    }


    @Override
    public String onJokeRequest() {
        if (joke == null) {
            joke = getIntent().getStringExtra("JOKE");
        }
        return joke;
    }
}
