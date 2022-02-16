package com.example.catchcrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Dialog levelDialog;
    public Button butonbtc;
    public Button butonbnb;
    public Button butondoge;
    //public int level;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start(View view){
        levelDialog  = new Dialog(this);
        WindowManager.LayoutParams params = new WindowManager.LayoutParams();
        params.copyFrom(levelDialog.getWindow().getAttributes());

        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height=WindowManager.LayoutParams.MATCH_PARENT;


        levelDialog.setContentView(R.layout.customdialogforlevels);

        butonbnb = (Button) levelDialog.findViewById(R.id.butonbnb);
        butonbtc = (Button) levelDialog.findViewById(R.id.butonbtc);
        butondoge = (Button) levelDialog.findViewById(R.id.butondoge);

        butonbnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // level=1;
                SystemClock.sleep(100);

                Intent intent = new Intent(MainActivity.this, playScreenBnb.class);
                startActivity(intent);
            }
        });
        butonbtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SystemClock.sleep(100);
               // levelDialog.cancel();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        butondoge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SystemClock.sleep(100);

                Intent intent = new Intent(MainActivity.this, playScreenDoge.class);
                startActivity(intent);
            }
        });

        levelDialog.getWindow().getAttributes().windowAnimations=R.anim.animfordialog;
        levelDialog.getWindow().setAttributes(params);
        levelDialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        levelDialog.show();



    }

    public void exit(View view){
        finish();
        System.exit(0);

    }

}