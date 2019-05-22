package com.androidhunger.opendagapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.androidhunger.navigationdrawerexample.R;

public class MainActivity extends AppCompatActivity


        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageButton g = findViewById(R.id.Googlemaps1);
        ImageButton g = findViewById(R.id.Googlemaps2);
        g.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Pop.class));
            }
        });
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (savedInstanceState == null) {
            Fragment newFragment = new HomeFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.content_frame, newFragment);
            ft.addToBackStack(null);
            ft.commit();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    public void goToInformatica(View v) {
        Intent a = new Intent(this, i.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


    }

    public void goToTechnischeInformatica(View v) {
        Intent b = new Intent(this, ti.class);
        startActivity(b);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void goToCommunicatie(View v) {
        Intent c = new Intent(this, C.class);
        startActivity(c);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void goToCMGT(View v) {
        Intent d = new Intent(this, CMGT.class);
        startActivity(d);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void goToCMD(View v) {
        Intent e = new Intent(this, CMD.class);
        startActivity(e);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.home) {
            fragment = new HomeFragment();
        } else if (id == R.id.studies) {
            fragment = new Studies();
        } else if (id == R.id.btnOpendagen) {
            fragment = new Questionform();
        } else if (id == R.id.btnTemp1) {
            fragment = new OpenDagen();
        } else if (id == R.id.btnOverHR) {
            fragment = new OverHr();
        }
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void share1(View v) {
        String date = "Vrijdag 17 april 2020";
        String opleiding = "Informatica";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));
    }

    public void share2(View v) {
        String date = "Maandag 6 januari 2020";
        String opleiding = "Informatica";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void share3(View v) {
        String date = "Vrijdag 17 april 2020";
        String opleiding = "Technische Informatica";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void share4(View v) {
        String date = "Maandag 6 januari 2020";
        String opleiding = "Technische Informatica";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void share5(View v) {
        String date = "Vrijdag 17 april 2020";
        String opleiding = "Communicatie";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void share6(View v) {
        String date = "Maandag 6 januari 2020";
        String opleiding = "Communicatie";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }


    public void share7(View v) {
        String date = "Vrijdag 17 april 2020";
        String opleiding = "Creative Media and Game Technologies";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void share8(View v) {
        String date = "Maandag 6 januari 2020";
        String opleiding = "Creative Media and Game Technologies";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void share9(View v) {
        String date = "Vrijdag 17 april 2020";
        String opleiding = "Communication and Multimedia Design";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void share10(View v) {
        String date = "Maandag 6 januari 2020";
        String opleiding = "Communication and Multimedia Design";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

    public void composeEmail(View v) {

        String to = ((EditText) findViewById(R.id.txtTo)).getText().toString();
        String sub = ((EditText) findViewById(R.id.txtSubject)).getText().toString();
        String mess = ((EditText) findViewById(R.id.txtMessage)).getText().toString();
        Intent mail = new Intent(Intent.ACTION_SENDTO);
        mail.setData(Uri.parse("mailto:"));
        mail.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        mail.putExtra(Intent.EXTRA_SUBJECT, sub);
        mail.putExtra(Intent.EXTRA_TEXT, mess);
        if (mail.resolveActivity(getPackageManager()) != null) {
            startActivity(mail);
        }
    }
}

