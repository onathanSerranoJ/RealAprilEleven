package com.example.realaprileleven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        configureBackButton();
    }

    private void configureBackButton()
    {
        Button backButton = (Button) findViewById(R.id.Scn2Backbutton);
        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }//end nested inner method
        });//end Listener method
    }//end button configuration
}//end SecondActivity class