package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout=findViewById(R.id.cons_lay);

    }
    public void onClick(View view)
    {
        Snackbar snack=Snackbar.make(constraintLayout,"Hello From Snack",Snackbar.LENGTH_LONG);
        snack.show();
    }
}
