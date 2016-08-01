package com.example.dsuappacademy.dsualumniassociation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.Button;

public class ExtrasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        Button btn3 = (Button) findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                //Intent to display "Verify Degree" activity.
                Uri webPage = Uri.parse("https://nscverifications.org/welcome-to-verification-services");
                Intent intent = new Intent(Intent.ACTION_VIEW, webPage);

                if (intent.resolveActivity(getPackageManager()) != null)
                    // Start the new activity
                    startActivity(intent);
            }
        });
}}