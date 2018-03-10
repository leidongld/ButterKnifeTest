package com.example.leidong.butterknifetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textview)
    TextView textView;

    @BindView(R.id.button)
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textView.setText("好好学习");
    }

    @OnClick(R.id.button)
    public void clickBtn(){
        textView.setText("天天向上");
        button.setText("Button");
        Toast.makeText(MainActivity.this, "好好学习，天天向上", Toast.LENGTH_LONG).show();
    }
}
