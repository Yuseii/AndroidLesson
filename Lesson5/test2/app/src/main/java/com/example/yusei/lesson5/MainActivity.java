package com.example.yusei.lesson5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    RadioButton r1 = null;
    RadioButton r2 = null;
    RadioButton r3 = null;
    RadioButton r4 = null;
    RadioGroup radioGroup = null;
    RadioButton currentRadioButton = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            if (currentRadioButton.getText().equals("2")) {
                setTitle("那你很棒棒哦");
            } else {
                setTitle("1+1都不会吗？");
            }
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

    };
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
