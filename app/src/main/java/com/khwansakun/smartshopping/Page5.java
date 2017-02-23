package com.khwansakun.smartshopping;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page5 extends AppCompatActivity {

    protected void onCreate (Bundle SevedInstantStart){
        super.onCreate(SevedInstantStart);
        setContentView(R.layout.page5);
    }

    public void OnClickReturn (View view){
        Button btn_start = (Button) findViewById(R.id.button10);
        Intent intent = new Intent(Page5.this,Page4.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button11);
        Intent intent = new Intent(Page5.this,Page6.class);
        startActivity(intent);
    }

}
