package org.techtown.mymy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by LG on 2017-11-08.
 */

public class Start extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        	    // TODO Auto-generated method stub
        	    super.onCreate(savedInstanceState);
        	    setContentView(R.layout.start);

        	    Handler mHandler = new Handler();
        	    mHandler.postDelayed(new Runnable() {
	        //Do Something
        	        @Override
	        public void run() {
                	            // TODO Auto-generated method stub
                	            Intent i = new Intent(Start.this, CodeActivity.class); // xxx가 현재 activity,
                	                                //yyy가 이동할 activity
                	            startActivity(i);
                	            finish();
                	        }
	    }, 2000); // 1000ms
        	}

}
