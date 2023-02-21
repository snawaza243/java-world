package P2;
// package com.example.mysecondapp;

// import androidx.appcompat.app.AppCompatActivity;

// import android.os.Bundle;
// import android.view.View;
// import android.widget.Button;
// import android.widget.EditText;
// import android.widget.Toast;
// import android.widget.TextView;
// public class MainActivity extends AppCompatActivity {
//     Button b1,b2,b3,b4;
//     EditText etv1,etv2;
    
//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         b1 = findViewById(R.id.b1);
//         b2 = findViewById(R.id.b2);
//         b3 = findViewById(R.id.b3);
//         b4 = findViewById(R.id.b4);

//         etv1 = findViewById(R.id.et1);
//         etv2 = findViewById(R.id.et2);
//     }

//     public void btnAdd(View view) {
//         String a= etv1.getText().toString();
//         String b = etv2.getText().toString();

//         int c= Integer.parseInt(a)+ Integer.parseInt(b);
//         Toast.makeText(getApplicationContext(), "Addition is " + c, Toast.LENGTH_SHORT).show();
//     }

//     public void btnSub(View view) {
//         String a= etv1.getText().toString();
//         String b = etv2.getText().toString();

//         int c= Integer.parseInt(a)- Integer.parseInt(b);
//         Toast.makeText(getApplicationContext(), "Subtraction (a-b) is " + c, Toast.LENGTH_SHORT).show();
//     }

//     public void btnMul(View view) {
//         String a= etv1.getText().toString();
//         String b = etv2.getText().toString();

//         int c= Integer.parseInt(a)* Integer.parseInt(b);
//         Toast.makeText(getApplicationContext(), "Multiplication is " + c, Toast.LENGTH_SHORT).show();
//     }

//     public void btnDiv(View view) {
//         String a= etv1.getText().toString();
//         String b = etv2.getText().toString();

//         int c= Integer.parseInt(a)/ Integer.parseInt(b);
//         Toast.makeText(getApplicationContext(), "Division (a/b) is " + c, Toast.LENGTH_SHORT).show();
//     }
// }