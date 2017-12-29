package com.mars.android1229;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView  tv = (TextView)findViewById(R.id.textView);
        Intent it = getIntent();//是用Intent送過來的 要先接收
        String data = it.getStringExtra(Intent.EXTRA_TEXT);//接收到之後可以用getStringExtra()取出,Intent.EXTRA_TEXT是傳送頁的代號
        tv.setText(data);//


    }
}
