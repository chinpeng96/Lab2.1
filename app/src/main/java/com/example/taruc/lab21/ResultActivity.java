package com.example.taruc.lab21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent =getIntent();
        double payment;
        String status;
        payment = intent.getDoubleExtra(MainActivity.MONTHLY_PAYMENT,0);
        status = intent.getStringExtra(MainActivity.LOAN_STATUS);
    }

    public void cloaseActivity(View view){
        finish();
    }
}
