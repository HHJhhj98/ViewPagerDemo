package com.example.vpdemo;

import java.util.ArrayList;

import android.net.VpnService;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	ViewPager mvp;
	ArrayList<View> views;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mvp=(ViewPager) findViewById(R.id.vp);
        views=new ArrayList<View>();
        views.add(getLayoutInflater().inflate(R.layout.view1, null));
        views.add(getLayoutInflater().inflate(R.layout.view2, null));
        views.add(getLayoutInflater().inflate(R.layout.view3, null));
        VPAdapter adapter=new VPAdapter(views);
        mvp.setAdapter(adapter);
       // VPAdapter ma=new VPAdapter();
       //ma.views=views;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
