package com.expeditionlabs.openinstagram;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class OpenInstagramSplashActivity extends Activity {
    public static String TAG = "OI_";
    //protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_oi_splash);
        //this = mContext.getApplicationContext();
    }
    protected void onPause(){
        super.onPause();
    }
    protected void onResume(){
        super.onResume();
    }
    protected void onDestroy(){
        super.onDestroy();
    }
    
}