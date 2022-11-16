package com.example.miningcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Reg(View view) {
        Intent intent;
        intent = new Intent(Register.this, MainActivity.class);
        startActivity(intent);
    }
}