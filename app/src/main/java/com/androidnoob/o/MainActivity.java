package com.androidnoob.o;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv1);
        Button button = (Button) findViewById(R.id.button);

        textView.setOnClickListener(view -> textView.setText("Clicked!"));

        textView.setText(LocalDate.now().toString());

        textView.setJustify(true);
    }
}
