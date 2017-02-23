package com.khwansakun.smartshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URLEncoder;


public class Page3 extends AppCompatActivity {
    final String myTag = "DocsUpload";
    private EditText edt_column1;
    private EditText edt_column2;
    private Button btnSubmit;
    private TextView List;
    private TextView Num;


    protected void onCreate (Bundle sevedInstantState){
        super.onCreate(sevedInstantState);
        setContentView(R.layout.page3);

        edt_column1 = (EditText) findViewById(R.id.editText3);
        edt_column2 = (EditText) findViewById(R.id.editText4);
        btnSubmit = (Button) findViewById(R.id.button3);

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
        Button btn_Start = (Button)findViewById(R.id.button6);
        Intent intent = new Intent(Page3.this,Page2.class);
        startActivity(intent);
    }

    public void OnClickNext (View view){
        Button btn_Start = (Button)findViewById(R.id.button7);
        Intent intent = new Intent(Page3.this,Page4.class);
        startActivity(intent);
    }

    private void postData() {
        String fullUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfPEqtqLpvlMsKJRI7nawRVzLxl_QjFAavPiXp1-U2LlaHrUg/formResponse";
        HttpRequest1 mReq = new HttpRequest1();

        String col1 = edt_column1.getText().toString();
        String col2 = edt_column2.getText().toString();
        //entry_588240746, entry_857927652 => id google form input
        String data = "entry_1882254936=" + URLEncoder.encode(col1) + "&" +
                "entry_1836106426=" + URLEncoder.encode(col2);
        String response = mReq.sendPost(fullUrl, data);
//        Log.i(myTag, response);
        Log.d("", "postData: " + response );
    }

    public TextView getList(){
        return this.List;
    }

    public TextView getNum(){
        return this.Num;
    }

    public void setList(TextView list){
        this.List = List;
    }

    public void  setNum(TextView num){
        this.Num = Num;
    }

}
