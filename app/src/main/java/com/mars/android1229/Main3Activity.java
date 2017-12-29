package com.mars.android1229;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView iv = (ImageView)findViewById(R.id.imageView);//ImageView放圖片的位置
        Intent it = getIntent();//接收傳送頁面的Intent
        String uriString = it.getExtras().get(Intent.EXTRA_STREAM).toString();//取得圖片的路徑
        iv.setImageURI(Uri.parse(uriString));//將路徑放到setImageURI


    }
}
