package com.example.frank.paskutinis.dummy;

import com.example.frank.paskutinis.R;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class gavimas {

    public ArrayList<SearchResults> GetSearchResults(){

        info inf = new info();

        ArrayList<String> names= new ArrayList<String>();
        ArrayList<String> buy= new ArrayList<String>();
        ArrayList<String> sell= new ArrayList<String>();
        ArrayList<Integer> profit= new ArrayList<Integer>();
        ArrayList<Integer> percentage= new ArrayList<Integer>();
        double a,b;


        try {
            names=inf.new getnames().execute().get();
            buy=inf.new getbuy().execute().get();
            sell=inf.new getsell().execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ArrayList<SearchResults> results = new ArrayList<SearchResults>();
        SearchResults sr = new SearchResults();


        int laikinas;
        String laikina;
        for(int h=0;h<names.size();h++){
            profit.add((Integer.parseInt(sell.get(h)))-(Integer.parseInt(buy.get(h))));
            a=profit.get(h);
            b=Integer.parseInt(buy.get(h));
            percentage.add((int)(a/b*100));
        }

        ArrayList<Integer> imgid= new ArrayList<Integer>();
        imgid.add(R.drawable.a1);
        imgid.add(R.drawable.a2);
        imgid.add(R.drawable.a3);
        imgid.add(R.drawable.a4);
        imgid.add(R.drawable.a5);
        imgid.add(R.drawable.a6);
        imgid.add(R.drawable.a7);
        imgid.add(R.drawable.a8);
        imgid.add(R.drawable.a9);
        imgid.add(R.drawable.a10);
        imgid.add(R.drawable.a11);
        imgid.add(R.drawable.a12);
        imgid.add(R.drawable.a13);
        imgid.add(R.drawable.a14);
        imgid.add(R.drawable.a15);
        imgid.add(R.drawable.a16);
        imgid.add(R.drawable.a17);
        imgid.add(R.drawable.a18);
        imgid.add(R.drawable.a19);
        imgid.add(R.drawable.a20);
        imgid.add(R.drawable.a21);
        imgid.add(R.drawable.a22);
        imgid.add(R.drawable.a23);
        imgid.add(R.drawable.a24);
        imgid.add(R.drawable.a25);
        imgid.add(R.drawable.a26);
        imgid.add(R.drawable.a27);
        imgid.add(R.drawable.a28);
        imgid.add(R.drawable.a29);
        imgid.add(R.drawable.a30);
        imgid.add(R.drawable.a31);
        imgid.add(R.drawable.a32);
        imgid.add(R.drawable.a33);
        imgid.add(R.drawable.a34);
        imgid.add(R.drawable.a35);
        imgid.add(R.drawable.a36);
        imgid.add(R.drawable.a37);
        imgid.add(R.drawable.a38);
        imgid.add(R.drawable.a39);
        imgid.add(R.drawable.a40);
        imgid.add(R.drawable.a41);



        for(int q=0;q<names.size()-1;q++){
            for(int w=q+1;w<names.size();w++){
                if(profit.get(q)<profit.get(w)){
                    laikinas=profit.get(q);
                    profit.set(q, profit.get(w));
                    profit.set(w, laikinas);

                    laikina=buy.get(q);
                    buy.set(q, buy.get(w));
                    buy.set(w, laikina);

                    laikina=sell.get(q);
                    sell.set(q, sell.get(w));
                    sell.set(w, laikina);

                    laikina=names.get(q);
                    names.set(q, names.get(w));
                    names.set(w, laikina);

                    laikinas=percentage.get(q);
                    percentage.set(q, percentage.get(w));
                    percentage.set(w, laikinas);

                    laikinas=imgid.get(q);
                    imgid.set(q, imgid.get(w));
                    imgid.set(w, laikinas);

                }
            }
        }

        int k=0;
        while(k<names.size()){


            String prof=profit.get(k)+"";
            String percent=percentage.get(k)+"";

            sr = new SearchResults();
            sr.setName(names.get(k));
            sr.setPrice("Buy: " + buy.get(k) + "k" + " | Sell: "+sell.get(k)+"k");
            sr.setProfit("Profit: " + prof + "k"+" ("+percent+"%)");
            sr.setPhoto(imgid.get(k));
            results.add(sr);
            k++;
        }

        return results;
    }
}
