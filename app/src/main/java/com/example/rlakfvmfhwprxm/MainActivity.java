package com.example.rlakfvmfhwprxm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView resulttext;
    String calculation,btn_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height=findViewById(R.id.height);
        resulttext=findViewById(R.id.result);

    }

    public void btn_check(View v) {
        String S1=weight.getText().toString();
        String S2=height.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2)/100;

        float bmi=weightValue/(heightValue*heightValue);

        if(bmi<16){
            btn_check="저체중입니다. 조금 찌우는게 어떨까요?";
        }else if (bmi<23.0&&bmi>=18.5){
            btn_check="정상체중입니다. 최고에요 지금을 유지해주세요!!";
        }else if (bmi<25&&bmi<=23.0){
            btn_check="과제충입니다. 슬슬 다이어트를 하시는것이 어떨까요?";
        }else if (bmi<30.0&&bmi<=25.0){
            btn_check="경도비만입니다. 식단관리를 시작하세요.";
        }else if (bmi<35.0&&bmi<=30.0){
            btn_check="중정도비만입니다. 얼른 PT예약하시고 운동하러 나가세요.";
        }else{
            btn_check="고도비만입니다!!!!죽기 싫으면 운동하시고 식단관리하세요!!!";
        }
        calculation = "Result:\n\n"+bmi+"\n"+btn_check;

        resulttext.setText(calculation);
    }
}