package com.androidhunger.opendagapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.androidhunger.navigationdrawerexample.R;

public class Pop extends Activity {

    @Override
    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.map_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.6));

    }
}
