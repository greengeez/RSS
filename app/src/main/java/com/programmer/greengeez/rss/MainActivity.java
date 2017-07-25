package com.programmer.greengeez.rss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //NewsDetailFragment frag = (NewsDetailFragment)
        //        getFragmentManager().findFragmentById(R.id.news_frag);
        //frag.setNewsId(1);

        //showFragment(NewsDetailFragment.class);
        showFragment(RecycleFragment.class);

//        Fragment fragment = RecycleFragment.newInstance();
//        FragmentManager fragmentManager = getFragmentManager();
//        fragmentManager.beginTransaction()
//                .replace(R.id.news_frag, fragment)
//                .commit();
    }

    private void showFragment(Class fragmentClass) {

        Fragment fragment = null;

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.news_frag, fragment)
                .commit();

    }
}


