package com.example.federico.santodomingolive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText eUsuario, ePassword;
    Button bIniciar;
    TextView tRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eUsuario=(EditText)findViewById(R.id.loname);
        ePassword=(EditText)findViewById(R.id.locontrasena);
        bIniciar=(Button)findViewById(R.id.loiniciars);
        tRegistrarse=(TextView)findViewById(R.id.loregistrarse);

        tRegistrarse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                /*intent.putExtra("username",eUsuario.getText().toString());
                intent.putExtra("contraseña",ePassword.getText().toString());*/
                startActivityForResult(intent,1234);
            }
        });

        /*bIniciar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);*/

    }
}
