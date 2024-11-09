package abled.semina.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    
    private String TAG = "생명주기 확인";
    Button buttonMoveSubActivity, buttonMoveAFragment, buttonMoveBFragment;
    private final int Fragment_A = 1;
    private final int Fragment_B = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMoveSubActivity = findViewById(R.id.buttonMoveSubActivity);
        buttonMoveAFragment = findViewById(R.id.buttonMoveAFragment);
        buttonMoveBFragment = findViewById(R.id.buttonMoveBFragment);

        Intent moveToSubActivityIntent = new Intent(this, SubActivity.class);

        buttonMoveSubActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(moveToSubActivityIntent);
            }
        });
        Log.d(TAG, "onCreate: MainActivity");

        buttonMoveAFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_A);
            }
        });

        buttonMoveBFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_B);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: MainActivity");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: MainActivity");
    }


    private void FragmentView(int fragment){

        //FragmentTransactiom를 이용해 프래그먼트를 사용합니다.
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                // 첫번 째 프래그먼트 호출
                AFragment aFragment = new AFragment();
                transaction.replace(R.id.frameLayout, aFragment);
                transaction.commit();
                break;

            case 2:
                // 두번 째 프래그먼트 호출
                BFragment bFragment = new BFragment();
                transaction.replace(R.id.frameLayout, bFragment);
                transaction.commit();
                break;
        }

    }

}