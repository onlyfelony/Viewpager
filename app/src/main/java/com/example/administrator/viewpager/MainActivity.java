package com.example.administrator.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
     private   List<View> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        LayoutInflater inflater = LayoutInflater.from(this);

        View one = inflater.inflate(R.layout.page1,null);
        View two = inflater.inflate(R.layout.page2,null);

        views = new ArrayList<View>();
        views.add(one);
        views.add(two);

        viewPagerAdapter = new ViewPagerAdapter(views,this);
        viewPager.setAdapter(viewPagerAdapter);




    }
}
