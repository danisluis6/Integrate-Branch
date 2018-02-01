package io.branch.zaraapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        name = getIntent().getStringExtra("usename");
        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
    }
}
