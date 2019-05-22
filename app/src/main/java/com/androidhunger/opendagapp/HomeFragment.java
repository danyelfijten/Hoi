package com.androidhunger.opendagapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.androidhunger.navigationdrawerexample.R;

public class HomeFragment extends Fragment implements View.OnClickListener {
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Opkomende open dagen");
        Button Questionform = getView().findViewById(R.id.btnTemp1);
        Button OverHR = getView().findViewById(R.id.btnOverHR);
        Button OD = getView().findViewById(R.id.btnOpendagen);
        Button Stud = getView().findViewById(R.id.btnStudies);

        Stud.setOnClickListener(this);
        Questionform.setOnClickListener(this);
        OD.setOnClickListener(this);
        OverHR.setOnClickListener(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.home, container, false);
    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.btnTemp1:
                fragment = new Questionform();
                break;
            case R.id.btnOpendagen:
                fragment = new OpenDagen();
                break;
            case R.id.btnOverHR:
                fragment = new OverHr();
                break;
            case R.id.btnStudies:
                fragment = new Studies();
                break;

        }

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment)
                .addToBackStack(null)
                .commit();
    }

}
