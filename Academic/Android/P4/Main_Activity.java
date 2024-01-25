package com.example.myapplication4datareceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView im1;
    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        im1 = findViewById(R.id.imgview1);

        Intent receivedIntent =  getIntent();
        String receivedAction = receivedIntent.getAction();
        String receivedType = receivedIntent.getType();

        if(receivedAction.equals((Intent.ACTION_SEND))){
            Toast.makeText(getApplicationContext(),"Content is being shared", Toast.LENGTH_LONG).show();
            if(receivedType.startsWith("text/")){
                im1.setVisibility(View.GONE);
                String receivedText = receivedIntent.getStringExtra((Intent.EXTRA_TEXT));
                if(receivedText != null){
                    tv1.setText(receivedText);
                }
            }

            else if(receivedType.startsWith("image/")){
                tv1.setVisibility(View.GONE);
                Uri receivedUri = (Uri)receivedIntent.getParcelableExtra(Intent.EXTRA_STREAM);
                if(receivedUri !=null){
                    im1.setImageURI(receivedUri);
                     im1.setContentDescription("This is pic description");
                }
            }
        }

        else if(receivedAction.equals(Intent.ACTION_MAIN)){
            Toast.makeText(getApplicationContext(), "App launched directly", Toast.LENGTH_SHORT).show();
            tv1.setText("Nothing shared");
        }

    }
}