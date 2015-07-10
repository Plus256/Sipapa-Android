package com.plus256.sipapa;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        LinearLayout main_article_container=(LinearLayout) findViewById(R.id.main_article_container);
        LinearLayout article_row=(LinearLayout) findViewById(R.id.article_row);
        
        LayoutInflater row_inflater=(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflated_article_row=row_inflater.inflate(R.layout.article_row, article_row);
        
        main_article_container.addView(inflated_article_row); //Thank you Jesus
        
    }
}
