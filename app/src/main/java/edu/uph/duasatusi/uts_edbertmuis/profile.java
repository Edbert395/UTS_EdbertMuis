package edu.uph.duasatusi.uts_edbertmuis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    Button submit;

    private EditText id, nama, tahun, jurusan, aktif, kampus;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        id = findViewById(R.id.id);
        nama = findViewById(R.id.nama);
        tahun = findViewById(R.id.tahun);
        jurusan = findViewById(R.id.jurusan);
        aktif = findViewById(R.id.aktif);
        kampus = findViewById(R.id.kampus);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this, MainActivity.class);
                startActivity(intent);

                showToast();
            }
        });
    }

    private void showToast() {
        String ID = id.getText().toString();
        String name = nama.getText().toString();
        String year = tahun.getText().toString();
        String major = jurusan.getText().toString();
        String active = aktif.getText().toString();
        String campus = kampus.getText().toString();

        String message = "Student ID: " + ID + "| Nama: " + name + "| Tahun: " + year +
                "| Jurusan: " + major + "| Status: " + active + "| Kampus: " + campus;

        Toast toast = Toast.makeText(profile.this, message, Toast.LENGTH_LONG);
        View toastView = toast.getView();

        toastView.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        toast.show();
    }
}