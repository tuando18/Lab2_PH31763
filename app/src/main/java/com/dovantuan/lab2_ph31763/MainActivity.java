package com.dovantuan.lab2_ph31763;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    Button btnbai23;
    EditText edtHoten;
    TextView tvKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intit();
        addListener();
    }
    private void intit(){
        btnClick = findViewById(R.id.btn_click);
        btnbai23 = findViewById(R.id.btn_bai23);
        edtHoten = findViewById(R.id.edt_hoten);
        tvKq = findViewById(R.id.tv_result);
    }
    private void addListener(){
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoten = edtHoten.getText().toString();
                tvKq.setText(hoten);
            }
        });
        btnbai23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Bai2Activity.class);
                startActivity(intent);
            }
        });
    }
}