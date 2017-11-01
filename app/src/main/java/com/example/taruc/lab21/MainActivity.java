package com.example.taruc.lab21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT ="payment" ;
    public static final String LOAN_STATUS = "status";
    private EditText editTextCarPrice,editTextDownPayment,editTextLoadPeriod,editTextInterestRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCarPrice = (EditText)findViewById(R.id.editTextCarPrice);
        editTextDownPayment = (EditText)findViewById(R.id.editTextDownPayment);
        editTextLoadPeriod = (EditText)findViewById(R.id.editTextLoadPeriod);
        editTextInterestRate = (EditText)findViewById(R.id.editTextInterestRate);
    }

    public void calculateLoan(View view){
        //create an Explicit intent

        int price,payment,period,rate;

        price = Integer.parseInt(editTextCarPrice.getText().toString());
        payment = Integer.parseInt(editTextDownPayment.getText().toString());
        period = Integer.parseInt(editTextLoadPeriod.getText().toString());
        rate = Integer.parseInt(editTextInterestRate.getText().toString());

        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);

        //ToDO: calculate monthly payment and determine
        //loan application status approve or reject

        double monthlyPayment;
        String status;

        //Passing data using putExtra method
        intent.putExtra(MONTHLY_PAYMENT,monthlyPayment);
        intent.putExtra(LOAN_STATUS,status);
        startActivity(intent);
    }
}
