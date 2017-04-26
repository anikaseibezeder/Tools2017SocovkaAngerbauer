package com.hangon.romaneso_simsonimus_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
		
		setContentView(R.layout.activity_main); //Well, code duplication is perfect
    }
	public void thisIsANewMethod(){}
}
