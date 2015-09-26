package com.plus256.www.sipapa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Collins on 7/25/15.
 */
public class ResizableImageView extends ImageView {

    public ResizableImageView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        Drawable d=getDrawable();
        if(d!=null){
            //ceil not round - avoid thin vertical gaps along the left/right edges
            int width=MeasureSpec.getSize(widthMeasureSpec);
            int height=(int) Math.ceil((float) width*(float) d.getIntrinsicHeight()/d.getIntrinsicWidth());
            setMeasuredDimension(width, height);
        }else{
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

}
