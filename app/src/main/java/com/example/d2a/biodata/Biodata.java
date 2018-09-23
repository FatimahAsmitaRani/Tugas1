package com.example.d2a.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }
    public void showmap(View view) {
        Uri uri = Uri.parse("geo:-6.520177, 111.043255");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void openurl(View view) {
        Uri uri = Uri.parse("http://instagram.com/asmitrn_");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void callnumber(View view) {
        Uri uri = Uri.parse("tel:082323916475");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
}
