package abled.semina.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SubActivity extends AppCompatActivity {

    private String TAG = "생명주기 확인";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Log.d(TAG, "onCreate: SubActivity");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: SubActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: SubActivity");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: SubActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: SubActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: SubActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: SubActivity");
    }
}