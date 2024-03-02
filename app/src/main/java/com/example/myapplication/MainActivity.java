package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
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
        Button button = new Button(this);
        button.setText("Click");
        linearLayout.addView(button);
        setContentView(linearLayout);
       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), Profile.class);
                startActivity(in);

            }
        });
    }
}
