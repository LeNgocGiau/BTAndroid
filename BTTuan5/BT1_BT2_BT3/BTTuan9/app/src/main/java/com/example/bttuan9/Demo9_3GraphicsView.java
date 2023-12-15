package com.example.bttuan9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.util.Log;
import android.view.*;
public class Demo9_3GraphicsView extends View{
    private final Paint paint;
    private final Bitmap[] frames;
    private int i;
    public Demo9_3GraphicsView(Context context) {
        super(context);
        paint = new Paint();
        frames = new Bitmap[16];
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.win_6);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.win_7);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.win_8);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.win_9);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.win_10);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.win_11);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.win_12);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.win_13);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.win_14);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.win_15);
        frames[15] = BitmapFactory.decodeResource(getResources(), R.drawable.win_16);
        i = 0;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Demo9_3GraphicsView", "onDraw() called with: canvas = [" + canvas + "]" + i);
        canvas.drawBitmap(frames[i], 40, 40, paint);
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent event) {
        i = (i + 1) % 16;
        return true;
    }
}
