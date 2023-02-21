package P3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("myFirstApp","I am onCreate 2");
        Toast.makeText(getApplicationContext(), "I am onCreate 2",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("myFirstApp","I am onStart 2");
        Toast.makeText(getApplicationContext(), "I am onStart 2",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.i("myFirstApp", "I am onResume 2");
        Toast.makeText(getApplicationContext(), "I am onResume 2",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.i("myFirstApp", "I am onPause 2");
        Toast.makeText(getApplicationContext(), "I am onPause 2",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.i("myFirstApp", " I am onStop 2");
        Toast.makeText(getApplicationContext(), "I am onStop 2",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.i("myFirstApp", " I am onDestroy 2");
        Toast.makeText(getApplicationContext(), "I am onDestroy 2",Toast.LENGTH_SHORT).show();
    }


}