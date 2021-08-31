package com.reynoldsethan.buttonstextviewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button increase_power;
    Button decrease_power;
    TextView power;
    EditText set_power;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increase_power = findViewById(R.id.new_button);
        decrease_power = findViewById(R.id.lower_button);
        power = findViewById(R.id.new_view);
        decrease_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count-=1000;
                System.out.println("POWER: " + count);
                Log.i("decreasing_power","" + count);
                if(count>=9000)
                    power.setText("IT'S OVER 9000: " + count);
                else
                    power.setText("POWER: " + count);
            }
        });
        increase_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count+=1000;
                System.out.println("POWER: " + count);
                Log.i("increasing_power","" + count);
                if(count>=9000)
                    power.setText("IT'S OVER 9000: " + count);
                else
                    power.setText("POWER: " + count);
            }
        });
    }
}