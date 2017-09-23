package me.kirillov22.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementCounter(View view) {
        int increment;
        increment = getIncrement();
        setCount(increment);
        TextView counter = (TextView)findViewById(R.id.txtCount);
        counter.setText("Count: " + getCount());
    }

    public int getIncrement() {
        Switch s = (Switch) findViewById((R.id.switchAdd2));

        if (s.isChecked()) {
            return 2;
        } else {
            return 1;
        }
    }

    public void clearCounter(View view) {
        int value = 0;
        TextView counter = (TextView)findViewById(R.id.txtCount);
        setCount(value);
        counter.setText("Count: " + getCount());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        if (value == 0) {
            count = 0;
        } else {
            count += value;
        }
    }
}
