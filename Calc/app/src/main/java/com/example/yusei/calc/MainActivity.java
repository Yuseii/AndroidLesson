package com.example.yusei.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private double n1 = 0.0, n2 = 0.0, result = 0.0;
    private String opt = " ";
    //设置一个标志
    private int flg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //键盘按钮0~9
        Button btn_0 = (Button) findViewById(R.id.button_0);
        Button btn_1 = (Button) findViewById(R.id.button_1);
        Button btn_2 = (Button) findViewById(R.id.button_2);
        Button btn_3 = (Button) findViewById(R.id.button_3);
        Button btn_4 = (Button) findViewById(R.id.button_4);
        Button btn_5 = (Button) findViewById(R.id.button_5);
        Button btn_6 = (Button) findViewById(R.id.button_6);
        Button btn_7 = (Button) findViewById(R.id.button_7);
        Button btn_8 = (Button) findViewById(R.id.button_8);
        Button btn_9 = (Button) findViewById(R.id.button_9);
        //功能按钮
        Button btn_c = (Button) findViewById(R.id.button_C);
        Button btn_sp = (Button) findViewById(R.id.button_sp);
        Button btn_mod = (Button) findViewById(R.id.button_percent);     //百分比
        Button btn_dev = (Button) findViewById(R.id.button_devided);     //除法
        Button btn_mul = (Button) findViewById(R.id.button_multiply);    //乘法
        Button btn_sub = (Button) findViewById(R.id.button_sub);         //减法
        Button btn_add = (Button) findViewById(R.id.button_add);         //加法
        Button btn_equ = (Button) findViewById(R.id.button_equal);       //等于
        Button btn_del = (Button) findViewById(R.id.button_del);         //小数点

        //设置按键监听
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_sp.setOnClickListener(this);
        btn_mod.setOnClickListener(this);
        btn_dev.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_del.setOnClickListener(this);
    }
    @Override

    //把通过按键输入的数据传到TextView中
    public void onClick(View v) {
        Button btn = (Button) v;
        int i = 0;
        TextView tv = (TextView)findViewById(R.id.Screen);
        //获得TextView的内容
        String text = tv.getText().toString();
//第一位为0的话，要先删除掉
//        if(text.equals("0")){
//            text="";
//        }
        switch (btn.getId()){
            case R.id.button_0:{
                if(text.equals("0")){
                    break;
                }
                tv.setText(text+"0");
                break;
            }
            case R.id.button_1:{
                if(text.equals("0"))
                   text="";                 //第一位为0的话，要先删除掉
                tv.setText(text+"1");
                break;
            }
            case R.id.button_2:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"2");
                break;
            }
            case R.id.button_3:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"3");
                break;
            }
            case R.id.button_4:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"4");
                break;
            }
            case R.id.button_5:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"5");
                break;
            }
            case R.id.button_6:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"6");
                break;
            }
            case R.id.button_7:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"7");
                break;
            }
            case R.id.button_8:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"8");
                break;
            }
            case R.id.button_9:{
                if(text.equals("0"))
                    text="";
                tv.setText(text+"9");
                break;
            }
            case R.id.button_C:{
                tv.setText("0");
                n1 = 0.0;
                n2 = 0.0;
                result = 0.0;
                opt = " ";
                break;
            }
            case R.id.button_del:{
                i = text.indexOf(".");
                //检查小数点的个数，如果已经有小数点，则不再添加
                if(i == -1){
                    tv.setText(text+".");
                    break;
                }
                else{
                    break;
                }
            }
            //正负号变换
            case R.id.button_sp:{
                n1 = Double.parseDouble(text);
                result = -n1;
                tv.setText(String.valueOf(result));
                break;
            }
            //百分号作用：把一个数变成百分比
            case R.id.button_percent:{
                if (flg == 1)
                    break;
                    n1 = Double.parseDouble(text);
                    result = n1/100;
                    tv.setText(String.valueOf(result));
                    break;
            }
            case R.id.button_add:{
                if (flg == 1)
                    break;
                flg = 1;
                opt = "+";
                tv.setText("");
                n1 = Double.parseDouble(text);
                break;
            }
            case R.id.button_sub:{
                if (flg == 1)
                    break;
                flg = 1;
                n1 = Double.parseDouble(text);
                opt = "-";
                tv.setText("");
                break;
            }
            case R.id.button_multiply:{
                if (flg == 1)
                    break;
                flg = 1;
                n1 = Double.parseDouble(text);
                opt = "*";
                tv.setText("");
                break;
            }
            case R.id.button_devided:{
                if (flg == 1)
                    break;
                flg = 1;
                n1 = Double.parseDouble(text);
                opt = "/";
                tv.setText("");
                break;
            }
            case R.id.button_equal:{
                //当用户输入多个运算符的时候，只会按第一个运算符进行运算
                flg = 0;
                if(text.equals("")){
                    break;
                }
                n2 = Double.parseDouble(text);
                if (opt.equals("+")){
                    result = n1 + n2;
                    tv.setText(String.valueOf(result));
                    n1 = 0.0;
                    n2 = 0.0;
                    result = 0.0;
                    opt = " ";
                    break;

                }else if(opt.equals("-")){
                    result = n1 - n2;
                    tv.setText(String.valueOf(result));
                    n1 = 0.0;
                    n2 = 0.0;
                    result = 0.0;
                    opt = " ";
                    break;
                }else if(opt.equals("*")) {
                    result = n1 * n2;
                    tv.setText(String.valueOf(result));
                    n1 = 0.0;
                    n2 = 0.0;
                    result = 0.0;
                    opt = " ";
                    break;
                }else if(opt.equals("/")) {
                    result = n1 / n2;
                    text = String.valueOf(result);
                    if(text.indexOf(".")!=-1 && text.length()>=8 )
                        text = text.substring(0,8);
                    tv.setText(text);
                    n1 = 0.0;
                    n2 = 0.0;
                    result = 0.0;
                    flg = 0;
                    opt = " ";
                    break;
                }else if(opt.equals(" ")){
                    break;
                }
            }
        }
    }
}
