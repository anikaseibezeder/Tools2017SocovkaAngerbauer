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
	public void thisIsANewMethod(){
		System.out.println("Hello unnecessary comment!");
		int i = 0;
		int a = 21;
		
		//This should be the bugfix
		i=1;
		//Second one
		i=4;
	}
	public void thisIsAVeryNewMethod(){
		int x = 32;
	}
}
