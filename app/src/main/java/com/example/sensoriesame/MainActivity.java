package com.example.sensoriesame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenAccelerometer (View view){
      Intent intent = new Intent(this , SensorAccelerometer.class);
       startActivity(intent);
    }

    public void OpenGravity (View view){
        /*Intent intent = new Intent(this , SensorGravity.class);
        startActivity(intent);*/
    }
    public void OpenGyroscope (View view){

    }
    public void OpenLight (View view){

    }
    public void OpenMagneticField (View view){

    }
    public void OpenPressure (View view){

    }
    public void OpenTemperature (View view){

    }
    public void OpenListAll (View view){

    }
    public void OpenOptions (View view){

    }

}