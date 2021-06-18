package com.triforce.qrcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView txtname, txtadr, txturl, txtnote, txtbday, txtemail, txtphone, txtcmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtname = findViewById(R.id.txtname);
        txtadr = findViewById(R.id.txtadr);
        txturl = findViewById(R.id.txturl);
        txtnote = findViewById(R.id.txtnote);
        txtbday = findViewById(R.id.txtbday);
        txtemail = findViewById(R.id.txtemail);
        txtphone = findViewById(R.id.txtphone);
        txtcmp = findViewById(R.id.txtcmp);

        Intent intent = getIntent();

        String qrvalue = intent.getStringExtra("data");

        String mename = qrvalue.split(";")[0];
        String meadr = qrvalue.split(";")[1];
        String meurl = qrvalue.split(";")[2];
        String menote = qrvalue.split(";")[3];
        String mebday = qrvalue.split(";")[4];
        String meemail = qrvalue.split(";")[5];
        String mephone = qrvalue.split(";")[6];
        String mecmp = qrvalue.split(";")[7];

        String name = mename.split(":")[2];
        String adr = meadr.split(":")[1];
        String url = meurl.split(":")[1];
        String note = menote.split(":")[1];
        String bday = mebday.split(":")[1];
        String email = meemail.split(":")[1];
        String phone = mephone.split(":")[1];
        String cmp = mecmp.split(":")[1];

        txtname.setText(name);
        txtadr.setText(adr);
        txturl.setText(url);
        txtnote.setText(note);
        txtbday.setText(bday);
        txtemail.setText(email);
        txtphone.setText(phone);
        txtcmp.setText(cmp);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);
    }
}