package com.example.customdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button btn;
 EditText e1,e2;
 Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(MainActivity.this);
                View mview=getLayoutInflater().inflate(R.layout.dialog_login,null);

                e1=mview.findViewById(R.id.edtxt);
                e2=mview.findViewById(R.id.pass);
                login=mview.findViewById(R.id.btn1);

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!e1.getText().toString().isEmpty()&&!e2.getText().toString().isEmpty())
                        {
                            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this, "Please fill data", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                alertdialogbuilder.setView(mview);
                AlertDialog  diaglog=alertdialogbuilder.create();
                diaglog.show();
            }
        });
    }
}
