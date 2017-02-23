package com.khwansakun.smartshopping;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Page4 extends AppCompatActivity {

    protected void onCreate (Bundle SevedInstantStart){
        super.onCreate(SevedInstantStart);
        setContentView(R.layout.page4);
    }

    public void OnClickReturn (View view){
        Button btn_start = (Button) findViewById(R.id.button8);
        Intent intent = new Intent(Page4.this,Page3.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button9);
        Intent intent = new Intent(Page4.this,Page5.class);
        startActivity(intent);
    }

}

