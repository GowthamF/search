package lk.sliit.mad.search;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

public class Paths
{
    public void libtoaudit(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        // paint.setColor(Color.BLACK);
        paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
        paint.setStrokeWidth(5);
        Path p = new Path();
        p.moveTo(220,270);
        p.lineTo(220,730);
        p.moveTo(220,730);
        p.lineTo(300,730);
        p.moveTo(300,730);
        p.lineTo(300,820);
        canvas.drawPath(p, paint);
    }



}
