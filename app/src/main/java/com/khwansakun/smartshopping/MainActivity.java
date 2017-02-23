package com.khwansakun.smartshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button ButtonInput1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //ประกาศตัวแปรประเภท TextView
        TextView textView;
        //กำหนดค่าให้ตัสแปร = id app_text
        textView = (TextView) findViewById(R.id.app_text);
    }
    public void OnClickStart (View view){
        Button btn_Start = (Button)findViewById(R.id.button1);
        Intent intent = new Intent(MainActivity.this,Page2.class);
        startActivity(intent);
    }
}
