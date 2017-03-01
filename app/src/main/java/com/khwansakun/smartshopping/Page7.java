package com.khwansakun.smartshopping;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page7 extends AppCompatActivity {

    protected void onCreate (Bundle SevedInstantStart){
        super.onCreate(SevedInstantStart);
        setContentView(R.layout.page7);
    }

    public void OnClickReturn (View view){
        Button btn_start = (Button) findViewById(R.id.button14);
        Intent intent = new Intent(Page7.this,Page6.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button15);
        Intent intent = new Intent(Page7.this,Page9.class);
        startActivity(intent);
    }

}
