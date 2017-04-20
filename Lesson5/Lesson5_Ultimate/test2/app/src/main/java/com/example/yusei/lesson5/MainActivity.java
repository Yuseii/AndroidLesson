package com.example.yusei.lesson5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.yusei.lesson5.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {

    RadioButton r1 = null;
    RadioButton r2 = null;
    RadioButton r3 = null;
    RadioButton r4 = null;
    RadioGroup radioGroup = null;
    RadioButton currentRadioButton = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        // 获得单选按钮组

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        // 获得单选按钮
        r1 = (RadioButton) findViewById(R.id.a);
        r2 = (RadioButton) findViewById(R.id.b);
        r3 = (RadioButton) findViewById(R.id.c);
        r4 = (RadioButton) findViewById(R.id.d);
        r1.setClickable(true);

        // 监听单选按钮
        radioGroup.setOnCheckedChangeListener(mChangeRadio);

        Button btn1_sure = (Button) findViewById(R.id.sure);
        Button btn2_cancel = (Button) findViewById(R.id.cancel);
        btn1_sure.setOnClickListener(new btn1_sure());
        btn2_cancel.setOnClickListener(new btn2_cancel());
    }


    class btn1_sure implements OnClickListener {
        @Override
        public void onClick(View v) {
            String ans = "";
            if(r1.isChecked()){
                ans = "1";
            }else if(r2.isChecked()){
                ans = "2";
            }else if(r3.isChecked()){
                ans = "3";
            }else if(r4.isChecked()){
                ans = "4";
            }
            Intent intent = new Intent();
            //设置Intent对象要启动的Activity
            intent.setClass(MainActivity.this, OtherActivity.class);
			/* new 一个Bundle对象，并将要传递的数据传入 */
            Bundle bundle = new Bundle();
            bundle.putString("ans", ans);
			/* 将Bundle 对象assign 给Intent */
            intent.putExtras(bundle);

            //通过Intent对象启动另外一个Activity
            MainActivity.this.startActivity(intent);
        }


    }//点击确认键触发判断


    class btn2_cancel implements OnClickListener {
        public void onClick(View v) {
            radioGroup.clearCheck();
            setTitle("Lesson5 xml布局测试");
        }
    }//把radioGroup重置和把标题重置


    private RadioGroup.OnCheckedChangeListener mChangeRadio = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == r1.getId()) {
                // 获得按钮的名称
                currentRadioButton = r1;
            }
            else if (checkedId == r2.getId()) {
                currentRadioButton = r2;
            }
            else if (checkedId == r3.getId()) {
                currentRadioButton = r3;
            }
            else if (checkedId == r4.getId()) {

                currentRadioButton = r4;
            }
        }

    };//注意一下格式


}












//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button sure = (Button) findViewById(R.id.sure);
//        sure.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//
//            }
//        });
//    }





//public class MainActivity extends AppCompatActivity {
//
//
//    RadioButton r1 = null;
//    RadioButton r2 = null;
//    RadioButton r3 = null;
//    RadioButton r4 = null;
//    RadioGroup radioGroup = null;
//    RadioButton currentRadioButton = null;
//
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
//
//
//        r1 = (RadioButton) findViewById(R.id.a);
//        r2 = (RadioButton) findViewById(R.id.b);
//        r3 = (RadioButton) findViewById(R.id.c);
//        r4 = (RadioButton) findViewById(R.id.d);
//        r1.setClickable(true);
//
//        s
//
//
//
//
//
//    }
//
//
//
//}
