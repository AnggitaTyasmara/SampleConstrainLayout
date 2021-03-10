package com.example.sampleconstrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi Variabel
    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan Variabel
        btnLogin=findViewById(R.id.btSignin);

        edemail=findViewById(R.id.edEmail);

        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclick
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user
                nama = edemail.getText().toString();

                password = edpassword.getText().toString();

                String email="anggita@mail.com";
                String pass = "1216";

                if (nama.equals(email) && password.equals(pass))
                {
                    //Membuat variabel toast dan menampilkan pesan "Login Sukses"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                }
                else if (!nama.equals(email) && password.equals(pass))
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.equals(email) && !password.equals(pass))
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}