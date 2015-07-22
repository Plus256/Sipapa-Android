package com.plus256.sipapa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //adding adverts to their container
	    LinearLayout ad_container=(LinearLayout) findViewById(R.id.ad_container);
	    LinearLayout ad_item=(LinearLayout) findViewById(R.id.ad_item);
	    
	    LayoutInflater ad_inflater=(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View inflated_ad_item=ad_inflater.inflate(R.layout.ad_item, ad_item);
	    
	    ad_container.addView(inflated_ad_item);
	    
	  //adding the footer
	    LinearLayout body_wrapper=(LinearLayout) findViewById(R.id.body_wrapper);
	    LinearLayout footer=(LinearLayout) findViewById(R.id.footer);
	    
	    LayoutInflater footer_inflater=(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View inflated_footer=footer_inflater.inflate(R.layout.footer, footer);
	    
	    body_wrapper.addView(inflated_footer);
        
    }
    
}
