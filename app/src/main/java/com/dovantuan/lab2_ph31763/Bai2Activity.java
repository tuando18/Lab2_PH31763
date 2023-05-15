package com.dovantuan.lab2_ph31763;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bai2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2_main);

        Button btnClick = findViewById(R.id.btn_click);
        EditText edtHoten = findViewById(R.id.edt_hoten);
        EditText edtMssv = findViewById(R.id.edt_mssv);
        EditText edtTuoi = findViewById(R.id.edt_tuoi);
        RadioButton rdonam = findViewById(R.id.rdoMale);
        RadioButton rdonu = findViewById(R.id.rdoFemale);
        CheckBox chkđb = findViewById(R.id.chk_db);
        CheckBox chkgame = findViewById(R.id.chk_game);
        TextView tvKq = findViewById(R.id.tv_result);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tvKq.setText("Tên của bạn là: "+edtHoten.getText().toString().trim()+"\n MSSV của bạn là: "+edtMssv.getText().toString().trim()+"\n Tuổi của bạn là: "+edtTuoi.getText().toString().trim());
////                tvKq.setText("MSSV của bạn là: "+edtMssv.getText().toString().trim());
////                tvKq.setText("Tuổi của bạn là: "+edtTuoi.getText().toString().trim());
////                String hoten = edtHoten.getText().toString();
////                tvKq.setText(hoten);
                //Lấy thông tin tên tuổi mssv
                String name = edtHoten.getText().toString();
                String mssv = edtMssv.getText().toString();
                String age = edtTuoi.getText().toString();

                //Lấy tt giới tính
                String gender = rdonam.isChecked()
                        ? rdonam.getText().toString()
                        : rdonu.isChecked()
                        ? rdonu.getText().toString()
                        : "Chưa lựa chọn giới tính!";

                //Lấy tt sở thích
                String love = chkđb.isChecked() && chkgame.isChecked()
                        ? "Đá bóng và Chơi game"
                        : chkđb.isChecked()
                        ? chkđb.getText().toString()
                        : chkgame.isChecked()
                        ? chkgame.getText().toString()
                        : "Không thích gì cả!";

                //
                tvKq.setText("Tôi tên: " + name + "\n"
                        + "MSSV: " + mssv + "\n"
                        + "Tuổi: " + age + "\n"
                        + "Giới tính: " + gender + "\n"
                        + "Sở thích: " + love );

            }
        });
    }
}
