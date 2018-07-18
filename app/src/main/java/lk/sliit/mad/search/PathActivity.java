package lk.sliit.mad.search;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PathActivity extends AppCompatActivity {

    ImageView drawingImageView;
    ImageView imageView1,imageView2;
    LinearLayout auditorium,multimedia,mscroom,hallone,library,dccn,lift,common,washroom,staff;
    LinearLayout con1,con2,con3,con4,main,con5,con6,con7,con8,con9,con10;
    String to, from;
    AutoCompleteTextView autoCompleteTextViewfrom;
    AutoCompleteTextView autoCompleteTextViewto;
    TextView textView1,textView2;
    int screenwidth,screenheight;

    //DrawPaths drawPaths=new DrawPaths();
    Paths paths=new Paths();
    float x=0,y=0,x1=0,y1=0,x2=0,y2=0,x3=0,y3=0,x4=0,y4=0,x5=0,y5=0,
            x6=0,y6=0,x7=0,y7=0,x8=0,y8=0,x9=0,y9,x10=0,
            y10=0,x11=0,y11=0,x12=0,y12=0;
    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path);

        auditorium=findViewById(R.id.auditorium);
        multimedia=findViewById(R.id.multimedia);
        mscroom=findViewById(R.id.mscroom);
        hallone=findViewById(R.id.hallone);
        library=findViewById(R.id.library);
        dccn=findViewById(R.id.dccn);
        lift=findViewById(R.id.lift);
        common=findViewById(R.id.commonroom);
        washroom=findViewById(R.id.washroom);
        staff=findViewById(R.id.staffroom);
        con1=findViewById(R.id.con1);
        con2=findViewById(R.id.con2);
        con3=findViewById(R.id.con3);
        con4=findViewById(R.id.con4);
        con5=findViewById(R.id.con5);
        main=findViewById(R.id.maincon);
        con6=findViewById(R.id.con6);
        con7=findViewById(R.id.con7);
        con8=findViewById(R.id.con8);
        con9=findViewById(R.id.con9);
        con10=findViewById(R.id.con10);
        Intent intent = getIntent();
        to = intent.getStringExtra("to");
        from = intent.getStringExtra("from");


        audit();

        //imagepaths();





    }
    public void cli(View view) {
        multimediapath();
    }



    public void audit()
        {

            if(from!=null)
            {
                if(from.equals("Auditorium"))
                {
                    auditoriumpath();
                }
            }


        }
        public void auditoriumpath()
        {


            if(to!=null)
            {
                if(to.equals("Multimedia Lab"))
                {
                    int startlocationarray[]=new int[2];
                    int connarray[]=new int[2];
                    int endlocationarray[]=new int[2];
                    auditorium.getLocationOnScreen(startlocationarray);
                    con1.getLocationOnScreen(connarray);
                    multimedia.getLocationOnScreen(endlocationarray);

                    x = startlocationarray[0];
                    y = startlocationarray[1];
                    x1 = connarray[0];
                    y1 =connarray[1];
                    x2=endlocationarray[0];
                    y2=endlocationarray[1];

                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    screenwidth = displayMetrics.widthPixels;
                    screenheight = displayMetrics.heightPixels;

                    drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                    Bitmap bitmap;
                    bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    drawingImageView.setImageBitmap(bitmap);
                    Paint paint = new Paint();
                    paint.setStyle(Paint.Style.STROKE);

                    paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                    paint.setStrokeWidth(5);
                    canvas.drawLine(x,y-50,x1,y1-50,paint);
                    canvas.drawLine(x1,y1-50,x2,y2-50,paint);

                }
                else
                    if(to.equals("MSC Room"))
                    {
                        int startlocationarray[]=new int[2];
                        int connarray[]=new int[2];
                        int endlocationarray[]=new int[2];
                        auditorium.getLocationOnScreen(startlocationarray);
                        con2.getLocationOnScreen(connarray);
                        mscroom.getLocationOnScreen(endlocationarray);

                        x = startlocationarray[0];
                        y = startlocationarray[1];
                        x1 = connarray[0];
                        y1 =connarray[1];
                        x2=endlocationarray[0];
                        y2=endlocationarray[1];

                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        screenwidth = displayMetrics.widthPixels;
                        screenheight = displayMetrics.heightPixels;

                        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                        Bitmap bitmap;
                        bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmap);
                        drawingImageView.setImageBitmap(bitmap);
                        Paint paint = new Paint();
                        paint.setStyle(Paint.Style.STROKE);

                        paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                        paint.setStrokeWidth(5);
                        canvas.drawLine(x,y-50,x1,y1-50,paint);
                        canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                    }
                    else
                        if (to.equals("Library"))
                        {
                            int startlocationarray[]=new int[2];
                            int connarray[]=new int[2];
                            int endlocationarray[]=new int[2];
                            auditorium.getLocationOnScreen(startlocationarray);
                            con4.getLocationOnScreen(connarray);
                            library.getLocationOnScreen(endlocationarray);

                            x = startlocationarray[0];
                            y = startlocationarray[1];
                            x1 = connarray[0];
                            y1 =connarray[1];
                            x2=endlocationarray[0];
                            y2=endlocationarray[1];

                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                            screenwidth = displayMetrics.widthPixels;
                            screenheight = displayMetrics.heightPixels;

                            drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                            Bitmap bitmap;
                            bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            drawingImageView.setImageBitmap(bitmap);
                            Paint paint = new Paint();
                            paint.setStyle(Paint.Style.STROKE);

                            paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                            paint.setStrokeWidth(5);
                            canvas.drawLine(x,y-50,x1,y1-50,paint);
                            canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                        }
                        else
                            if(to.equals("Lecture Hall 1"))
                            {
                                int startlocationarray[]=new int[2];
                                int connarray[]=new int[2];
                                int endlocationarray[]=new int[2];
                                auditorium.getLocationOnScreen(startlocationarray);
                                con3.getLocationOnScreen(connarray);
                                hallone.getLocationOnScreen(endlocationarray);

                                x = startlocationarray[0];
                                y = startlocationarray[1];
                                x1 = connarray[0];
                                y1 =connarray[1];
                                x2=endlocationarray[0];
                                y2=endlocationarray[1];

                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                screenwidth = displayMetrics.widthPixels;
                                screenheight = displayMetrics.heightPixels;

                                drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                Bitmap bitmap;
                                bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmap);
                                drawingImageView.setImageBitmap(bitmap);
                                Paint paint = new Paint();
                                paint.setStyle(Paint.Style.STROKE);

                                paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                paint.setStrokeWidth(5);
                                canvas.drawLine(x,y-50,x1,y1-50,paint);
                                canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                            }
                            else
                                if(to.equals("DCCN Lab"))
                                {
                                    int startlocationarray[]=new int[2];
                                    int connarray[]=new int[2];
                                    int endlocationarray[]=new int[2];
                                    auditorium.getLocationOnScreen(startlocationarray);
                                    con4.getLocationOnScreen(connarray);
                                    dccn.getLocationOnScreen(endlocationarray);

                                    x = startlocationarray[0];
                                    y = startlocationarray[1];
                                    x1 = connarray[0];
                                    y1 =connarray[1];
                                    x2=endlocationarray[0];
                                    y2=endlocationarray[1];

                                    DisplayMetrics displayMetrics = new DisplayMetrics();
                                    getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                    screenwidth = displayMetrics.widthPixels;
                                    screenheight = displayMetrics.heightPixels;

                                    drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                    Bitmap bitmap;
                                    bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmap);
                                    drawingImageView.setImageBitmap(bitmap);
                                    Paint paint = new Paint();
                                    paint.setStyle(Paint.Style.STROKE);

                                    paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                    paint.setStrokeWidth(5);
                                    canvas.drawLine(x,y-50,x1,y1-50,paint);
                                    canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                                }
                                else
                                    if(to.equals("Lift Lobby"))
                                    {
                                        int startlocationarray[]=new int[2];
                                        int connarray[]=new int[2];
                                        int connarray1[]=new int[2];
                                        int endlocationarray[]=new int[2];
                                        auditorium.getLocationOnScreen(startlocationarray);
                                        con4.getLocationOnScreen(connarray);
                                        main.getLocationOnScreen(connarray1);
                                        lift.getLocationOnScreen(endlocationarray);

                                        x = startlocationarray[0];
                                        y = startlocationarray[1];
                                        x1 = connarray[0];
                                        y1 =connarray[1];
                                        x2=connarray1[0];
                                        y2=connarray1[1];
                                        x3=endlocationarray[0];
                                        y3=endlocationarray[1];

                                        DisplayMetrics displayMetrics = new DisplayMetrics();
                                        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                        screenwidth = displayMetrics.widthPixels;
                                        screenheight = displayMetrics.heightPixels;

                                        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                        Bitmap bitmap;
                                        bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmap);
                                        drawingImageView.setImageBitmap(bitmap);
                                        Paint paint = new Paint();
                                        paint.setStyle(Paint.Style.STROKE);

                                        paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                        paint.setStrokeWidth(5);
                                        canvas.drawLine(x,y-50,x1,y1-50,paint);
                                        canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                                        canvas.drawLine(x2,y2-50,x3,y3-50,paint);
                                    }
                                    else
                                        if(to.equals("Common Room"))
                                        {
                                            int startlocationarray[]=new int[2];
                                            int connarray[]=new int[2];
                                            int connarray1[]=new int[2];
                                            int connarray2[]=new int[2];
                                            int connarray3[]=new int[2];
                                            int connarray4[]=new int[2];
                                            int connarray5[]=new int[2];
                                            int endlocationarray[]=new int[2];
                                            auditorium.getLocationOnScreen(startlocationarray);
                                            con4.getLocationOnScreen(connarray);
                                            main.getLocationOnScreen(connarray1);
                                            con5.getLocationOnScreen(connarray2);
                                            con6.getLocationOnScreen(connarray3);
                                            con7.getLocationOnScreen(connarray4);
                                            con9.getLocationOnScreen(connarray5);
                                            common.getLocationOnScreen(endlocationarray);

                                            x = startlocationarray[0];
                                            y = startlocationarray[1];
                                            x1 = connarray[0];
                                            y1 =connarray[1];
                                            x2=connarray1[0];
                                            y2=connarray1[1];
                                            x3=connarray2[0];
                                            y3=connarray2[1];
                                            x4=connarray3[0];
                                            y4=connarray3[1];
                                            x5=connarray4[0];
                                            y5=connarray4[1];
                                            x6=connarray5[0];
                                            y6=connarray5[1];
                                            x7=endlocationarray[0];
                                            y7=endlocationarray[1];

                                            DisplayMetrics displayMetrics = new DisplayMetrics();
                                            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                            screenwidth = displayMetrics.widthPixels;
                                            screenheight = displayMetrics.heightPixels;

                                            drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                            Bitmap bitmap;
                                            bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap);
                                            drawingImageView.setImageBitmap(bitmap);
                                            Paint paint = new Paint();
                                            paint.setStyle(Paint.Style.STROKE);

                                            paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                            paint.setStrokeWidth(5);
                                            canvas.drawLine(x,y-50,x1,y1-50,paint);
                                            canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                                            canvas.drawLine(x2,y2-50,x3,y3-50,paint);
                                            canvas.drawLine(x3,y3-50,x4,y4-50,paint);
                                            canvas.drawLine(x4,y4-50,x5,y5-50,paint);
                                            canvas.drawLine(x5,y5-50,x6,y6-50,paint);
                                            canvas.drawLine(x6,y6-50,x7,y7-50,paint);
                                        }
                                        else
                                            if(to.equals("Wash Rooms"))
                                            {
                                                int startlocationarray[]=new int[2];
                                                int connarray[]=new int[2];
                                                int connarray1[]=new int[2];
                                                int connarray2[]=new int[2];
                                                int connarray3[]=new int[2];
                                                int connarray4[]=new int[2];

                                                int connarray6[]=new int[2];
                                                int endlocationarray[]=new int[2];
                                                auditorium.getLocationOnScreen(startlocationarray);
                                                con4.getLocationOnScreen(connarray);
                                                main.getLocationOnScreen(connarray1);
                                                con5.getLocationOnScreen(connarray2);
                                                con6.getLocationOnScreen(connarray3);
                                                con7.getLocationOnScreen(connarray4);

                                                con10.getLocationOnScreen(connarray6);
                                                washroom.getLocationOnScreen(endlocationarray);

                                                x = startlocationarray[0];
                                                y = startlocationarray[1];
                                                x1 = connarray[0];
                                                y1 =connarray[1];
                                                x2=connarray1[0];
                                                y2=connarray1[1];
                                                x3=connarray2[0];
                                                y3=connarray2[1];
                                                x4=connarray3[0];
                                                y4=connarray3[1];
                                                x5=connarray4[0];
                                                y5=connarray4[1];
                                                x6=connarray6[0];
                                                y6=connarray6[1];
                                                x7=endlocationarray[0];
                                                y7=endlocationarray[1];

                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                                screenwidth = displayMetrics.widthPixels;
                                                screenheight = displayMetrics.heightPixels;

                                                drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                                Bitmap bitmap;
                                                bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmap);
                                                drawingImageView.setImageBitmap(bitmap);
                                                Paint paint = new Paint();
                                                paint.setStyle(Paint.Style.STROKE);

                                                paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                                paint.setStrokeWidth(5);
                                                canvas.drawLine(x,y-50,x1,y1-50,paint);
                                                canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                                                canvas.drawLine(x2,y2-50,x3,y3-50,paint);
                                                canvas.drawLine(x3,y3-50,x4,y4-50,paint);
                                                canvas.drawLine(x4,y4-50,x5,y5-50,paint);
                                                canvas.drawLine(x5,y5-50,x6,y6-50,paint);
                                                canvas.drawLine(x6,y6-50,x7,y7-50,paint);

                                            }
                                            else
                                                if(to.equals("Staff Room"))
                                                {
                                                    int startlocationarray[]=new int[2];
                                                    int connarray[]=new int[2];
                                                    int connarray1[]=new int[2];
                                                    int connarray2[]=new int[2];
                                                    int connarray3[]=new int[2];
                                                    int connarray4[]=new int[2];

                                                    int connarray6[]=new int[2];
                                                    int endlocationarray[]=new int[2];
                                                    auditorium.getLocationOnScreen(startlocationarray);
                                                    con4.getLocationOnScreen(connarray);
                                                    main.getLocationOnScreen(connarray1);
                                                    con5.getLocationOnScreen(connarray2);
                                                    con6.getLocationOnScreen(connarray3);
                                                    con7.getLocationOnScreen(connarray4);
                                                    con8.getLocationOnScreen(connarray6);
                                                    staff.getLocationOnScreen(endlocationarray);

                                                    x = startlocationarray[0];
                                                    y = startlocationarray[1];
                                                    x1 = connarray[0];
                                                    y1 =connarray[1];
                                                    x2=connarray1[0];
                                                    y2=connarray1[1];
                                                    x3=connarray2[0];
                                                    y3=connarray2[1];
                                                    x4=connarray3[0];
                                                    y4=connarray3[1];
                                                    x5=connarray4[0];
                                                    y5=connarray4[1];
                                                    x6=connarray6[0];
                                                    y6=connarray6[1];
                                                    x7=endlocationarray[0];
                                                    y7=endlocationarray[1];

                                                    DisplayMetrics displayMetrics = new DisplayMetrics();
                                                    getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                                    screenwidth = displayMetrics.widthPixels;
                                                    screenheight = displayMetrics.heightPixels;

                                                    drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                                    Bitmap bitmap;
                                                    bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    drawingImageView.setImageBitmap(bitmap);
                                                    Paint paint = new Paint();
                                                    paint.setStyle(Paint.Style.STROKE);

                                                    paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                                    paint.setStrokeWidth(5);
                                                    canvas.drawLine(x,y-50,x1,y1-50,paint);
                                                    canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                                                    canvas.drawLine(x2,y2-50,x3,y3-50,paint);
                                                    canvas.drawLine(x3,y3-50,x4,y4-50,paint);
                                                    canvas.drawLine(x4,y4-50,x5,y5-50,paint);
                                                    canvas.drawLine(x5,y5-50,x6,y6-50,paint);
                                                    canvas.drawLine(x6,y6-50,x7,y7-50,paint);
                                                }
            }





        }

        public void multimediapath() {
            if (to != null) {
                if (to.equals("Auditorium")) {
                    int startlocationarray[] = new int[2];
                    int connarray[] = new int[2];
                    int endlocationarray[] = new int[2];
                    multimedia.getLocationOnScreen(startlocationarray);
                    con1.getLocationOnScreen(connarray);
                    auditorium.getLocationOnScreen(endlocationarray);

                    x = startlocationarray[0];
                    y = startlocationarray[1];
                    x1 = connarray[0];
                    y1 = connarray[1];
                    x2 = endlocationarray[0];
                    y2 = endlocationarray[1];

                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    screenwidth = displayMetrics.widthPixels;
                    screenheight = displayMetrics.heightPixels;

                    drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                    Bitmap bitmap;
                    bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    drawingImageView.setImageBitmap(bitmap);
                    Paint paint = new Paint();
                    paint.setStyle(Paint.Style.STROKE);

                    paint.setShader(new LinearGradient(0, 0, 5, 5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                    paint.setStrokeWidth(5);
                    canvas.drawLine(x, y - 50, x1, y1 - 50, paint);
                    canvas.drawLine(x1, y1 - 50, x2, y2 - 50, paint);

                } else
                    if (to.equals("MSC Room")) {
                    int startlocationarray[] = new int[2];
                    int connarray[] = new int[2];
                    int connarray1[]=new int[2];
                    int endlocationarray[] = new int[2];
                    multimedia.getLocationOnScreen(startlocationarray);
                    con1.getLocationOnScreen(connarray);
                    con2.getLocationOnScreen(connarray1);
                    mscroom.getLocationOnScreen(endlocationarray);

                    x = startlocationarray[0];
                    y = startlocationarray[1];
                    x1 = connarray[0];
                    y1 = connarray[1];
                    x2=  connarray1[0];
                    y2=  connarray1[1];
                    x3 = endlocationarray[0];
                    y3 = endlocationarray[1];

                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    screenwidth = displayMetrics.widthPixels;
                    screenheight = displayMetrics.heightPixels;

                    drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                    Bitmap bitmap;
                    bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    drawingImageView.setImageBitmap(bitmap);
                    Paint paint = new Paint();
                    paint.setStyle(Paint.Style.STROKE);

                    paint.setShader(new LinearGradient(0, 0, 5, 5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                    paint.setStrokeWidth(5);
                    canvas.drawLine(x, y - 50, x1, y1 - 50, paint);
                    canvas.drawLine(x1, y1 - 50, x2, y2 - 50, paint);
                    canvas.drawLine(x2, y2 - 50, x3, y3 - 50, paint);
                }
                else
                    if(to.equals("Library"))
                    {
                        int startlocationarray[] = new int[2];
                        int connarray[] = new int[2];
                        int connarray1[]=new int[2];
                        int endlocationarray[] = new int[2];
                        multimedia.getLocationOnScreen(startlocationarray);
                        con1.getLocationOnScreen(connarray);
                        con4.getLocationOnScreen(connarray1);
                        library.getLocationOnScreen(endlocationarray);

                        x = startlocationarray[0];
                        y = startlocationarray[1];
                        x1 = connarray[0];
                        y1 = connarray[1];
                        x2=  connarray1[0];
                        y2=  connarray1[1];
                        x3 = endlocationarray[0];
                        y3 = endlocationarray[1];

                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        screenwidth = displayMetrics.widthPixels;
                        screenheight = displayMetrics.heightPixels;

                        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                        Bitmap bitmap;
                        bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmap);
                        drawingImageView.setImageBitmap(bitmap);
                        Paint paint = new Paint();
                        paint.setStyle(Paint.Style.STROKE);

                        paint.setShader(new LinearGradient(0, 0, 5, 5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                        paint.setStrokeWidth(5);
                        canvas.drawLine(x, y - 50, x1, y1 - 50, paint);
                        canvas.drawLine(x1, y1 - 50, x2, y2 - 50, paint);
                        canvas.drawLine(x2, y2 - 50, x3, y3 - 50, paint);
                    }
                    else
                        if(to.equals("Lecture Hall 1"))
                        {
                            int startlocationarray[] = new int[2];
                            int connarray[] = new int[2];
                            int connarray1[]=new int[2];
                            int endlocationarray[] = new int[2];
                            multimedia.getLocationOnScreen(startlocationarray);
                            con1.getLocationOnScreen(connarray);
                            con3.getLocationOnScreen(connarray1);
                            hallone.getLocationOnScreen(endlocationarray);

                            x = startlocationarray[0];
                            y = startlocationarray[1];
                            x1 = connarray[0];
                            y1 = connarray[1];
                            x2=  connarray1[0];
                            y2=  connarray1[1];
                            x3 = endlocationarray[0];
                            y3 = endlocationarray[1];

                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                            screenwidth = displayMetrics.widthPixels;
                            screenheight = displayMetrics.heightPixels;

                            drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                            Bitmap bitmap;
                            bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            drawingImageView.setImageBitmap(bitmap);
                            Paint paint = new Paint();
                            paint.setStyle(Paint.Style.STROKE);

                            paint.setShader(new LinearGradient(0, 0, 5, 5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                            paint.setStrokeWidth(5);
                            canvas.drawLine(x, y - 50, x1, y1 - 50, paint);
                            canvas.drawLine(x1, y1 - 50, x2, y2 - 50, paint);
                            canvas.drawLine(x2, y2 - 50, x3, y3 - 50, paint);
                        }
                        else
                            if(to.equals("DCCN Lab"))
                            {
                                int startlocationarray[]=new int[2];
                                int connarray[]=new int[2];
                                int connarray1[]=new int[2];
                                int endlocationarray[]=new int[2];
                                multimedia.getLocationOnScreen(startlocationarray);
                                con1.getLocationOnScreen(connarray);
                                con4.getLocationOnScreen(connarray1);
                                dccn.getLocationOnScreen(endlocationarray);

                                x = startlocationarray[0];
                                y = startlocationarray[1];
                                x1 = connarray[0];
                                y1 =connarray[1];
                                x2=connarray1[0];
                                y2=connarray1[1];
                                x3=endlocationarray[0];
                                y3=endlocationarray[1];

                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                screenwidth = displayMetrics.widthPixels;
                                screenheight = displayMetrics.heightPixels;

                                drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                Bitmap bitmap;
                                bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmap);
                                drawingImageView.setImageBitmap(bitmap);
                                Paint paint = new Paint();
                                paint.setStyle(Paint.Style.STROKE);

                                paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                paint.setStrokeWidth(5);
                                canvas.drawLine(x,y-50,x1,y1-50,paint);
                                canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                                canvas.drawLine(x2,y2-50,x3,y3-50,paint);

                            }
                            else
                                if(to.equals("Lift Lobby"))
                                {
                                    int startlocationarray[]=new int[2];
                                    int connarray[]=new int[2];
                                    int connarray1[]=new int[2];
                                    int connarray2[]=new int[2];
                                    int endlocationarray[]=new int[2];
                                    multimedia.getLocationOnScreen(startlocationarray);
                                    con1.getLocationOnScreen(connarray);
                                    con4.getLocationOnScreen(connarray1);
                                    main.getLocationOnScreen(connarray2);
                                    lift.getLocationOnScreen(endlocationarray);

                                    x = startlocationarray[0];
                                    y = startlocationarray[1];
                                    x1 = connarray[0];
                                    y1 =connarray[1];
                                    x2=connarray1[0];
                                    y2=connarray1[1];
                                    x3=connarray2[0];
                                    y3=connarray2[1];
                                    x4=endlocationarray[0];
                                    y4=endlocationarray[1];

                                    DisplayMetrics displayMetrics = new DisplayMetrics();
                                    getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                    screenwidth = displayMetrics.widthPixels;
                                    screenheight = displayMetrics.heightPixels;

                                    drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
                                    Bitmap bitmap;
                                    bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmap);
                                    drawingImageView.setImageBitmap(bitmap);
                                    Paint paint = new Paint();
                                    paint.setStyle(Paint.Style.STROKE);

                                    paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
                                    paint.setStrokeWidth(5);
                                    canvas.drawLine(x,y-50,x1,y1-50,paint);
                                    canvas.drawLine(x1,y1-50,x2,y2-50,paint);
                                    canvas.drawLine(x2,y2-50,x3,y3-50,paint);
                                    canvas.drawLine(x3,y3-50,x4,y4-50,paint);
                                }
            }
        }

                public void navigation (View view)
                {
                    Intent intent=new Intent(this,MainActivity.class);
                    startActivity(intent);

                }
}







