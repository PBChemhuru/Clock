package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

Switch aSwitch;
AnalogClock analogClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch aSwitch = (Switch)findViewById(R.id.switch1);
        AnalogClock analogClock=(AnalogClock)findViewById(R.id.analog);
    }

    public void onClick(View view) {
if(aSwitch.isChecked())
    analogClock.setVisibility(view.VISIBLE);
else
    analogClock.setVisibility(view.INVISIBLE);
    }
}