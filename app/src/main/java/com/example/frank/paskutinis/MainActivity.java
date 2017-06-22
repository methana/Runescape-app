package com.example.frank.paskutinis;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.example.frank.paskutinis.dummy.about;
import com.example.frank.paskutinis.dummy.list;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openMargins(View view)
    {
        Intent intent = new Intent(this,list.class);
        if (CheckNetwork.isInternetAvailable(MainActivity.this))
            startActivity(intent);
        else
            Toast.makeText(MainActivity.this, getString(R.string.no_internet), Toast.LENGTH_LONG).show();

    }
    public void openAbout(View view)
    {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }
    public void exit(View view)
    {
        finish();
        System.exit(0);
    }
}
