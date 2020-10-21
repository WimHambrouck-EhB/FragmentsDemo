package org.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements EersteFragment.OnButtonClickedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void OnButtonClicked(String text) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        TweedeFragment tweedeFragment = (TweedeFragment) fragmentManager.findFragmentById(R.id.fragment2);
        if (tweedeFragment != null)
            tweedeFragment.updateText(text);
    }
}