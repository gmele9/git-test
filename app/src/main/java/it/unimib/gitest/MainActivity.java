package it.unimib.gitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // a commento from test branch
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // a second commento from test branch
    }
}
