package com.example.trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    EditText ed1,ed2;

    Button b1,b2;
    RadioGroup rbg1;
    RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button1);
        rbg1=findViewById(R.id.rgb1);
        rb1=findViewById(R.id.radioButton1);
        rb2=findViewById(R.id.radioButton2);
        rb3=findViewById(R.id.radioButton3);
        rb4=findViewById(R.id.radioButton4);
        ed1=findViewById(R.id.editText1);
        ed2=findViewById(R.id.editText2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity", "onClick: clicked");
                Toast.makeText(getApplicationContext(),ed2.getText()+" "+getApplicationContext()+" "+getBaseContext()+" "+getLocalClassName(),Toast.LENGTH_SHORT).show();
                Log.i("this"," function called from on create " +getApplication()+" "+getApplicationContext()+" "+this+" "+getBaseContext()+" "+getLocalClassName());

            }
        });



        t1.setOnClickListener(btnListener);




    }
    private   View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"anonymous function called "+getApplication()+" "+getApplicationContext()+" "+this,Toast.LENGTH_LONG).show();
            Log.i("this","anonymous function called "+getApplication()+" "+getApplicationContext()+" "+this+" "+getBaseContext()+" "+getLocalClassName());
        }
    };

    public void btnListener(View view){
        Toast.makeText(getApplicationContext(), "called via xml "+view.getId(),Toast.LENGTH_SHORT).show();
        Log.i("this","from xml function called "+getApplication()+" "+getApplicationContext()+" "+this+" "+getBaseContext()+" "+getLocalClassName());


    }


    }

