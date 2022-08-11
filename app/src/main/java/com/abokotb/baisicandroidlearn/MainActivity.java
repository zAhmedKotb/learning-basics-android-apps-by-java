package com.abokotb.baisicandroidlearn;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view_items);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3327260567855225/3788763007");
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });

        Item javaBasic = new Item("Java Basic", "java_basic", "ic_send");
        Item andoidBasic = new Item("Android Basic", "android_prjct", "ic_send");
        Item projects = new Item("Simple Java Projects", "project", "ic_send");
        Item andProject = new Item("Simple Android Projects", "android_prjct1", "ic_send");
        Item javaOop = new Item("Java OOP", "oop", "ic_send");
        Item algorithms = new Item("Algorithms", "algorethm", "ic_send");
        Item tips = new Item("Tips", "tips", "ic_send");
        Item resource = new Item("The Sources Used", "resource", "ic_send");
        Item massages = new Item("Send Your Feedback", "msge", "ic_send");

        Item[] items = {javaBasic, andoidBasic, projects, andProject, javaOop, algorithms, tips, resource, massages};
        int xmlFile = R.layout.list_row;
        ItemsAdapter adapter = new ItemsAdapter(MainActivity.this, xmlFile, items);

        listView.setAdapter(adapter);


        //for go to another activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent=new Intent(MainActivity.this, LearnJavaBasic.class);
                    startActivity(intent);
                }else if (i==1){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }else if (i==2){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }else if (i==3){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }else if (i==4){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }else if (i==5){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }else if (i==6){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }else if (i==7){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }else if (i==8){
                    Intent intent=new Intent(MainActivity.this, LearnAndroidBasic.class);
                    startActivity(intent);
                }
            }
        });




    }

    // for out app

    public void onBackPressed(){

        AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are you Sure To Exit ?");
        builder.setTitle("Alert !");
        builder.setCancelable(false);


        builder.setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}
