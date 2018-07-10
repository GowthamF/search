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
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PathActivity extends AppCompatActivity {

    ImageView drawingImageView;
    TextView error;
    Paths paths=new Paths();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path);


        audit();

        //lifttolibrary();
        //lifttomscroom();
       //lifttomultimedia();
        //lifttohallone();
       //lifttodccnlab();
       //lifttoStaffroom();
       //lifttoWashroom();
       //lifttocommomroom();



    }

    public void audit()
    {

        String to,from;
        Intent intent=getIntent();

      to=intent.getStringExtra("to");
      from=intent.getStringExtra("from");
       // from=intent.getStringExtra("from");
        if(to!=null)
        {
            if(from.equals("Lift Lobby"))
            {
                if(to.equals("Auditorium"))
                {
                    lifttoauditorium();
                }
                else
                    if(to.equals("MSC Room"))
                    {
                        lifttomscroom();
                    }
                    else
                        if(to.equals("Lecture Hall 1"))
                        {
                            lifttohallone();
                        }
                        else
                            if(to.equals("Multimedia Lab"))
                            {
                                lifttomultimedia();
                            }
                            else
                                if(to.equals("Library"))
                                {
                                    lifttolibrary();
                                }
                                else
                                    if(to.equals("Staff Room"))
                                    {
                                        lifttoStaffroom();
                                    }
                                    else
                                        if(to.equals("Wash Rooms"))
                                        {
                                            lifttoWashroom();
                                        }
                                        else
                                            if(to.equals("Common Room"))
                                            {
                                                lifttocommomroom();
                                            }
                                            else
                                                if(to.equals("DCCN Lab"))
                                                {
                                                    lifttodccnlab();
                                                }
            }

        }

    }
    public Canvas imagepaths()
    {
        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);
        return canvas;
    }
    public void lifttoauditorium()
    {

        paths.lifttoaudit(imagepaths());

    }



    public void lifttolibrary()
    {
        paths.lifttoaudit(imagepaths());

    }
    public void lifttomscroom()
    {

        paths.lifttoaudit(imagepaths());



    }

    public void lifttomultimedia()
    {
        paths.lifttoaudit(imagepaths());
    }

    public void lifttohallone()
    {
        paths.lifttoaudit(imagepaths());


    }

    public void lifttodccnlab()
    {

        paths.lifttoaudit(imagepaths());

    }

    public void lifttoStaffroom()
    {

        paths.lifttoaudit(imagepaths());

    }

    public void lifttoWashroom()
    {

        paths.lifttoaudit(imagepaths());

    }

    public void lifttocommomroom()
    {

        paths.lifttoaudit(imagepaths());

    }


    public void navigation(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}






