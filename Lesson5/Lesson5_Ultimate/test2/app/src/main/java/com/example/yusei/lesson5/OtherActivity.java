package com.example.yusei.lesson5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.yusei.lesson5.R.id.otherTextview;
import static com.example.yusei.lesson5.R.layout.activity_other;

/**
 * Created by Yusei on 2017/4/2.
 */

public class OtherActivity extends AppCompatActivity{
    private Intent intent;
    private Bundle bundle;
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(activity_other);
        Bundle bundle = this.getIntent().getExtras();
        String ans = bundle.getString("ans");
        String setText = "";
        if(ans.equals("2")){
            setText = "正确";
        }else{
            setText = "错误";
        }
        TextView tv1 = (TextView) findViewById(otherTextview);
        tv1.setText("你的答案是："+setText);

        Button btn3_back = (Button) findViewById(R.id.back);
        btn3_back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
			/* 返回result 回上一个activity */
                OtherActivity.this.setResult(RESULT_OK, intent);
			/* 结束这个activity */
                OtherActivity.this.finish();
            }
        });

    }


}
