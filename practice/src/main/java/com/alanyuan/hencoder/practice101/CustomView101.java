package com.alanyuan.hencoder.practice101;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * HenCoder 1-1
 * Created by alanyuan on 2018/1/5.
 */

public class CustomView101 extends View {
    private Paint mPaint = new Paint();

    public CustomView101(Context context) {
        super(context);
    }

    public CustomView101(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView101(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //绘制一个圆
        mPaint.setColor(Color.BLUE);
        mPaint.setAntiAlias(true);
        canvas.drawCircle(getWidth() / 8, getHeight() / 8, getWidth() / 8, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        canvas.drawCircle(getWidth() / 3, getHeight() / 8, getWidth() / 8, mPaint);
    }
}
