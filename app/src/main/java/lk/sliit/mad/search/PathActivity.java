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



    public void audit()
    {

        String to,from;
        Intent intent=getIntent();

      to=intent.getStringExtra("to");
      from=intent.getStringExtra("from");
       // from=intent.getStringExtra("from");

            }

        }

    }
    public Canvas imagepaths()
    {
        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenwidth=displayMetrics.widthPixels;
        int screenheight=displayMetrics.heightPixels;
        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        Bitmap bitmap;
        bitmap = Bitmap.createBitmap(screenwidth,screenheight,Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        drawingImageView.setImageBitmap(bitmap);
        return canvas;
    }



    public void navigation(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}






