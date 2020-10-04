package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showreult(View view) {
        double f1, f2;
        double Res = 0.0;
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        TextView res = findViewById(R.id.result);
        CheckBox add = findViewById(R.id.add);
        CheckBox sub = findViewById(R.id.sub);
        CheckBox div = findViewById(R.id.div);
        CheckBox mul = findViewById(R.id.mul);
        f1 = Double.parseDouble(input1.getText().toString());
        f2 = Double.parseDouble(input2.getText().toString());
        if(add.isChecked() == true){
            Res = f1 + f2;
        }
        if(sub.isChecked() == true){
            Res = f1 - f2;
        }
        if(div.isChecked() == true){
            if(f2 == 0.0) {
                res.setText("division by zero is not possible"); }
            else {
                Res = f1 / f2;
            }
        }
        if(mul.isChecked() == true){
            Res = f1 * f2;
        }
        res.setText(Double.toString(Res));
        ;
        res.setText(String.valueOf(Res));
    }

}