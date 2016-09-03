package com.udacity.androidlib;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokePresenterFragment extends Fragment {
    private TextView jokeText;

    public interface JokeRequestHandler {
        public String onJokeRequest();
    }

    private JokeRequestHandler jokeRequestHandler;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        jokeRequestHandler = (JokeRequestHandler) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke_presenter, container, false);
        jokeText = (TextView) rootView.findViewById(R.id.tv_joke);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        jokeText.setText(jokeRequestHandler.onJokeRequest());
    }
}
