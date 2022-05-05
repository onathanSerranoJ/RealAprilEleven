package com.example.realaprileleven;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int numDucks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void upClick (View v)
    {
        Toast.makeText(this,"You Clicked the Up Button", Toast.LENGTH_SHORT).show();
        numDucks++;
        updateTextView();
        //Log.i("info","DOES THIS MESSAGE WORK??!!!!!");
    }//end count up

    public void downClick (View v)
    {
        Toast.makeText(this,"You Clicked the Down Button", Toast.LENGTH_SHORT).show();
        numDucks--;
        updateTextView();
        //Log.i("info","DOES THIS MESSAGE WORK??!!!!!");
    }//end count down

    public void openDialog(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm reset Count");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(MainActivity.this,"Yep sir", Toast.LENGTH_SHORT).show();
                numDucks = 0;
                //need to update text again
                updateTextView();
            }//end onClick overriden method
        });//end set positive or "yes" button handler

        builder.setNegativeButton("Not even", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                //method is empty because all it needs to do is close the dialog
            }//end onClick
        });//end set negative or "no" Button handler

        AlertDialog resetDialog = builder.create();
        resetDialog.show();
    }//end open reset dialog handler

    public void updateTextView()
    {
        TextView counterView = (TextView) findViewById(R.id.counterView);
        counterView.setText("Number of little ghosts: " + numDucks);
    }

}//end mainActivity class