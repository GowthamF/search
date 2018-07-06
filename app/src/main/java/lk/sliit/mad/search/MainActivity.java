package lk.sliit.mad.search;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText fromtxt;
    EditText totxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // fromtxt=(EditText) findViewById(R.id.direction_header_from_text);



    }

    public void search(View view)
    {
        totxt=(EditText)findViewById(R.id.direction_header_to_text);
        Intent intent=new Intent(this,PathActivity.class);
       // intent.putExtra("from",fromtxt.getText().toString());

        intent.putExtra("to",totxt.getText().toString());
        startActivity(intent);
        finish();


    }
}
