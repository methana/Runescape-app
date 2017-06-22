package com.example.frank.paskutinis.dummy;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.example.frank.paskutinis.CheckNetwork;
import com.example.frank.paskutinis.R;
import java.util.ArrayList;


public class list extends AppCompatActivity {

    boolean timePassed=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        refresh();
    }
    public void startRefresh(View view)
    {
        final Context context = this;
        Intent intent = new Intent(context, list.class);
        if(CheckNetwork.isInternetAvailable(list.this)){
            refresh();
        }
        else
            Toast.makeText(list.this,getString(R.string.no_internet) , Toast.LENGTH_LONG).show();
    }

    public void refresh(){
        if(timePassed) {
            timePassed=false;
            gavimas gau = new gavimas();
            ArrayList<SearchResults> searchResults = gau.GetSearchResults();

            final ListView lv = (ListView) findViewById(R.id.listView2);
            lv.setAdapter(new MyCustomBaseAdapter(this, searchResults));
        }

        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        timePassed=true;
                    }
                },
                4000
        );
    }

}
