package com.plus256.sipapa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //adding articles to their container
        LinearLayout main_article_container=(LinearLayout) findViewById(R.id.main_article_container);
        LinearLayout article_row=(LinearLayout) findViewById(R.id.article_row);
        
        LayoutInflater row_inflater=(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflated_article_row=row_inflater.inflate(R.layout.article_row, article_row);
        
        main_article_container.addView(inflated_article_row); //Thank you JESUS
        
        //adding adverts to their container
	    LinearLayout ad_container=(LinearLayout) findViewById(R.id.ad_container);
	    LinearLayout ad_item=(LinearLayout) findViewById(R.id.ad_item);
	    
	    LayoutInflater ad_inflater=(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View inflated_ad_item=ad_inflater.inflate(R.layout.ad_item, ad_item);
	    
	    ad_container.addView(inflated_ad_item);
	    
	  //setting top_article_cover onclicklistener
	    ImageView top_article_cover=(ImageView) findViewById(R.id.top_article_cover);
	    top_article_cover.setOnClickListener(new ImageView.OnClickListener(){

			@Override
			public void onClick(View v) {
				//String click_check="Hey";
				//Toast.makeText(getBaseContext(), click_check, Toast.LENGTH_SHORT).show();
				Intent article_details=new Intent(getBaseContext(), FetchArticleDetails.class);
		    	startActivity(article_details);
			}
	    	
	    });
	    
	  //setting top_article_title onclicklistener
	    TextView top_article_title=(TextView) findViewById(R.id.top_article_title);
	    top_article_title.setOnClickListener(new TextView.OnClickListener(){

			@Override
			public void onClick(View v) {
				//String click_check="Hey";
				//Toast.makeText(getBaseContext(), click_check, Toast.LENGTH_SHORT).show();
				Intent article_details=new Intent(getBaseContext(), FetchArticleDetails.class);
		    	startActivity(article_details);
			}
	    	
	    });
	    
	    //setting article_image onclicklistener
	    ImageView article_image=(ImageView) findViewById(R.id.article_image);
	    article_image.setOnClickListener(new ImageView.OnClickListener(){

			@Override
			public void onClick(View v) {
				//String click_check="Hey";
				//Toast.makeText(getBaseContext(), click_check, Toast.LENGTH_SHORT).show();
				Intent article_details=new Intent(getBaseContext(), FetchArticleDetails.class);
		    	startActivity(article_details);
			}
	    	
	    });
	    
	  //setting article_title onclicklistener
	    TextView article_title=(TextView) findViewById(R.id.article_title);
	    article_title.setOnClickListener(new TextView.OnClickListener(){

			@Override
			public void onClick(View v) {
				//String click_check="Hey";
				//Toast.makeText(getBaseContext(), click_check, Toast.LENGTH_SHORT).show();
				Intent article_details=new Intent(getBaseContext(), FetchArticleDetails.class);
		    	startActivity(article_details);
			}
	    	
	    });
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	return super.onOptionsItemSelected(item);
    }
    
}
