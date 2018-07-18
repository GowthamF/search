package lk.sliit.mad.search;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    AutoCompleteTextView fromtxt;
    AutoCompleteTextView totxt;

    ArrayList<String>locations=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // fromtxt=(EditText) findViewById(R.id.direction_header_from_text);
        fromtxt= (AutoCompleteTextView) findViewById(R.id.direction_header_from_text);
        totxt= (AutoCompleteTextView) findViewById(R.id.direction_header_to_text);
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

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,locations);

        fromtxt.setAdapter(adapter);
        totxt.setAdapter(adapter);



    }

    public void search(View view)
    {
      //  totxt=(AutoCompleteTextView) findViewById(R.id.direction_header_to_text);
       // fromtxt=(AutoCompleteTextView) findViewById(R.id.direction_header_from_text);
        Intent intent=new Intent(this,PathActivity.class);
       // intent.putExtra("from",fromtxt.getText().toString());
        String to=totxt.getText().toString();
        String from=fromtxt.getText().toString();
        intent.putExtra("to",to);
        intent.putExtra("from",from);
        startActivity(intent);


        finish();


    }



}
