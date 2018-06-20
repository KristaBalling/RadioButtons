package com.theironyard.radiobuttons.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupID);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = (RadioButton) findViewById(checkedId);
                switch (radioButton.getId()) {
                    case R.id.yesID: {
                        if (radioButton.isChecked()) {

                            Log.d("RD", "YES!!");
                        }
                    }
                    break;

                    case R.id.noID: {
                        if (radioButton.isChecked()) {
                            Log.d("RD", "NOPE!!");
                        }
                    }
                    break;

                    case R.id.maybeID: {
                        if (radioButton.isChecked()) {
                            Log.d("RD", "MAYBE!!");
                        }
                    }
                    break;

                }
            }
        });


    }
}
