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
    LinearLayout auditorium1,multimedia1,mscroom,hallone,library,dccn,lift,common,washroom,staff;
    LinearLayout conn1,con2,con3,con4,main,con5,con6,con7,con8,con9,con10;
    String to, from;
    AutoCompleteTextView autoCompleteTextViewfrom;
    AutoCompleteTextView autoCompleteTextViewto;
    TextView textView1,textView2;
    ArrayList<String> locations=new ArrayList<>();

    //DrawPaths drawPaths=new DrawPaths();
    Paths paths=new Paths();
    float x,y,x1,y1,x2,y2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_path);
        autoCompleteTextViewfrom= (AutoCompleteTextView) findViewById(R.id.direction_header_from_text);
        autoCompleteTextViewto=(AutoCompleteTextView)findViewById(R.id.direction_header_to_text);

        locations.add("Auditorium");
        locations.add("MSC Room");
        locations.add("Lecture Hall 1");
        locations.add("Multimedia Lab");
        locations.add("Library");
        locations.add("DCCN Lab");
        locations.add("Lift Lobby");
        locations.add("Staff Room");
        locations.add("Wash Rooms");
        locations.add("Common Room");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(PathActivity.this,android.R.layout.simple_spinner_dropdown_item,locations);

        autoCompleteTextViewfrom.setAdapter(adapter);
        autoCompleteTextViewto.setAdapter(adapter);

        //imagepaths();





    }



    public void audit()
        {

            Intent intent = getIntent();
            to = intent.getStringExtra("to");
            from = intent.getStringExtra("from");


        }
        public void auditoriumpath()
        {


            imageView1=findViewById(R.id.imageView1);
            imageView2=findViewById(R.id.imageView2);
            auditorium1=findViewById(R.id.auditorium);
            conn1=findViewById(R.id.con1);
            multimedia1=findViewById(R.id.multimedia);
            int array[]=new int[2];
            int array1[]=new int[2];
            int array2[]=new int[2];

           auditorium1.getLocationOnScreen(array);
           conn1.getLocationOnScreen(array1);
            multimedia1.getLocationOnScreen(array2);

            x = array[0];
            y = array[1];
            x1 = array1[0];
            y1 = array1[1];
            x2=array2[0];
            y2=array2[1];

            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int screenwidth = displayMetrics.widthPixels;
            int screenheight = displayMetrics.heightPixels;
            drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
            Bitmap bitmap;
            bitmap = Bitmap.createBitmap(screenwidth, screenheight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawingImageView.setImageBitmap(bitmap);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            // paint.setColor(Color.BLACK);
            paint.setShader(new LinearGradient(0, 0, 5,5, Color.BLUE, Color.WHITE, Shader.TileMode.REPEAT));
            paint.setStrokeWidth(5);
            canvas.drawLine(x+25,y+25,x1+25,y1+25,paint);
            canvas.drawLine(x1+25,y1+25,x2+25,y2+25,paint);




           // paths.auditorium(canvas);

        }


        public void navigation (View view)
        {
            auditoriumpath();
        }





}






