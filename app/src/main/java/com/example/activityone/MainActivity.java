package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle", "OnCreate() invoked");

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

    }
    @Override
    public void onStart(){
        super.onStart();
        Log.i("Lifecycle","onStart() invoked");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("Lifecycle","onRestart() invoked");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i("Lifecycle","onResume() invoked");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i("Lifecycle","onPause() invoked");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("Lifecycle","onStop() invoked");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("Lifecycle","onDestroy() invoked");
    }

}
