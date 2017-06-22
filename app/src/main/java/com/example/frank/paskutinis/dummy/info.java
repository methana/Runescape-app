package com.example.frank.paskutinis.dummy;


import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ListIterator;

public class info {

    public class getnames extends AsyncTask<Void, Void, ArrayList<String>>
    {

        @Override
        protected ArrayList<String> doInBackground(Void... params) {
            {
                ArrayList<String>alldata=new ArrayList<String>();

                try
                {
                    URL margins=new URL("http://python-koneriasu.rhcloud.com/static/data/flipmrg_n.txt");
                    BufferedReader in=new BufferedReader(new InputStreamReader(margins.openStream()));

                    String inputLine;
                    while((inputLine=in.readLine())!=null)
                    {
                        alldata.add(inputLine);
                    }

                    in.close();

                }

                catch (MalformedURLException e) {
                } catch (IOException e) {
                }
                return alldata;
            }
        }

        @Override
        protected void onProgressUpdate(Void... Params) {
            ArrayList<String>alldata=new ArrayList<String>();

            ListIterator<String> it = alldata.listIterator();
        }
    }


    public class getbuy extends AsyncTask<Void, Void, ArrayList<String>>
    {

        @Override
        protected ArrayList<String> doInBackground(Void... params) {
            {
                ArrayList<String>alldata=new ArrayList<String>();

                try
                {
                    URL margins=new URL("http://python-koneriasu.rhcloud.com/static/data/flipmrg_b.txt");
                    BufferedReader in=new BufferedReader(new InputStreamReader(margins.openStream()));

                    String inputLine;
                    while((inputLine=in.readLine())!=null)
                    {
                        alldata.add(inputLine);
                    }

                    in.close();

                }

                catch (MalformedURLException e) {
                } catch (IOException e) {
                }
                return alldata;
            }
        }

        @Override
        protected void onProgressUpdate(Void... Params) {
            ArrayList<String>alldata=new ArrayList<String>();

            ListIterator<String> it = alldata.listIterator();
        }
    }


    public class getsell extends AsyncTask<Void, Void, ArrayList<String>>
    {

        @Override
        protected ArrayList<String> doInBackground(Void... params) {
            {
                ArrayList<String>alldata=new ArrayList<String>();

                try
                {
                    URL margins=new URL("http://python-koneriasu.rhcloud.com/static/data/flipmrg_s.txt");
                    BufferedReader in=new BufferedReader(new InputStreamReader(margins.openStream()));

                    String inputLine;
                    while((inputLine=in.readLine())!=null)
                    {
                        alldata.add(inputLine);
                    }

                    in.close();

                }

                catch (MalformedURLException e) {
                } catch (IOException e) {
                }
                return alldata;
            }
        }

        @Override
        protected void onProgressUpdate(Void... Params) {
            ArrayList<String>alldata=new ArrayList<String>();

            ListIterator<String> it = alldata.listIterator();
        }
    }


}
