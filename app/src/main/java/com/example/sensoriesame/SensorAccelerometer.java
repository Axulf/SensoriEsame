package com.example.sensoriesame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.List;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;


public class SensorAccelerometer extends AppCompatActivity {
SensorManager sensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_accelerometer);
       final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
      sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> mList = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        for (int eloisa=1; eloisa<=mList.size(); eloisa++){
            LinearLayout ll = new LinearLayout(this);
            final Button btn = new Button(this);
            btn.setId(eloisa);
            btn.setText("Sensore Accelerometro numero: "+eloisa);
            btn.setLayoutParams(params);
            ll.addView(btn);
            lm.addView(ll);

        }

    }
    

}
