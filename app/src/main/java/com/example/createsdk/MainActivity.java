package com.example.createsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pencil.toaster.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this,"Show Sdk toast");
    }
}