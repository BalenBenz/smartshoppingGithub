package com.khwansakun.smartshopping;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page10 extends AppCompatActivity {

    protected void onCreate(Bundle SevedInstantStart) {
        super.onCreate(SevedInstantStart);
        setContentView(R.layout.page10);
    }

    public void OnClickReturn(View view) {
        Button btn_start = (Button) findViewById(R.id.button20);
        Intent intent = new Intent(Page10.this, Page9.class);
        startActivity(intent);
    }

}
