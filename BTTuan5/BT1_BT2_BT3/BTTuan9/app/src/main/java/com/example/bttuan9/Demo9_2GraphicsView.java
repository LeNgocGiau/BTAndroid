package com.example.bttuan9;

import android.content.Context;
import android.graphics.*;
import android.util.Log;
import android.view.*;
public class Demo9_2GraphicsView extends View{
    private static final int WIDTH = 100, HEIGHT = 50;
    private final Paint paint;
    private final Rect rect;
    private int x = 0, y = 0;
    public Demo9_2GraphicsView(Context context) {
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        rect = new Rect(x, y, x + WIDTH, y + HEIGHT);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (rect.top != 0 && rect.left != 0)
            canvas.drawRect(rect, paint);
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent event) {
        x = (int) event.getX();
        y = (int) event.getY();
        rect.set(x, y, x + WIDTH, y + HEIGHT);
        return true;
    }
}
