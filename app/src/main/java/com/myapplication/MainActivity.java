package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;

    public MainActivity(Button btn1, Button btn2, Button btn3, Button btn4) {
        this.btn1 = btn1;
        this.btn2 = btn2;
        this.btn3 = btn3;
        this.btn4 = btn4;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentB fragmentB = FragmentB.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.container2,fragmentB).commit();
        
        inView();

    }

    private void inView() {
        btn1.findViewById(R.id.btn1);
        btn2.findViewById(R.id.btn2);
        btn3.findViewById(R.id.btn3);
        btn4.findViewById(R.id.btn4);

        btn1.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                FragmentA fragmentA = FragmentA.newInstance();
                getSupportFragmentManager().beginTransaction().add(R.id.container1,fragmentA).commit();
                break;
            case R.id.btn2:

                break;
            case R.id.btn3:

                break;
            case R.id.btn4:

            default:
                break;
        }
    }
}