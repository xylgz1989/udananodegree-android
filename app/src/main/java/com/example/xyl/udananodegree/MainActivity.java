package com.example.xyl.udananodegree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btn_movie;
    private Button btn_stock;
    private Button btn_reader;
    private Button btn_news;
    private Button btn_grad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btn_news = (Button) findViewById(R.id.btn_news);
        btn_stock = (Button) findViewById(R.id.btn_stock);
        btn_reader = (Button) findViewById(R.id.btn_reader);
        btn_movie = (Button) findViewById(R.id.btn_hot_movie);
        btn_grad = (Button) findViewById(R.id.btn_grad_design);

        btn_grad.setOnClickListener(this);
        btn_news.setOnClickListener(this);
        btn_reader.setOnClickListener(this);
        btn_stock.setOnClickListener(this);
        btn_movie.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuffer sbuf = new StringBuffer();
        sbuf.append("启动应用：");
        switch (v.getId()){
            case R.id.btn_news:
                sbuf.append(getString(R.string.news));
                break;
            case R.id.btn_hot_movie:
                sbuf.append(getString(R.string.hot_movie));
                break;
            case R.id.btn_reader:
                sbuf.append(getString(R.string.xyz_reader));
                break;
            case R.id.btn_stock:
                sbuf.append(getString(R.string.stock));
                break;
            case R.id.btn_grad_design:
                sbuf.append(getString(R.string.grad_design));
                break;

        }
        Toast.makeText(this,sbuf.toString(),Toast.LENGTH_SHORT).show();
    }
}
