package io.branch.zaraapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, getIntent().getStringExtra("usename"), Toast.LENGTH_LONG).show();
    }
}
