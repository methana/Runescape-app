package com.example.frank.paskutinis.dummy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.example.frank.paskutinis.CheckNetwork;
import com.example.frank.paskutinis.R;

public class about extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void startAbout(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://python-koneriasu.rhcloud.com"));
        if (CheckNetwork.isInternetAvailable(about.this))
            startActivity(browserIntent);
        else
            Toast.makeText(about.this, getString(R.string.no_internet), Toast.LENGTH_LONG).show();
    }

}
