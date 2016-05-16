package com.leegacy.sooji.cookbook.Activities;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import com.firebase.client.Firebase;
import com.leegacy.sooji.cookbook.R;

import java.util.ArrayList;

/**
 * Created by soo-ji on 16-04-10.
 */
public class TabsActivity extends TabActivity implements View.OnClickListener{
    private ViewPager viewPager;
    private String firstName;
    private String lastName;
    private String playListID;
    private String uid;
    private Firebase ref;
    private ImageView tabHome;
    private ImageView tabSearch;
    private ImageView tabCamera;
    private ImageView tabNoti;
    private ImageView tabPerson;
    private ArrayList<Fragment> Fragments;

    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;



        intent = new Intent().setClass(this, HomeActivity.class);
        spec = tabHost.newTabSpec("First").setIndicator("",getResources().getDrawable(R.drawable.home))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, SearchActivity.class);
        spec = tabHost.newTabSpec("Second").setIndicator("",getResources().getDrawable(R.drawable.search))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, CameraActivity.class);
        spec = tabHost.newTabSpec("Third").setIndicator("",getResources().getDrawable(R.drawable.camera))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ProfileActivity.class);
        spec = tabHost.newTabSpec("Fourth").setIndicator("",getResources().getDrawable(R.drawable.person))
                .setContent(intent);
        tabHost.addTab(spec);
    }

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tabs);
////        firstName = getIntent().getStringExtra(SignInActivity.FIRST_NAME);
////        Toast toast = Toast.makeText(this, "first name is: "+firstName, Toast.LENGTH_LONG);
////        lastName = getIntent().getStringExtra(SignInActivity.LAST_NAME);
//        ref = new Firebase("https://blazing-inferno-7470.firebaseio.com/android/saving-data/fireblog");
//        uid = getIntent().getStringExtra(SignInActivity.UID);
//        tabHome = (ImageView) findViewById(R.id.tabHome);
//        tabHome.setOnClickListener(this);
//        tabSearch = (ImageView) findViewById(R.id.tabSearch);
//        tabSearch.setOnClickListener(this);
//        tabCamera = (ImageView) findViewById(R.id.tabCamera);
//        tabCamera.setOnClickListener(this);
//        tabNoti = (ImageView) findViewById(R.id.tabNoti);
//        tabNoti.setOnClickListener(this);
//        tabPerson = (ImageView) findViewById(R.id.tabPerson);
//        tabPerson.setOnClickListener(this);
//        Fragments = new ArrayList<Fragment>();
//
//        HomeFragment homeFragment = new HomeFragment();
//        Fragments.add(homeFragment);
//        //TODO: search
//        HomeFragment homeFragment2 = new HomeFragment();
//        Fragments.add(homeFragment2);
//
////        CameraFragment cameraFragment = new CameraFragment();
////        Fragments.add(cameraFragment);
//        HomeFragment homeFragment3 = new HomeFragment();
//        Fragments.add(homeFragment3);
//
//        //TODO: noti
//        HomeFragment homeFragment4 = new HomeFragment();
//        Fragments.add(homeFragment4);
//
//        ProfileFragment profileFragment = new ProfileFragment();
//        profileFragment.setUid(uid);
//        Fragments.add(profileFragment);
//
//        viewPager = (ViewPager) findViewById(R.id.viewPager);
//        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(myPagerAdapter);
//
//
//
//    }
//
//
//
//
//
//
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.tabHome:
//                viewPager.setCurrentItem(0);
//            case R.id.tabSearch:
//                viewPager.setCurrentItem(1);
//            case R.id.tabCamera:
//                viewPager.setCurrentItem(2);
//            case R.id.tabNoti:
//                viewPager.setCurrentItem(3);
//            case R.id.tabPerson:
//                viewPager.setCurrentItem(4);
//
//        }
//    }
//
//    class MyPagerAdapter extends FragmentPagerAdapter{
//
//        public MyPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return Fragments.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return Fragments.size();
//        }
//    }
}
