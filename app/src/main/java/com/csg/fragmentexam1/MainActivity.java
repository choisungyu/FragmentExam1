package com.csg.fragmentexam1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ColorFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ColorFragment colorFragment = ColorFragment.newInstance(Color.RED);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.linear_layout,colorFragment)
                .commit();

        findViewById(R.id.button_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorFragment.setColor(Color.YELLOW);
            }
        });

    }

    @Override
    public void onClick() {
        Toast.makeText(this, "콜백", Toast.LENGTH_SHORT).show();
    }
}
