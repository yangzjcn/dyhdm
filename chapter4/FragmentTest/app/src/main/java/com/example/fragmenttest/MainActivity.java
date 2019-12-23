package com.example.fragmenttest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        replaceFragment(new RightFragment());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    /*private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }*/

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
//                replaceFragment(new AnotherRightFragment());
                break;
            default:
        }
    }
}
