package com.mars.android1229;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //分享文字
    public  void  click1(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);//分享的Intent
        it.setType("text/plain");//設定要傳送資料的類型
        it.putExtra(Intent.EXTRA_TEXT,ed.getText().toString());//要傳送的資料代碼以及內容
        startActivity(it);
    }

    //5-36 分享圖片
    public  void  click2(View v)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);//分享的Intent
        it.setType("image/jpeg");//設定要傳送資料的類型
        Uri uri = Uri.parse("android.resource://" +
                getApplicationContext().getPackageName() + "/" + R.drawable.flower);//圖片的路徑
        it.putExtra(Intent.EXTRA_STREAM,uri);//要傳送的資料代碼以及內容
        startActivity(it);
    }


}
