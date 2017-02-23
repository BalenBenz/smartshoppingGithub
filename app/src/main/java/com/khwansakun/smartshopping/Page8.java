package com.khwansakun.smartshopping;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page8 extends AppCompatActivity {

    protected void onCreate (Bundle SevedInstantStart){
        super.onCreate(SevedInstantStart);
        setContentView(R.layout.page8);
    }

    public void OnClickReturn (View view){
        Button btn_start = (Button) findViewById(R.id.button16);
        Intent intent = new Intent(Page8.this,Page7.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button17);
        Intent intent = new Intent(Page8.this,Page9.class);
        startActivity(intent);
    }

}
