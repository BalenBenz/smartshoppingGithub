package com.khwansakun.smartshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.util.Log;
import android.widget.EditText;

import java.net.URLEncoder;



public class Page2 extends AppCompatActivity {
    final String myTag = "DocsUpload";
    private EditText edt_column1;
    private EditText edt_column2;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        edt_column1 = (EditText) findViewById(R.id.editText1);
        edt_column2 = (EditText) findViewById(R.id.editText2);
        btnSubmit = (Button) findViewById(R.id.button2);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        postData();

                    }
                });
                t.start();
            }
        });
    }

    public void OnClickReturn (View view){
        Button btn_Start = (Button)findViewById(R.id.button3);
        Intent intent = new Intent(Page2.this,MainActivity.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button4);
        Intent intent = new Intent(Page2.this,Page3.class);
        startActivity(intent);
    }



    private void postData() {
        String fullUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfPEqtqLpvlMsKJRI7nawRVzLxl_QjFAavPiXp1-U2LlaHrUg/formResponse";
        HttpRequest1 mReq = new HttpRequest1();

        String col1 = edt_column1.getText().toString();
        String col2 = edt_column2.getText().toString();
        //entry_19656335, entry_1596933387 => id google form input
        String data = "entry_19656335=" + URLEncoder.encode(col1) + "&" +
                "entry_1596933387=" + URLEncoder.encode(col2);
        String response = mReq.sendPost(fullUrl, data);
//        Log.i(myTag, response);
        Log.d("", "postData: " + response );
    }
}

