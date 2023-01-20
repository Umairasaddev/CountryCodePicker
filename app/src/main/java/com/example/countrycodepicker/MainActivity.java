package com.example.countrycodepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.ads.mediationtestsuite.dataobjects.Country;
import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    CountryCodePicker ccp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ccp = (CountryCodePicker) findViewById(R.id.ccp);

        ccp.setCountryForPhoneCode(+92);
        

    }
}