package com.example.myhelpguy.UI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.myhelpguy.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ProblemList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setSubtitle("Services");


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bchousing.org/housing-assistance/homelessness-services/drop-in-centres"));
        startActivity(browserIntent);

    }


    public void browser2(View view) {
        Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bchousing.org/housing-assistance/homelessness-services/emergency-shelter-program"));
        startActivity(browserIntent2);

    }


    public void browser3(View view) {
        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://redbookonline.bc211.ca/"));
        startActivity(browserIntent3);

    }






}
