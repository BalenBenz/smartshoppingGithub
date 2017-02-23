package com.khwansakun.smartshopping;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page6 extends AppCompatActivity {

    protected void onCreate (Bundle SevedInstantStart){
        super.onCreate(SevedInstantStart);
        setContentView(R.layout.page6);
    }

    public void OnClickReturn (View view){
        Button btn_start = (Button) findViewById(R.id.button12);
        Intent intent = new Intent(Page6.this,Page5.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button13);
        Intent intent = new Intent(Page6.this,Page7.class);
        startActivity(intent);
    }

}
