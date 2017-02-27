package com.example.federico.santodomingolive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    EditText rname, rcontrasena, rcontrasena2, remail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        rname = (EditText)findViewById(R.id.rname);


    }
}
