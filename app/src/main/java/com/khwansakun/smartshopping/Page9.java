package com.khwansakun.smartshopping;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page9 extends AppCompatActivity {

    protected void onCreate (Bundle SevedInstantStart){
        super.onCreate(SevedInstantStart);
        setContentView(R.layout.page9);
    }

    public void OnClickReturn (View view){
        Button btn_start = (Button) findViewById(R.id.button18);
        Intent intent = new Intent(Page9.this,Page8.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button19);
        Intent intent = new Intent(Page9.this,Page10.class);
        startActivity(intent);
    }

}
