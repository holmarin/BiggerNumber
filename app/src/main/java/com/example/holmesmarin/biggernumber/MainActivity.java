package com.example.holmesmarin.biggernumber;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

Button button9, button11;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int min=0;
        int max=99;

        Random r = new Random();
        int n1 = r.nextInt(max-min);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setText(String.valueOf(n1));

        int n2 = r.nextInt(max-min);
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setText(String.valueOf(n2));
    }

    public void button9_click(View view ) {

        Button button9 = (Button) findViewById(R.id.button9);
        CharSequence text9 = button9.getText();
        String stext9 = text9.toString();
        int num9 = Integer.parseInt(stext9);

        Button button11 = (Button) findViewById(R.id.button11);
        CharSequence text11 = button11.getText();
        String stext11 = text11.toString();
        int num11 = Integer.parseInt(stext11);

        if (num9 > num11){
            Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        }

    }

    public void button11_click(View view) {

        Button button9 = (Button) findViewById(R.id.button9);
        CharSequence text9 = button9.getText();
        String stext9 = text9.toString();
        int num9 = Integer.parseInt(stext9);

        Button button11 = (Button) findViewById(R.id.button11);
        CharSequence text11 = button11.getText();
        String stext11 = text11.toString();
        int num11 = Integer.parseInt(stext11);

        if (num11 > num9){
            Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        }

    }

    public void jugar_click(View view) {
        int min=0;
        int max=99;

        Random r = new Random();
        int n1 = r.nextInt(max-min);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setText(String.valueOf(n1));

        int n2 = r.nextInt(max-min);
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setText(String.valueOf(n2));
    }
    public void salir_click(View view) {
        System.exit(0);
    }
}
