package com.wooplr.spotlight.shape;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.wooplr.spotlight.target.Target;

/**
 * Created by jitender on 10/06/16.
 */

public class Circle extends Shape {

    public Circle(Target target, int padding) {
        super(target, padding);
    }

    public void draw(Canvas canvas, Paint eraser, int padding) {
        calculateRadius(padding);
        circlePoint = getFocusPoint();
        canvas.drawCircle(circlePoint.x, circlePoint.y, radius, eraser);
    }
}
