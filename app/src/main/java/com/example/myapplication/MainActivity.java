package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);
        TextView textView = new TextView(this);
        textView.setText("Checkers Board");
        textView.setTextSize(24);
        linearLayout.addView(textView);
        GridView gridView = new GridView(this);
        gridView.setAdapter(new CheckersAdapter(this));
        gridView.setNumColumns(8);
        linearLayout.addView(gridView);
        setContentView(linearLayout);
    }
}
