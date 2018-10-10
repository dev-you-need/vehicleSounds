package com.deerslab.transport;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by keeper on 01.02.2016.
 */
public class MainMenuActivity extends Activity {

    private static MainMenuActivity mInstance = null;

    private final String TAG = getClass().getSimpleName();

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_menu_activity);

        Button btnTransport = (Button) findViewById(R.id.btnTransport);
        btnTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, TransportActivity.class));
            }
        });

        Button btnWorkMach = (Button) findViewById(R.id.btnWorkMach);
        btnWorkMach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, WorkMachActivity.class));
            }
        });

    }

    public static MainMenuActivity getInstance(){
        if(mInstance == null)
        {
            mInstance = new MainMenuActivity();
        }
        return mInstance;
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
