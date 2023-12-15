package com.example.bttuan9;

import android.content.Context;
import android.graphics.*;
import android.view.View;

public class Demo9_1GraphicsView extends View{
    private final Paint paint;
    private final Rect rect;
    public Demo9_1GraphicsView(Context context) {
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        rect = new Rect(40, 40, 400, 200);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(rect, paint);
        invalidate();
    }

}
